package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServelet
 */

@WebServlet("/nova-empresa")
public class NovaEmpresaServelet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Cadastro Sendo realizado...");
	
	String nomeDaEmpresa = request.getParameter("nome");
	Empresa empresa = new Empresa();
	empresa.setNome(nomeDaEmpresa);
	
	Banco banco = new Banco();
	banco.adiciona(empresa);
	
	PrintWriter out = response.getWriter();
	out.println("<html><body> A empresa "+ nomeDaEmpresa +" foi cadastrada com sucesso !</body></html>");
	}

}
