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

@WebServlet("/update")
public class Updateempdetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int int1 = Integer.parseInt( req.getParameter("id"));
		 String str1 = req.getParameter("username");
		  int int2 = Integer.parseInt( req.getParameter("age"));
		  String str2 = req.getParameter("mail");
		  double dou1=Double.parseDouble( req.getParameter("salary"));
		  EmployeeManagement emp=new EmployeeManagement(int1, str1, int2, str2, dou1);
		  Empservice emps=new Empservice();
		 int updateEmp= emps.updateEmployee(emp);
		  if(updateEmp!=0) {
			  RequestDispatcher dis = req.getRequestDispatcher("welcome1.html");
		      dis.forward(req, resp);
		  }else {
			  PrintWriter writer = resp.getWriter();
			  writer.println("<h3>update not sucessful</h3>");
			  RequestDispatcher dis2 = req.getRequestDispatcher("update2.html");
			  dis2.include(req, resp);
		  }
	}

}
