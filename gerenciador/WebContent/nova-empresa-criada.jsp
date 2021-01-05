<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
//scriplet
String nome = "Daniel Matos";
String data = (String)request.getAttribute("data");
String nomeEmpresa = (String)request.getAttribute("empresa");

SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

System.out.println(data);
System.out.println(nomeEmpresa);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>
	A Empresa <%= nomeEmpresa %> foi cadastrada no dia <%= data %> com sucesso!
	
	
	<p><%=nome %></p>

</body>
</html>