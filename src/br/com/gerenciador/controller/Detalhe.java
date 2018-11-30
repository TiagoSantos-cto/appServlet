package br.com.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Empresa;

public class Detalhe implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> Exibindo Detalhe << ");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();
		Empresa empresa = banco.busca(id);
		
		request.setAttribute("empresa", empresa);

		return "forward:detalhe.jsp";
	}

	
}
