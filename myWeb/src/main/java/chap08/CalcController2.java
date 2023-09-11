package chap08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap08/calcController2")
public class CalcController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String viewPath;
       
    public CalcController2() {
        super();
        viewPath = "/WEB-INF/views/chap08/";
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;	

		if(request.getMethod().equals("POST")){
			CalcBean bean = new CalcBean();
			bean.setNum1(Integer.parseInt(request.getParameter("num1")));
			bean.setOperation(request.getParameter("operation"));
			bean.setNum2(Integer.parseInt(request.getParameter("num2")));
			
			result = bean.calculate();
		}
		
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher(this.viewPath + "calc.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
