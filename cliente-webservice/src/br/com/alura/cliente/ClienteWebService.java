package br.com.alura.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		
		String conteudo = Request
			.Post("http://localhost:8080/gerenciador/empresas")//endereço da requisição
			.addHeader("Accept", "application/xml") //cabeçalho, aceitando apenas Json
			.execute()//execute o post
			.returnContent()//aguarde o retorno do conteudo
			.asString();//me devolva este conteudo como String

		System.out.println(conteudo);
	}

}
