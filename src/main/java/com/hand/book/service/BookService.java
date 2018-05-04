package com.hand.book.service;

import java.util.List;

import com.hand.book.dto.AppointExecution;
import com.hand.book.pojo.Appointment;
import com.hand.book.pojo.Book;

public interface BookService {
	/**
	 * 根据id查询图书
	 * 
	 * @param BookId
	 * @return
	 */
	Book srchByBookId(long bookId);

	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<Book> srchAllBook();

	/**
	 * 按照图书名称查询 按条件搜索图书
	 * 
	 */
	List<Book> srchBookByName(String bookName);

	/**
	 * 查看某学生预约的所有图书
	 * 
	 * @param studentId
	 * @return
	 */
	List<Appointment> getAppointByStuId(long studentId);

	/**
	 * 预约图书
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);// 返回预约成功的实体类
}
