<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.alura.gerenciador.servelet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	lista de empresas: <br />
		
		<%-- usando apenas tag para acessar os parâmetros do java --%>
		
		<ul>
		<c:forEach items="${empresa}" var="empresa">
			<li> ${empresa.nome} <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/></li>
		</c:forEach>
	</ul>
	
	
<%-- usando scriplet --%>
	<%--	Maneira antiga, com o Scriplet, concatenando HRML e JAVA
	<ul>
	<% 
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : lista){
	%>
		<li>
			<%= empresa.toString() %> 
		</li>
	<% 
		}
	%> 
	--%>
</ul>

</body>
</html>