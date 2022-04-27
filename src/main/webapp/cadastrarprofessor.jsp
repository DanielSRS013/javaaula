<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Curso</title>
</head>
<body>
	<form method="post" action="ProfessorServlet">
		<label>Nome: </label>
		<input type="text" name="nomeprofessor" required/>
		<label>Celular</label>
		<input type="text" name="celular" required/>
		<label>Valor Hora: </label>
		<input type="number" name="valorhora" required step="0.01"/>
		<input type="submit" value="Gravar"/>
	</form>
</body>
</html>