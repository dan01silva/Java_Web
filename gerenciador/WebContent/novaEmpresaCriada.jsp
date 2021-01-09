<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<%
//scriplet

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>


<ul> A Empresa ${ empresa } foi cadastrada : ${data} </ul> 
	
<ul> <A HREF="listaEmpresas">Lista das Empresas Cadastradas</A> </ul>

</body>
</html>