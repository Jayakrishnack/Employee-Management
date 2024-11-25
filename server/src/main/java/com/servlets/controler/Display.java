package com.servlets.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.entity.EmployeeManagement;
import com.servlets.service.Empservice;

@WebServlet("/display")
public class Display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Empservice eser=new Empservice();
		List<EmployeeManagement> all = eser.getAll();
		PrintWriter writer = resp.getWriter();
		 writer.println("<!DOCTYPE html>");
	        writer.println("<html>");
	        writer.println("<head>");
	        writer.println("<title>Employee Details</title>");
	        writer.println("</head>");
	        writer.println("<body>");
	        writer.println("<h1>Employee Details</h1>");
	        writer.println("<table border='1'>");
	        writer.println("<thead>");
	        writer.println("<tr>");
	        writer.println("<th>ID</th>");
	        writer.println("<th>Name</th>");
	        writer.println("<th>Age</th>");
	        writer.println("<th>Email</th>");
	        writer.println("<th>Salary</th>");
	        writer.println("<th>Modify</th>");
	        writer.println("</tr>");
	        writer.println("</thead>");
	        writer.println("<tbody>");

	        // Loop through employees and generate table rows
	        for (EmployeeManagement employee : all) {
	            writer.println("<tr>");
	            writer.println("<td>" + employee.getId() + "</td>");
	            writer.println("<td>" + employee.getName() + "</td>");
	            writer.println("<td>" + employee.getAge() + "</td>");
	            writer.println("<td>" + employee.getMail() + "</td>");
	            writer.println("<td>" + employee.getSalary() + "</td>");
	            writer.println("<td><a href=\"update2.html\"><button>update</button></a><a href=\"Delete2.html\"><button>delete</button></a></td>");
	            writer.println("</tr>");
	            System.out.println(employee);
	        }

	        writer.println("</tbody>");
	        writer.println("</table>");
	        writer.println("</body>");
	        writer.println("</html>");

	        writer.close();
	    }
		}
	
	
	


