package org.restapi.BookCrud.crud.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.restapi.BookCrud.crud.model.crudmodel;

public class crudservice {
	
	Connection con;

	
	public crudservice(){
		
		try {
			String url =String.format("jdbc:mysql://localhost:3306/books");
			String uname ="root";
			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);
			
		} catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
	}

	
	public crudmodel createBook(crudmodel book) {
		String insert = "insert into book(name) values(?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, book.getName());
			
			ps.execute();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return book;
		
	}
	
	public ArrayList<crudmodel> getBook() throws SQLException{
		
		ArrayList<crudmodel> data = new ArrayList<crudmodel>();
		
		String select = "select * from book";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			crudmodel model = new crudmodel();
			
			model.setName(rs.getString("name")); // column name
			
			data.add(model);
		}
		
		return data;
		
	}
	
	
	public ArrayList<crudmodel> getBookById(int id) throws SQLException{
		
		ArrayList<crudmodel> data = new ArrayList<crudmodel>();
		String select = "select * from book where bid =?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			crudmodel model = new crudmodel();
			
			model.setName(rs.getString("name")); // column name	
			data.add(model);		
		}		
		return data;	
	}
	
	public crudmodel updatetBook(crudmodel book) {
		String insert = "update book set name=? where bid =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, book.getName());
			ps.setInt(2, book.getId());
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return book;
		
	}
	

	public int deletetBook(int id) {
		String insert = "delete from book where bid =?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1,id);
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return id;
		
	}
	
	


}

