<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Curso" %>
<%@ page import="java.text.DecimalFormat" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alteração de cursos</title>
</head>
<body>
	
	<%
		Curso cursoAlterar = (Curso) request.getAttribute("curso");
		DecimalFormat fmt = new DecimalFormat("###0.00");
	%>
	<form method="post" action="ExecutaAlteraCurso">
		<label>Nome:</label>
		<input type="text" name="nomeCurso" value="<%= cursoAlterar.getNome() %>"/>
		
		<label>Mensalidade:</label>
		<input type="number" name="mensalidade" 
				value="<%= cursoAlterar.getValor() %>"
				step="0.01" /> 
				
		<input type="hidden" name="id" value="<%= cursoAlterar.getId() %>" />
		
		<input type="submit" value="Alterar" />		
	</form>
</body>
</html>