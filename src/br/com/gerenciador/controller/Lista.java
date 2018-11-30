package br.com.gerenciador.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Empresa;

public class Lista implements Acao {

	
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(">> Listando por fora <<");
		 
		 Banco banco = new Banco();
		 List<Empresa> lista = banco.getEmpresas();

		//Pendura atributos na requisição
		request.setAttribute("empresas", lista);

		return "forward:lista.jsp";
	}
}
