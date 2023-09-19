package HomeController;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.InterfaceCategoryService;
import Service.InterfaceNewService;
import model.NewsModel;
@WebServlet(urlPatterns = "/trang-chu")
public class Home extends HttpServlet {
@Inject
private InterfaceCategoryService categoryImplementService ; 
@Inject
private InterfaceNewService newImplementService ; 
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  Long categoryid = 2L ; 
	  String content = "Bai viet 2" ; 
	  Long condition = 4L ; 
	  newImplementService.update(categoryid, content, condition);
	  req.setAttribute("categories", categoryImplementService.sellectAll());
	  RequestDispatcher rd =  req.getRequestDispatcher("/views/web/web.jsp") ; 
	  rd.forward(req, resp) ; 
}
}
	