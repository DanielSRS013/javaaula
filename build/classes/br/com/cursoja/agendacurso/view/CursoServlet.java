package br.com.cursoja.agendacurso.view;

import java.io.IOException;

import br.com.cursoja.agendacurso.controller.CursoController;
import br.com.cursoja.agendacurso.model.entidade.Curso;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CursoServlet
 */
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CursoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//$nome = $_POST["nomecurso"]; PHP
		//$id = $_GET["id"];
		String nome = request.getParameter("nomecurso");
		String strValor = request.getParameter("mensalidade");

		System.out.println(nome);
		System.out.println(strValor);

		double valor = 0.00;
		try {
			valor = Double.parseDouble(strValor);
		} catch(Exception e) {
			
		}
		Curso c = new Curso();
		c.setNome(nome);
		c.setValor(valor);

		CursoController controller = new CursoController();
		controller.cadastrar(c);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarcurso.jsp");
		rd.forward(request, response);
		
		//doGet(request, response);
	}

}
