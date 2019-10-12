package com.bean;

public class BookBean {
	private int id;
	private String bookname;
	private int price;
	private String description;
	
	@Override
	public String toString() {
		return " 图书信息 [id=" + id + ", bookname=" + bookname + ", price=" + price + ", description=" + description
				+ "]";
	}
	
	public BookBean(int id, String bookname, int price, String description) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.description = description;
	}

	public BookBean() {
		// TODO 自动生成的构造函数存根
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
