<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
//scriplet
String nome = "Nico";

String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>
	A Empresa <%= nomeEmpresa %> Cadastrado com sucesso!
	
	
	<p><%=nome %></p>

</body>
</html>