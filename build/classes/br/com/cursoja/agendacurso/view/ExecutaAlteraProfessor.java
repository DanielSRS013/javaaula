package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.ProfessorController;
import br.com.cursoja.agendacurso.model.entidade.Professor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExecutaAlteraProfessor extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public ExecutaAlteraProfessor() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nomeProfessor");
		String strValorHora = request.getParameter("valorHora");
		String strId = request.getParameter("id");
		
		double valorHora = 0.00;
		long id = 0;
		try {
			valorHora = Double.parseDouble(strValorHora);
			id = Long.parseLong(strId);
		} catch(Exception e) {
			System.out.println("Erro na convers�o");
		}
		
		Professor p = new Professor();
		p.setId(id);
		p.setNome(nome);
		p.setValorHora(valorHora);
		
		ProfessorController controller = new ProfessorController();
		controller.alterar(p);
		RequestDispatcher rd = request.getRequestDispatcher("listarcurso.jsp");
		rd.forward(request, response);
	}
}
