package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.CursoController;
import br.com.cursoja.agendacurso.model.entidade.Curso;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class InicioAlteraCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public InicioAlteraCurso() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//$id = $_GET["id"]; PHP
		long id = 0;
		
		try {
			id = Long.parseLong(request.getParameter("id")) ;
		} catch(Exception e) {
			
		}
		
		CursoController controller = new CursoController();
		Curso c = controller.buscar(id);
		
		System.out.println(c.getNome());
		
		request.setAttribute("curso", c);
		RequestDispatcher rd = request.getRequestDispatcher("alterarcurso.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
