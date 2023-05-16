package controlleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.clientBean;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class clientServlet
 */
@WebServlet("/clientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String adresse = request.getParameter("adresse");
	int telephone = Integer.parseInt ("telephone");
	String email = request.getParameter("email");
	
	clientBean client = new clientBean();
	
	client.setNom(nom);
	client.setPrenom(prenom);
	client.setAdresse(adresse);
	client.setTelephone(telephone);
	client.setEmail(email);
	
	request.setAttribute("client", client);

	
	
	
	
	this.getServletContext().getRequestDispatcher("/client.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}