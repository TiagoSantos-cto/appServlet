<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada?acao=AlteraEmpresa" var="link1" />
<c:url value="/entrada?acao=ListaEmpresas" var="link2" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de alteração</title>
</head>
<body>
	 <a href="/appServlet"> Home </a> &nbsp; &nbsp; &nbsp; <c:import url="logout.jsp"/> 
	<br>
	<br>
	<h1>Alteração de Dados</h1>
	<br>
	<form action="${link1}" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome}" > 
		Data: <input type="text" name="data" value = "<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" >
		<input type="hidden" name="id" value="${empresa.id}" >
		<input type="submit" value="Salvar">
	</form>
	<br>
	<a href="${link2 }"> Voltar </a>
</body>
</html>