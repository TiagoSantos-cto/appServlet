<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,br.com.gerenciador.model.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada?acao=RemoveEmpresa" var="link1" />
<c:url value="/entrada?acao=MostraEmpresa" var="link2" />
<c:url value="/entrada?acao=NovaEmpresaForm" var="link3" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Cadastro</title>
</head>
<body>

	 <a href="/appServlet"> Home </a> &nbsp; &nbsp;<c:import url="logout.jsp"/>  
	<br>
	<p><i>Seja Bem-vindo, <b>${usuarioLogado.login}</b>!</i></p>
	<h2> Lista de Empresas </h2> 
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 
			<a href="${link1}&id=${empresa.id}"> remover &nbsp;</a> <a href="${link2}&id=${empresa.id}"> editar </a>
			</li>
		</c:forEach>
	</ul>
<br>
<p>Para <b>cadastrar</b> uma nova empresa <a href="${link3}">clique aqui</a>. </p>

<p> Para gerar um arquivo <b>JSON</b> com os dados da lista clique aqui: <a href="/appServlet/empresasJson">Gerar JSON</a><br>
Para gerar um arquivo <b>XML</b> clique aqui: <a href="/appServlet/empresasXml">Gerar XML</a> 
</p> 

</body>
</html>