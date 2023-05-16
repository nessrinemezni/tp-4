package controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.NumberBean;

/**
 * Servlet implementation class RandomServlet
 */
@WebServlet("/RandomServlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


	        int max = Integer.parseInt(request.getParameter("max"));

	        NumberBean randomNumberBean = new NumberBean();
	        randomNumberBean.setMin(0);
	        randomNumberBean.setMax(max);

	        int randomNum = randomNumberBean.getRandomNum();

	        request.setAttribute("randomNum", randomNum);


	        RequestDispatcher dispatcher = request.getRequestDispatcher("random.jsp");
	        dispatcher.forward(request, response);
	    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}