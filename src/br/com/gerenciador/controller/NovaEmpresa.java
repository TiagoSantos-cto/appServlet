package br.com.gerenciador.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Empresa;

public class NovaEmpresa implements Acao{
	
	public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		System.out.println(">> Criando empresa <<");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataEmpresa);
		
		} catch (ParseException e) {
		throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);		
		
		request.setAttribute("empresa", empresa.getNome());// pendura na requisi��o enviada um atributo
		return "redirect:entrada?acao=ListaEmpresas"; //informa o servlet responsavel ao navegador	
	}

}
