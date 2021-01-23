package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Alterando Empresa Funcionando");
		
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
		
		return "redirect:ListaEmpresas";
	}
}
