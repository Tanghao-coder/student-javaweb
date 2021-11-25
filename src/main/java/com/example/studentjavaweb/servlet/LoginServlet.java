package com.example.studentjavaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if ("trueLogin".equals(type)) { // 执行登录的
            String userName = request.getParameter("userName");
            String pwd = request.getParameter("pwd");
            AdminService adminService = new AdminServiceImpl();
            AdminDO adminDO = adminService.validateLogin(userName);

            if (pwd.equals(adminDo.getPwd())){
                adminDO.setPwd(null);
                request.getSession().setAttribute("admin",adminDO);
                System.out.println("跳转到主页面");
            }
            }else{
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        else{
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
}