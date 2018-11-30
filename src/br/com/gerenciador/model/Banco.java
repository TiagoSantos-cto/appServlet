package br.com.gerenciador.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/*
 * Banco de Dados Simulado com Lista Estática Reservada em Memória Heap 
 */
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		try {
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Empresa e1 = new Empresa();
			e1.setId(chaveSequencial++);
			e1.setNome("Microsoft Corporation");
			Date dataAbertura1 = sdf.parse("04/04/1975");
			e1.setDataAbertura(dataAbertura1);
			
			Empresa e2 = new Empresa();
			e2.setId(chaveSequencial++);
			e2.setNome("Apple Inc.");
			Date dataAbertura2 = sdf.parse("01/04/1976");
			e2.setDataAbertura(dataAbertura2);
			
			Empresa e3 = new Empresa();
			e3.setId(chaveSequencial++);
			e3.setNome("Google LLC");
			Date dataAbertura3 = sdf.parse("04/08/1998");
			e3.setDataAbertura(dataAbertura3);
			
			Empresa e4 = new Empresa();
			e4.setId(chaveSequencial++);
			e4.setNome("IBM");
			Date dataAbertura4 = sdf.parse("16/06/1911");
			e4.setDataAbertura(dataAbertura4);
			
			lista.add(e1);
			lista.add(e2);
			lista.add(e3);
			lista.add(e4);
			
			Usuario usuario = new Usuario();
			usuario.setLogin("admin");
			usuario.setSenha("0000");
				
			listaUsuarios.add(usuario);
			
			} catch (ParseException e) {
				e.printStackTrace();
		}
	}

	
	//CRUD EMPRESA
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		System.out.println(lista);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void remove(Integer id) {
		Iterator<Empresa> it = Banco.lista.iterator();

		while (it.hasNext()) {
			
			Empresa empresa = (Empresa) it.next();
			if (empresa.getId() == id) { 
				it.remove(); }

		}
	}

	public Empresa busca(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
				}
		}
		return null;
	}
	
	//CRUD USUARIO
	public Usuario existe(String login, String senha) {
	    for(Usuario usuario : listaUsuarios) {
	        if(usuario.ehIgual(login, senha)) {
	            return usuario;
	        }
	    }
	    return null;
	}

	public void adicionaUsuario(Usuario usuario) {
		System.out.println("Add Usuario: "+ usuario.getLogin());
		Banco.listaUsuarios.add(usuario);	
	}

}
