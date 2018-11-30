package br.com.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> Logando [...] <<");
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
	
		
		Banco banco = new Banco();
		Usuario usuario = banco.existe(login, senha);

		if(usuario != null) {
            System.out.println(">> Logado <<");
            HttpSession session = request.getSession();
            session.setAttribute("usuarioLogado", usuario); //guardando dados fixos na Sessão
            return "redirect:entrada?acao=ListaEmpresas";
        } else {
        	System.out.println(">> ACESSO NEGADO <<");
            return "redirect:entrada?acao=LoginForm";
        }


	}
}
