package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String pass = req.getParameter("pass");
		String namM="jk";
		String password="jk123";
//		Cookie c1=new Cookie("jk",name);
//		Cookie c2=new Cookie("password",pass);
		
//		resp.addCookie(c1);
//		resp.addCookie(c2);
	   HttpSession se = req.getSession(); 
	   se.setAttribute("jk1", name);
	   se.setAttribute("password",pass);
		
		System.out.println("session created");
		
		
		
		
		if(namM.equalsIgnoreCase(name) && pass.equals(password) ) {
			RequestDispatcher dis = req.getRequestDispatcher("text2.html");
			dis.forward(req, resp);
			
		}else {
			PrintWriter wr = resp.getWriter();
			wr.print("<h1 style=\"color:red;\">---Invalid credential---</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, resp);
			
			System.out.println("Invalid password");
		}
			
	}
   
	
}
