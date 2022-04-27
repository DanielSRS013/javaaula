package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.CursoController;
import br.com.cursoja.agendacurso.model.entidade.Curso;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExcluirCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ExcluirCurso() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strId = request.getParameter("id");
		
		long id = 0;
		try {
			id = Long.parseLong(strId);
		} catch(Exception e) {
			System.out.println("Erro na convers�o");
		}

		CursoController controller = new CursoController();
		Curso c = new Curso();
		c.setId(id);
		
		controller.excluir(c);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarcurso.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
