package br.com.gerenciador.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada") Mapeado no arquivo web.xml para ordenação de execução
public class MonitoramentoFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	@Override
	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		long antes = System.currentTimeMillis();
		
		String paramAcao = request.getParameter("acao");
		chain.doFilter(request, response); //Passa adiante o fluxo de requisição e resposta para o proximo FILTRO
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da ação "+ paramAcao + ": " + (antes-depois) + " Milesegundos.");
	}

}
