<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkNovaEmpresaServelet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Cadastro HTML com JSP</title>
</head>
<body>
	<fieldset>
		<legend>Formulário de cadastro de Empresa </legend>

		<form action="${linkNovaEmpresaServelet}" method="post">

			<label>Nome da Empresa </label> <input type="text" required=""
				name="nome" /> 
			<label>Data do cadastro </label> <input type="date"
				required="required" name="data" />

			<!-- <input type="submit" /> -->

			<button>Cadastrar</button>
		</form>
	</fieldset>
</body>
</html>