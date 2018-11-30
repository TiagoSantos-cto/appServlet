<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/entrada?acao=ListaEmpresas" var="link1" />
<c:url value="/entrada?acao=Lista" var="link2" />
<c:url value="/entrada?acao=NovoUsuarioForm" var="link3" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<body>
<a href="${link1}">Entrar</a> &nbsp; &nbsp; &nbsp; 	<a href="${link3}">Cadastre-se</a>
	
	<h1>Projeto Sevlet</h1>
	<p><b>Servlet</b> é uma classe Java usada para estender as funcionalidades de um servidor. </p>
	<p>Nesta aplicação, temos um sistema de <b>Cadastro de Empresas </b> com mapeamento do protocolo http e organização de uma aplicação com JSP, Expression Language, Tech Libs, despachador de representações e redimensionamento. </p>
	
	<p> Para visualizar a lista de empresas cadastradas <a href="${link2}">clique aqui</a>.
	<br>
	<br>
	<p><b><i>Cadastre-se para acessar!</i></b> </p>
</body>
</html>