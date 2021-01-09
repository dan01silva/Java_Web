<%@page import="java.util.List"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.alura.gerenciador.servelet.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Empreas</title>
</head>
<body>
	
	lista de empresas: <br />
		
		<%-- usando apenas tag para acessar os par�metros do java --%>
		
		<ul>
		<c:forEach items="${empresa}" var="empresa">
			<li> ${empresa.nome}</li>
		</c:forEach>
	</ul>

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