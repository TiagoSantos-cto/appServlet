<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/entrada" var="link1" />
<c:url value="/entrada?acao=ListaEmpresas" var="link2" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário com method Request POST e JSTL Core</title>
</head>
<body>
	 <a href="/appServlet"> Home </a> &nbsp; &nbsp; &nbsp; <c:import url="logout.jsp"/> 
	<br>
	<br>
	<h1>Cadastro de Empresa</h1>
	<br>
	<form action="${link1}" method="post">
		Nome: <input type="text" name="nome"> 
		Data: <input type="text" name="data">
		<input type="hidden" name="acao" value="NovaEmpresa"> <!-- /entrada?acao=novaEmpresa -->
		<input type="submit" value="Cadastrar">
	</form>	
	<br>
	<a href="${link2 }"> Voltar </a>	
</body>
</html>