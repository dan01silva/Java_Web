package br.com.alura.gerenciador.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServelet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * Repare que n�o precisamos mais do par�metro acao, apenas a URL. 
		 * Isso significa que devemos analisar a URL no nosso controlador para saber qual a��o deveria ser chamada.
			O m�todo getRequestURI(), do objeto HttpServletRequest, devolve exatamente essa informa��o:
			
					String url = request.getRequestURI();
		 */
		String paramAcao = request.getParameter("acao");
		
		if (paramAcao.equals("ListaEmpresas")) {
			System.out.println("chamando Listar empresas Executa");	
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
		} 
		else if (paramAcao.equals("RemoveEmpresa")) {
			System.out.println("chamando Remover empresas Executa");
			RemoveEmpresa remove = new RemoveEmpresa();
			remove.executa(request, response);
		}
		else if (paramAcao.equals("MostraEmpresa")) {
			System.out.println("chamando Mostrar empresas Executa");
			MostraEmpresa mostra = new MostraEmpresa();
			mostra.executa(request, response);
		}
		else if (paramAcao.equals("AlteraEmpresa")) {
			System.out.println("chamando Altera empresas Executa");
			AlteraEmpresa altera = new AlteraEmpresa();
			altera.executa(request, response); 
		}
		else if (paramAcao.equals("NovaEmpresa")) {
			System.out.println("chamando Nova empresas Executa");
			NovaEmpresa novaemp = new NovaEmpresa();
			novaemp.executa(request, response); 
		}
		
//		String[] tipoEEndereco = nome.split(":");
//	    if(tipoEEndereco[0].equals("forward")) {
//	        RequestDispatcher rd = request.getRequestDispatcher(tipoEEndereco[1]);
//	        rd.forward(request, response);
//	    } else {
//	        response.sendRedirect(tipoEEndereco[1]);
//
//	    }
	}
}
