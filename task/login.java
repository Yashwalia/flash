package com.java.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
              private static final long serialVersionUID = 1L;

   
    public LoginServlet() {
        
    }

              
              protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                             
                             String user = "lokesh";
                             String pass = "pothu";
                             
                             String userName =  request.getParameter("Username").toString();
                             String password =  request.getParameter("Password").toString();
                             
                             //String userName =  "abc";
                             //String password =  "mnbcm";
                             
                             if((userName!= null && password != null) && (!userName.isEmpty() && !password.isEmpty()))
                             {
                                           if(userName.equals(user) && password.equals(pass)) {
                                                          
                                                          RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
                                                          
                                                          dispatcher.forward(request, response);
                                                          
                                           }else {
                                                          
                                                          RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
                                                          
                                                          dispatcher.forward(request, response);
                                           }
                                           
                                           
                                           
                             }
                             else
                             {
                                           
                                           RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
                                           
                                           dispatcher.forward(request, response);
                             }
                             
                             
                             
              
                             //response.getWriter().append("Served at: ").append(request.getContextPath());
              }

              
              protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                             
                             doGet(request, response);
              }

}

