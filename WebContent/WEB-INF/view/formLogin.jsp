<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<a href="/appServlet"> Home </a>
	
	<h1>Entrar</h1>
	<br>
	<form action="${link}" method="post">
		Login: <input type="text" name="login">  <br> <br>
		Senha: <input type="password" name="senha"> <br> <br>
		<input type="hidden" name="acao" value="Login"> <!-- /entrada?acao=Login -->
		<input type="submit" value="Entrar">
	</form>
	
</body>
</html>