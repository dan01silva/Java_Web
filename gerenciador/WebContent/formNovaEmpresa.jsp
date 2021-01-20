<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkServelet"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Cadastro HTML com EL</title>
</head>
<body>
	<fieldset>
		<legend>Formulario de cadastro de Empresa </legend>
		
		<form action="${linkServelet}" method="post">

			<label>Nome da Empresa </label> <input type="text" required=""
				name="nome" /> 
			<label>Data do cadastro</label> <input type="text"
				required="required" name="data" />
			<input type="hidden" name="acao" value="NovaEmpresa" />

			<button>Cadastrar</button>
		</form>
	</fieldset>
</body>
</html>