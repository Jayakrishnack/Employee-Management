package com.servlets.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.servlets.entity.EmployeeManagement;

public class Empservice {
	private static String url = "jdbc:mysql://localhost:3306/jsp";
	private static String user = "root";
	private static String password = "root";
	public static Connection con;

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int savaemp(EmployeeManagement es) {
		String sg = "insert into emp1 values(?,?,?,?,?)";
		int num = 0;

		try {
			PreparedStatement pstm = con.prepareStatement(sg);
			pstm.setInt(1, es.getId());
			pstm.setString(2, es.getName());
			pstm.setInt(3, es.getAge());
			pstm.setString(4, es.getMail());
			pstm.setDouble(5, es.getSalary());
			num = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	public List<EmployeeManagement> getAll(){
		List<EmployeeManagement> l=new ArrayList<>();
		String sql="select * from emp1";
		
		try {
			Statement sta = con.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String email = rs.getString(4);
				double sal = rs.getDouble(5);
				l.add(new EmployeeManagement(id, name, age, email, sal));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
		
	}
	public int updateEmployee(EmployeeManagement emp) {
		String sql = "update  emp1 set id=?,name=?,age=?,mail=?,sal=? where id=?";
		int num=0;
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setInt(3, emp.getAge());
			pstm.setString(4,emp.getMail());
			pstm.setDouble(5, emp.getSalary());
			pstm.setInt(6, emp.getId());
			
			num=pstm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
		
	}
	public int deleteEmployee(int employeeId) {
	    String sql = "DELETE FROM emp1 WHERE id=?";
	    int rowsAffected = 0;

	    try {
	        PreparedStatement pstm = con.prepareStatement(sql);
	        pstm.setInt(1, employeeId); // Set the employee ID to delete
	        rowsAffected = pstm.executeUpdate(); // Execute the delete query
	    } catch (SQLException e) {
	        e.printStackTrace(); // Log the exception for debugging
	    }

	    return rowsAffected; // Return the number of rows affected
	}

}
