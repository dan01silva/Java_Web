package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresaServelet
 */
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String idString= request.getParameter("id");
		Integer id = Integer.parseInt(idString);
		
		Banco.removeEmpresa(id);
		
		/**
		 * ao utilizar o método de redirecionamento de fluxo, não ultilizar barras(/) no endereço dos servelet
		 */
		response.sendRedirect("listaEmpresas");
	}

}
