<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada?acao=Lista" var="link"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalhe</title>
</head>
<body>

<h1>Detalhe</h1>
<br>

Fundação: <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 

<br>
<a href="${link}">Voltar</a>
</body>
</html>