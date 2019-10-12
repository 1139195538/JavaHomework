package com.dao;

import com.bean.BookBean;

public interface BookDao {
	public void insert(BookBean bookbean)throws Exception;//插入
	public void update(BookBean bookbean)throws Exception;//更新
	public void delete(int id)throws Exception;//删除
	public BookBean query(int id)throws Exception;//查询
}
