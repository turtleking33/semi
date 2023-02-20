package semi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 * Servlet implementation class MyinfoController
 */
@WebServlet("/myinfo")
public class MyinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyinfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("myinfo")=="myinfo") {
			Integer inte=(Integer)request.getSession().getAttribute("lgn");
			
			request.setAttribute("stu", inte);
			request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/myinfo.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/myinfo.jsp").forward(request, response);
		}
		
	}
	
}
