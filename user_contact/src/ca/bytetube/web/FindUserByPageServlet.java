package ca.bytetube.web;

import ca.bytetube.domain.PageBean;
import ca.bytetube.domain.User;
import ca.bytetube.service.UserService;
import ca.bytetube.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FindUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    private UserService service = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.解析参数
        String curPage = request.getParameter("curPage");
        String rows = request.getParameter("rows");

        //2.调用service方法获取pb对象
      PageBean<User>  pb = service.findUseByPage(curPage,rows);

        //3.将pb存入到request中
        request.setAttribute("pb",pb);
        System.out.println(pb);

        //4.转发到list.jsp
        request.getRequestDispatcher("/list.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
