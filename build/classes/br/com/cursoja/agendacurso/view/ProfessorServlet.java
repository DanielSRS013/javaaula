package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.ProfessorController;
import br.com.cursoja.agendacurso.model.entidade.Professor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ProfessorServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nomeprofessor");
		String strValorHora = request.getParameter("valorhora");
		String strCelular = request.getParameter("celular");
		
		System.out.println(nome);
		System.out.println(strValorHora);
		System.out.println(strCelular);
		
		double valorHora = 0.00;
		try {
			valorHora = Double.parseDouble(strValorHora);
		}catch(Exception e) {
			
		}
		Professor p = new Professor();
		p.setNome(nome);
		p.setValorHora(valorHora);
		p.setCelular(strCelular);
		
		ProfessorController controller = new ProfessorController();
		controller.cadastrar(p);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarprofessor.jsp");
		rd.forward(request, response);
		
		
	}

}
