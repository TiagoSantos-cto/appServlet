<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=NovoUsuario" var="link1" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo Usu�rio</title>
</head>
<body>

<a href="/appServlet"> Home </a>
<h1>Novo Usu�rio</h1>

<form action="${link1}" method="POST">

		Nome: <input type="text" name="login"> <br> <br>
		Senha: <input type="password" name="senha"> <br> <br> 
		<input type="submit" value="cadastrar">

	</form>
</body>
</html>