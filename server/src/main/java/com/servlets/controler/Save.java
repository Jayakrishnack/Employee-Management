package com.servlets.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.entity.EmployeeManagement;
import com.servlets.service.Empservice;

@WebServlet("/go")
public class Save extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String eid = req.getParameter("id");
		String ename = req.getParameter("name");
		String eage = req.getParameter("age");
		String email = req.getParameter("mail");
		String esalary = req.getParameter("salary");
		
		int eid1 = Integer.parseInt(eid);
		int eage1=Integer.parseInt(eage);
		double edouble1 = Double.parseDouble(esalary);
//		PrintWriter wr = resp.getWriter();
//		wr.println("sava detailes");
		  EmployeeManagement employee = new EmployeeManagement(eid1, ename, eage1, email, edouble1);

	        // Print the details of the employee
		  Empservice empservice = new Empservice();
		  int num =empservice.savaemp(employee);
		  if (num!=0) {
				
//				PrintWriter writer = resp.getWriter();
//				writer.print("<h3 style='text-align: center; color: green;'>--- EMPLOYEE REGISTRATION SUCCESSFUL ---</h3>");
				
//				resp.sendRedirect("Welcome.html");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("welcome1.html");
				dispatcher.forward(req, resp);
				
			} else {

				PrintWriter writer = resp.getWriter();
				writer.print("<h3 style='text-align: center; color: red;'>--- EMPLOYEE REGISTRATION UNSUCCESSFUL ---</h3>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("Rigister1.html");
				dispatcher.include(req, resp);
				
			}
	}
	
	

}
