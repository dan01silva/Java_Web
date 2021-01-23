<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkServelet"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Login</title>
</head>
<body>
	<fieldset>
		<legend>Login Gerenciador de Empresas</legend>
		
		<form action="${linkServelet}" method="post">

			<label>Login </labela> <input type="text" required=""
				name="login" /> 
			<label>Senha </label> <input type="password"
				required="required" name="senha" />
			<input type="hidden" name="acao" value="Login" />

			<button>Logar</button>
		</form>
	</fieldset>
</body>
</html>