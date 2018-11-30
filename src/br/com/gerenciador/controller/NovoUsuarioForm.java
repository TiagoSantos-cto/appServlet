package br.com.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoUsuarioForm implements Acao{
	
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		System.out.println(">> Exibindo Cadastro <<");
		
		return "forward:formNovoUsuario.jsp";
	}

}
