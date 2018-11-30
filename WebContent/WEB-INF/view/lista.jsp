<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,br.com.gerenciador.model.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada?acao=Detalhe" var="link" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>

	<h1>Lista de Empresas</h1> 
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - &nbsp; <a href="${link}&id=${empresa.id}">Detalhe</a>
		</c:forEach>
	</ul>
<br>
<br>
<a href="/appServlet"> Voltar </a>

</body>
</html>