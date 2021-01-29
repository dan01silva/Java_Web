package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class aempresaService
 */
@WebServlet("/empresas")
public class EmpresaService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		String accept = request.getHeader("Accept");
		
		System.out.println(accept);
		
		if(accept.contains("xml")) {
			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);/*com isso personalizamos a saída para mostrar apenas o nome da classe, 
			por default ele mostra o full code file name da classe*/ 
			
			String xml = xstream.toXML(empresas);
			response.setContentType("application/xml");
			response.getWriter().print(xml);
			
		} else if(accept.endsWith("json")) {
			Gson gson = new Gson();//Instanciando Json
			String json = gson.toJson(empresas);//retorna o objeto no formato String
			
			response.setContentType("application/json");//Cabeãlho ! nele é informado qual tipo de conteudo está sendo enviado.
			response.getWriter().print(json);//trazendo método que sabe devolver String Writter e o PRINT que sabe imprimir
			
		}else {
			response.setContentType("application/json");
			response.getWriter().print("{message : 'no content'}");
		}
	
		

		
	}
}
