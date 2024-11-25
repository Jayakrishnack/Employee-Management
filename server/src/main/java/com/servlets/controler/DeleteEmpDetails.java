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

@WebServlet("/delete")
public class DeleteEmpDetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int int1 = Integer.parseInt( req.getParameter("id"));
		 Empservice empservice = new Empservice();
		 int deleteEmployee = empservice.deleteEmployee(int1);
		 if(deleteEmployee!=0) {
			  RequestDispatcher dis = req.getRequestDispatcher("welcome1.html");
		      dis.forward(req, resp);
		  }else {
			  PrintWriter writer = resp.getWriter();
			  writer.println("<h3>Delete Sucess</h3>");
			  RequestDispatcher dis2 = req.getRequestDispatcher("Delete2.html");
			  dis2.include(req, resp);
		  }	}

}
