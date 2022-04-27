package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.ProfessorController;
import br.com.cursoja.agendacurso.model.entidade.Professor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InicioAlteraProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InicioAlteraProfessor() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long id = 0;
		try {
			id = Long.parseLong(request.getParameter("id")) ;
		} catch(Exception e) {
			
		}
		ProfessorController controller = new ProfessorController();
		Professor p = controller.buscar(id);
		
		System.out.println(p.getNome());
		
		request.setAttribute("professor", p);
		RequestDispatcher rd = request.getRequestDispatcher("alterarprofessor.jsp");
		rd.forward(request, response);
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}
		
}
