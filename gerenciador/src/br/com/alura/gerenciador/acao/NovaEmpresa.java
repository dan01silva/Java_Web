package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response  ) throws ServletException, IOException  {
		
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
		
		request.setAttribute("empresa", empresa.getNome());

		return "redirect:ListaEmpresas";
	}
}
