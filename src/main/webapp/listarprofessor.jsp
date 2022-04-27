<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="br.com.cursoja.agendacurso.controller.ProfessorController" %>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Professor" %>  
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.DecimalFormat" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Professores</title>
</head>
<body>
	<a href="cadastrarcurso.jsp">Cadastrar Curso</a>
	
	<table>
		<thead>
			<th>Nome</th>
			<th>Celular</th>
			<th>Valor Hora</th>
		</thead>
		<tbody>
	<% 
		ProfessorController controller = new ProfessorController();
		ArrayList<Professor> lista = controller.listar("");
		
		DecimalFormat fmt = new DecimalFormat("###,##0.00");
		for (Professor p : lista) {
	%>	
			<tr>
				<td><%= p.getNome() %></td>
				<td><%= p.getCelular() %>
				<td><%= fmt.format( p.getValorHora() ) %></td>
				<td>
					<a href="InicioAlteraProfessor?id=<%= p.getId() %>">Alterar</a> 
					<a href="ExcluirProfessor?id=<%= p.getId() %>"
					   onclick="return confirm('Deseja excluir esse registro?')">
					   Excluir
					</a> 

				</td>
			</tr>
	
	<% } %>
		</tbody>
	</table>
</body>
</html>