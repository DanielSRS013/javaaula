<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cursos</title>
</head>
<body>
	<form method="post" action="CursoServlet">
		<label>Nome: </label>
		<input type="text" name="nomecurso" required />
		<label>Valor: </label>
		<input type="number" name="mensalidade" required
		       step="0.01" />
	
		<input type="submit" value="Gravar" />
	</form>
</body>
</html>