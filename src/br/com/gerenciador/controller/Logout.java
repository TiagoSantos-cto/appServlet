package br.com.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		System.out.println(">> Deslogando [...] <<");
		HttpSession session = request.getSession();
		session.invalidate(); //mata a sessao atual
		return "redirect:entrada?acao=LoginForm";

	}
}
