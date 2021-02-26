package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CityZip;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet("/navigationServlet")
public class NavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CityZipAssist cza = new CityZipAssist();
		
		String act = request.getParameter("doThisToCity");
		
		String path = "/viewAllCitiesServlet";
		if(act.equals("delete")) {
			String tempZip = request.getParameter("ZIPCODE");
			CityZip cityToDelete = (CityZip) cza.lookForZip(tempZip);
			cza.deleteZip(cityToDelete);
		} else if(act.equals("edit")) {
			String tempZip = request.getParameter("ZIPCODE");
			CityZip cityToEdit = (CityZip) cza.lookForZip(tempZip);
			request.setAttribute("cityToEdit", cityToEdit);
			path = "/edit-city.jsp";
		} else if(act.equals("add")) {
			path = "/index.html";
		}
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
