package semi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.dto.ModiDto;
import semi.service.ModiService;

/**
 * Servlet implementation class ModiController
 */
@WebServlet("/modi")
public class ModiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		Integer stuid=(Integer)request.getSession().getAttribute("lgn");
				
		ModiDto dto=new ModiDto();
		dto.setAddress(address);
		dto.setEmail(email);
		
		int result=new ModiService().modiService(dto, stuid);
		
		if(result>=0) {
			
			request.setAttribute("modi", dto);
			request.getRequestDispatcher("/WEB-INF/view/myinfo.jsp").forward(request, response);
			
		}else {
			request.getRequestDispatcher("/WEB-INF/view/myinfo.jsp").forward(request, response);
		}
		
			
	}


}
