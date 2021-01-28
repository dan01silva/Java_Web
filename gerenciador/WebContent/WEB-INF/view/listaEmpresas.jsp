<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

	<c:if test="${not empty empresa}">
	
		Empresa ${empresa.nome} foi cadastrada com sucesso!
	</c:if>
		lista de empresas:
		<br />

	<%-- usando apenas tag para acessar os parâmetros do java --%>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li> ${empresa.nome} <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/> 
			<A href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}"> Editar</A> 
			<A href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}"> Remover</A>
			</li>
		</c:forEach>
		
		<br/>
		<A href="/gerenciador/entrada?acao=NovaEmpresa"> Cadastrar Nova Empresa</A>
		<br/>
		<A href="/gerenciador/entrada?acao=Logout"> Logout</A>
		<br/>
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