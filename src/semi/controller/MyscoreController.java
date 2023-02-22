package semi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.dto.ScoreDto;
import semi.service.ScoreService;

/**
 * Servlet implementation class MyscoreController
 */
@WebServlet("/myscore")
public class MyscoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyscoreController() {
        super();
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer inte=(Integer)request.getSession().getAttribute("lgn");
		if(inte instanceof Integer) {
			
			List<ScoreDto> scorelist=new ScoreService().getscore(inte);
			request.setAttribute("score", scorelist);
		
			request.getRequestDispatcher("/WEB-INF/view/myscore.jsp").forward(request, response);
		
		}else {
		
			request.getRequestDispatcher("/WEB-INF/view/mypage.jsp").forward(request, response);
			
		}
		
		
		
	}

	

}
