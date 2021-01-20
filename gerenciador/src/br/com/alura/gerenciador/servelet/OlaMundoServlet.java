package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ola", loadOnStartup = 1)
public class OlaMundoServlet extends HttpServlet {
	
	public OlaMundoServlet() {
		System.out.println("Criando oi Mundo Servelet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá Mundo, testando primeiro Servelet");
		out.println("</body>");
		out.println("</html>");

		System.out.println("O servelet foi chamado no servidor");
	}
}
