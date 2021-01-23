package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa implements Acao{
	
	public String executa(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Removendo Empresa Funcionando");
		String idString= request.getParameter("id");
		Integer id = Integer.parseInt(idString);
		
		Banco.removeEmpresa(id);
		
		/**
		 * ao utilizar o método de redirecionamento de fluxo, não ultilizar barras(/) no endereço dos servelet
		 */
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
		return "forward:listaEmpresas.jsp";
	}

}
