<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.cursoja.agendacurso.model.dao.Conexao" %>
<%@ page import="br.com.cursoja.agendacurso.model.dao.CursoDao" %>

<%@ page import="br.com.cursoja.agendacurso.model.entidade.Curso" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página inicial</title>
</head>
<body>
	<h1>Olá mundo, agora na "web"</h1>
	
	<a href="listarcurso.jsp">Cursos</a>
	<a href="listarprofessor.jsp">Professores</a>
	<%
		Conexao c = new Conexao();
		c.getConexao();
		
		c.fecharConexao();

		CursoDao dao = new CursoDao();

		ArrayList<Curso> cursos = dao.listar("");
		for(Curso a : cursos){ 
	%>
			<p><%= a.getNome() %></p>
	<% 
		}
		
		Curso unico = dao.buscar(1);
	%>
		
</body>
</html>