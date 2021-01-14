package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraEmpresaServelet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String idString= request.getParameter("id");
		Integer id = Integer.parseInt(idString);
		
		Empresa empresa = Banco.buscaEMpresaPelaId(id);
		System.out.println(empresa.getNome());
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

}
