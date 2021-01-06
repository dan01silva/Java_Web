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
</ul>

</body>
</html>