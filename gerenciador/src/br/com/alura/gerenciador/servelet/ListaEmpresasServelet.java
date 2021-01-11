package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServelet
 */

@WebServlet("/listaEmpresas")
public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		// pendurando o atrbuto junto com o request e response
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);

	}
}