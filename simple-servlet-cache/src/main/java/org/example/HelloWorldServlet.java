package org.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    static String PAGE_HEADER = "<html><head /><body>";

    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1>Hello, world!</h1>" + System.currentTimeMillis());
        writer.println(PAGE_FOOTER);
        writer.close();
    }

}
