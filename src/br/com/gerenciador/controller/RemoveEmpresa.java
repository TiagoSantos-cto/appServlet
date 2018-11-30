package br.com.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Banco;

public class RemoveEmpresa implements Acao {
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		System.out.println(">> Removendo empresa <<");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();
		banco.remove(id);
		
		return "redirect:entrada?acao=ListaEmpresas";

	}
}
