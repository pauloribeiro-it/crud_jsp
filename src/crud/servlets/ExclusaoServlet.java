package crud.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.dao.CadastroCarroDAO;
import crud.dao.CadastroCarroMemoriaDAO;

@WebServlet("/exclusao")
public class ExclusaoServlet extends HttpServlet{

	private static final long serialVersionUID = 1540370031035917477L;
	private CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.valueOf(req.getParameter("id"));
		this.dao.removeCarro(id);
		resp.sendRedirect("listagem");
	}
	
}
