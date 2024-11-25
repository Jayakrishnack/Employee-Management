package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/info")
public class Cookies extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		Cookie[] cookies = req.getCookies();
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getName()+" "+cookie.getValue());
//		}
		
		 HttpSession s = req.getSession(); 
		 String attribute = (String) s.getAttribute("jk1");
		 String attribute2 = (String) s.getAttribute("password");
		System.out.println(attribute);
		System.out.println(attribute2);
	}
	

}
