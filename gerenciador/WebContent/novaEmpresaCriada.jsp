<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page JSP</title>
</head>
<body>

	<c:if test="${not empty empresa}">
	
		Empresa ${ empresa} cadastrada com sucesso em ${data}
	</c:if>
	
<ul> A Empresa ${3 + 5 } foi cadastrada : </ul> 
	
<ul> <A HREF="listaEmpresas">Lista das Empresas Cadastradas</A> </ul>

</body>
</html>