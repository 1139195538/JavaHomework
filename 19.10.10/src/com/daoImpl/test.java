package com.daoImpl;

import com.bean.BookBean;

public class test {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DaoImpl in=new DaoImpl();
		BookBean book=new BookBean(1,"java",10,"sda学了这本书会秃头sada");
		BookBean book1=new BookBean(2,"javaee",20,"sda学了这本书会秃头sada");
		BookBean bookx=new BookBean(1,"NOjava",10,"sda不学就不秃头了吗sada");
		//添加
		//in.insert(book);
		//in.insert(book1);
		//修改
		//in.update(book);
		//删除
		//in.delete(1);
		//in.delete(2);
		//查询
		//in.query(2);
	}

}
