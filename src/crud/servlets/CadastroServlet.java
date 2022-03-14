package crud.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.dao.CadastroCarroDAO;
import crud.dao.CadastroCarroMemoriaDAO;
import crud.entities.Carro;
import crud.entities.MarcasEnum;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

	private static final long serialVersionUID = 1521980604131890810L;

	private CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MarcasEnum marca = MarcasEnum.valueOf(req.getParameter("marca"));
		String modelo = req.getParameter("modelo");
		Integer ano = Integer.parseInt(req.getParameter("ano"));
		String id = req.getParameter("id");
		List<String> opcionais = Arrays.asList(req.getParameterValues("opcionais"));
		boolean isAutomatico = "SIM".equals(req.getParameter("automatico"));
		
		boolean isCadastro = id == null || id.isEmpty();
		if (isCadastro) {
			Carro carro = new Carro(marca, modelo, ano, opcionais,isAutomatico);
			this.dao.cadastro(carro);
		} else {
			Carro carro = new Carro(Integer.parseInt(id), marca, modelo, ano, opcionais,isAutomatico);
			this.dao.alteraCarro(carro);
		}
		configuraAtributoSessao(req);
		resp.sendRedirect("listagem");
	}

	private void configuraAtributoSessao(HttpServletRequest request) {
		if (request.getSession().getAttribute("timestamp") == null) {
			request.getSession().setAttribute("timestamp", System.currentTimeMillis());
		}
	}
}
