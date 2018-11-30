package br.com.gerenciador.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Empresa;

@WebServlet("/empresasJson")
public class ServiceJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		Gson gson = new Gson();
		String json = gson.toJson(empresas);
		
		response.setContentType("application/json"); //Declaração de tipo padrão http
		response.getWriter().print(json);//Devolve a String com o Json

	}

}
