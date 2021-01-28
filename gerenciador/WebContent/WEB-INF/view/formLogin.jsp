<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Gerenciador de Empresas</title>
</head>
<body>
	
    <form action="${linkEntradaServlet }" method="post">

        <label> Login: </label>  <input type="text"  required="required" name="login"  />
        <label> Senha: </label> <input type="password" name="senha"  />

        <input type="hidden" name="acao" value="Login"/> 

       <button>LOGAR</button>
    </form>

</body>
</html>