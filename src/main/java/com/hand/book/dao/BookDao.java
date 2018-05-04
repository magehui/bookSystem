package com.hand.book.dao;

import java.util.List;

import com.hand.book.pojo.Book;

public interface BookDao {
	/**
	 * 根据书籍id查询书籍
	 * @param id
	 * @return
	 */
	Book queryBookByid(long bookid);
	boolean reduceBook(long bookId);
	List<Book> queryAllBook();
	List<Book> queryBookByName(String bookName);
}
