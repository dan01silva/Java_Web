<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Alteração de Empresa</title>
</head>
<body>
	<fieldset>
		<legend>Formulario de Alteração do cadastro da Empresa</legend>

		<form action="${linkEntradaServlet}" method="post">

				<label>Nome da Empresa </label> 
				<input type="text" required="" name="nome" value="${empresa.nome}" /> 
				<label>Data do cadastro</label> 
				<input type="text" required="required" name="data" value="<fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy" />" />
				<input type="hidden" name="id" value="${empresa.id}" />
				<input type="hidden" name="acao" value="AlteraEmpresa" />

			<button>Cadastrar</button>
		</form>
	</fieldset>
</body>
</html>