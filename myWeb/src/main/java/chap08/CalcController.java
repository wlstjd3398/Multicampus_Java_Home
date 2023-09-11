package chap08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap08/calcController")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String viewPath;
       
    public CalcController() {
        super();
        viewPath = "/WEB-INF/views/chap08/";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(this.viewPath + "calcForm.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CalcBean bean = new CalcBean();
		bean.setNum1(Integer.parseInt(request.getParameter("num1")));
		bean.setOperation(request.getParameter("operation"));
		bean.setNum2(Integer.parseInt(request.getParameter("num2")));
		
		request.setAttribute("result", bean.calculate());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(this.viewPath + "calcResult.jsp");
		dispatcher.forward(request, response);
	}
}
