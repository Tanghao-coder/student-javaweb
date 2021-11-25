package com.example.studentjavaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testServlet",urlPatterns = "/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 怎么在servlet中写页面呢?
        try(PrintWriter writer = response.getWriter()) {
            writer.print("<h1 style='color:red'>下面是登录页面</h1>");
            writer.print("<form>");
            writer.print("<input type='text' name='userName'/>");
            writer.print("</form>");
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
