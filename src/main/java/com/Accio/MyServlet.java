package com.Accio;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet")
//This is a servlet(mini server)
public class MyServlet extends HttpServlet {
//This is handle Request
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      response.setContentType("text/html");  //set content type of response
      PrintWriter out=response.getWriter(); //get writer to write content in response
      out.println("<h3>This is my Servlet</h3>");  //print the response in html format

  }
}
