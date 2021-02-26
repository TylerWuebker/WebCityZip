package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CityZip;

/**
 * Servlet implementation class AddCityServlet
 */
@WebServlet("/addCityServlet")
public class AddCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String city = request.getParameter("city");
		String zipCode = request.getParameter("zipCode");
		
		CityZip CiZi = new CityZip(zipCode, city);
		CityZipAssist cza = new CityZipAssist();
		cza.insertZip(CiZi);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
