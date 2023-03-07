package ca.bytetube.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/quickStart")
public class QuickStartServlet implements Servlet {

    @Override
    /**
     * 默认情况下，只有servlet被第一次访问时，servlet才会被创建
     * init只会被执行一次
     *
     * 准备预先资源
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method is running");
    }

    @Override
    /**
     * servlet被调用时执行，可以执行多次
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("service method is running");
    }


    @Override
    /**
     * 只有服务器正常关闭时，才会执行destroy
     * destroy只会被执行一次
     *
     * 释放资源
     */
    public void destroy() {
        System.out.println("destroy method is running");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}
