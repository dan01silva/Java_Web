package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServelet
 */

@WebServlet("/novaEmpresa")
public class NovaEmpresaServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		System.out.println("Cadastro Sendo realizado...");

		String nome = request.getParameter("nome");
		String dataString = request.getParameter("data");
		
		Date date;
		// fortmatando dataString para DATE.util
		try {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			date = f.parse(dataString);
		} catch (ParseException e) {
			throw new ServletException("Problema com o método de PARSE na formatação da Data");
 		}

		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setData(date);

		Banco banco = new Banco();
		banco.adiciona(empresa);

		/**
		 * Atribuindo a função de resposta ao JSP, que rendereiza o HTML antes do
		 * servidor enviar a resposta
		 */

		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		// passando atributos dentro da request para ele ser acessível de dentro do JSP
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("data", empresa.getData());
		rd.forward(request, response);

	}

}
