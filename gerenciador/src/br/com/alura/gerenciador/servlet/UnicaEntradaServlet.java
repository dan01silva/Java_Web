package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

/**
 * Servlet implementation class UnicaEntradaServelet
 */
//@WebServlet(urlPatterns="/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//		
//		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
//		    response.sendRedirect("entrada?acao=LoginForm");
//		    return;
//		}
		/**
		 * Repare que não precisamos mais do parâmetro acao, apenas a URL. Isso
		 * significa que devemos analisar a URL no nosso controlador para saber qual
		 * ação deveria ser chamada. O método getRequestURI(), do objeto
		 * HttpServletRequest, devolve exatamente essa informação, passada no get da url
		 * do navegador:
		 * 
		 * String url = request.getRequestURI();
		 */
		/**
		 * Usando uma representação de classes para pode instanciar todas as classes a
		 * partir de uma única chamada
		 */
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;// armazenando o Full name
		/**
		 * surround witch : try/multi-catch block
		 */
		String nome;
		try {
		    Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome 
		    Acao acao = (Acao) classe.newInstance();
		    nome = acao.executa(request, response);//define qual ação é executada
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
		    throw new ServletException(e);
		}
		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect("entrada?acao=" + tipoEEndereco[1]);
			}
		/*
		 * String nome = null; if (paramAcao.equals("ListaEmpresas")) {
		 * System.out.println("chamando Listar empresas Executa"); ListaEmpresas acao =
		 * new ListaEmpresas(); nome = acao.executa(request, response); } else if
		 * (paramAcao.equals("RemoveEmpresa")) {
		 * System.out.println("chamando Remover empresas Executa"); RemoveEmpresa remove
		 * = new RemoveEmpresa(); nome = remove.executa(request, response); } else if
		 * (paramAcao.equals("MostraEmpresa")) {
		 * System.out.println("chamando Mostrar empresas Executa"); MostraEmpresa mostra
		 * = new MostraEmpresa(); nome = mostra.executa(request, response); } else if
		 * (paramAcao.equals("AlteraEmpresa")) {
		 * System.out.println("chamando Altera empresas Executa"); AlteraEmpresa altera
		 * = new AlteraEmpresa(); nome = altera.executa(request, response); } else if
		 * (paramAcao.equals("NovaEmpresa")) {
		 * System.out.println("chamando Nova empresas Executa"); NovaEmpresa novaemp =
		 * new NovaEmpresa(); nome = novaemp.executa(request, response); } else if
		 * (paramAcao.equals("NovaEmpresaForm")) {
		 * System.out.println("chamando Nova empresas Executa"); NovaEmpresaForm
		 * novaEmpForm = new NovaEmpresaForm(); nome = novaEmpForm.executa(request,
		 * response); }
		 */
	}
}