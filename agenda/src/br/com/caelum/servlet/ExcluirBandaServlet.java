package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.DAO.BandaDao;
import br.com.caelum.controller.Banda;

@WebServlet("/excluirBanda")
public class ExcluirBandaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 320642283868796720L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		String nomeBanda = request.getParameter("nomeBanda");
		
		Banda banda = new Banda();
		banda.setNomeBanda(nomeBanda);
		
		BandaDao dao = new BandaDao();
		dao.deleteBanda(banda);
		
		out.println("<html>");
		out.println("<body>");
<<<<<<< HEAD
		out.println("Banda " + banda.getNomeBanda() + " excluida com sucesso!");
=======
		out.println("Banda " + banda.getNomeBanda() + " excluida com sucesso");
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
		out.println("</body>");
		out.println("</html>");
	}
}
