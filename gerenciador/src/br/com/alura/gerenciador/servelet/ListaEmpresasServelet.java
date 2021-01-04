package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServelet
 */

@WebServlet("/lista-empresas")
public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> listaEmpresas = Banco.getEmpresas();
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<ul>");
		
		for (Empresa empresa : listaEmpresas) {
			out.println("<li>"+ empresa.toString()+ "</li>");

			out.println("</ul>");
			out.println("</body></html>");
		}
				
	}


}
