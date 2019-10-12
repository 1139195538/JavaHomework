package com.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.BookBean;
import com.dao.BookDao;

public class DaoImpl implements BookDao {
	public static Connection getConn() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		//数据库链接
		String url="jdbc:mysql://localhost:3306/test";
		String userName="root";
		String password="";
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
	
	@Override
	public void insert(BookBean bookbean)throws Exception {
		// TODO 自动生成的方法存根
		Connection conn = getConn();
		System.out.println(conn);
		PreparedStatement ps;
		String sql="insert into book(id,bookname,price,description) values(?,?,?,?)";
		ps =conn.prepareStatement(sql);
		ps.setInt(1,bookbean.getId());
		ps.setString(2, bookbean.getBookname());
		ps.setInt(3,bookbean.getPrice());
		ps.setString(4, bookbean.getDescription());
		ps.executeUpdate();
		System.out.println("添加成功");
		ps.close();
	    conn.close();
	}

	@Override
	public void update(BookBean bookbean)throws Exception {
		// TODO 自动生成的方法存根
		Connection conn = getConn();
		System.out.println(conn);
		PreparedStatement ps;
		String sql="update book set bookname=?,price=?,Description=? where id=?";
		ps =conn.prepareStatement(sql);
		
		ps.setString(1, bookbean.getBookname());
		ps.setInt(2,bookbean.getPrice());
		ps.setString(3, bookbean.getDescription());
		ps.setInt(4,bookbean.getId());
		ps.executeUpdate();
		System.out.println("修改成功");
		ps.close();
	    conn.close();
	}

	@Override
	public void delete(int id)throws Exception {
		// TODO 自动生成的方法存根
		Connection conn = getConn();
		System.out.println(conn);
		PreparedStatement ps;
		String sql="delete from book where id=?";
		ps =conn.prepareStatement(sql);
		ps.setInt(1,id);
		ps.executeUpdate();
		System.out.println("删除成功");
		ps.close();
	    conn.close();
	}

	@Override
	public BookBean query(int id)throws Exception {
		// TODO 自动生成的方法存根
		Connection conn = getConn();
		System.out.println(conn);
		PreparedStatement ps;
		String sql="select id,bookname,price,description from book where id=?";
		ps =conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			BookBean user=new BookBean();
			user.setId(rs.getInt(1));
			user.setBookname(rs.getString(2));
			user.setPrice(rs.getInt(3));
			user.setDescription(rs.getString(4));
			System.out.println(user);
			System.out.println("查询成功");
			return user;
		}
		ps.executeUpdate();
		ps.close();
	    conn.close();
		return null;
	}

}
