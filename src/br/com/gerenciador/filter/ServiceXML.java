package br.com.gerenciador.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

import br.com.gerenciador.model.Banco;
import br.com.gerenciador.model.Empresa;

@WebServlet("/empresasXml")
public class ServiceXML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		XStream xstream = new XStream();
		xstream.alias("empresa", Empresa.class);// Coloca o nome da classe na tag ao inves do nome default do pacote
		String xml = xstream.toXML(empresas);
		
		response.setContentType("application/xml"); //Declaração de tipo padrão http
		response.getWriter().print(xml);//Devolve a String com o XML

	}

}
