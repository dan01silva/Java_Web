package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEmpresaServelet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String dataString = request.getParameter("data");
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);

		Date date;
		// fortmatando dataString para DATE.util
		try {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			date = f.parse(dataString);
		} catch (ParseException e) {
			throw new ServletException("Problema com o método de PARSE na formatação da Data");
		}
		
		System.out.println("conferindo o ID da empresa alterada: " + id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEMpresaPelaId(id);
		empresa.setNome(nome);
		empresa.setData(date);
		
		
		response.sendRedirect("listaEmpresas");

	}

}
