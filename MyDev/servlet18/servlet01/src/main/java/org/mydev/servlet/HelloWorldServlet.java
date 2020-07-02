package org.mydev.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException,IOException
    {
        //setting the content type
        res.setContentType("text/html");
        //get the stream to write the data
        PrintWriter pw=res.getWriter();

        //writing html in the stream
        pw.println("Hello,Welcome to Servlet Tutorial World");
    }
}