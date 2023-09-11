package chap08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap08/productController2")
public class ProductController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductController2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService service = new ProductService();
		RequestDispatcher dispatcher = null;
		
		String action = request.getParameter("action");
		String viewPath = "/WEB-INF/views/chap08/";
		
		if(action == null || action.equals("list")){
			request.setAttribute("products", service.findAll());
			dispatcher = request.getRequestDispatcher(viewPath + "productList.jsp");
			dispatcher.forward(request, response);
		}else if(action.equals("info")){
			String id = request.getParameter("id");
			request.setAttribute("product", service.find(id));
			
			dispatcher = request.getRequestDispatcher(viewPath + "productInfo.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
