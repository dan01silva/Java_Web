package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MonitoramentoFilter
 */
@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Monitoramento Filter");
		long comeco = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		//executa a açao "chain" = cadeia
		chain.doFilter(request, response);
		
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução da ação " + acao + " -> " + (fim - comeco));
	}
}
