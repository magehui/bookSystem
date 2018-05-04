package com.hand.book.dao;

import java.util.List;

import com.hand.book.pojo.Appointment;

public interface AppointmentDao {
	/**
	 * 根据学生id来查询一个学生预约的书籍有哪些
	 * @param studentId
	 * @return
	 */
	List<Appointment> queryAndReturnAppo(long studentId);
	/**
	 * 根据学生id和书籍id来进行预约
	 * @param studentId
	 * @param bookId
	 * @return
	 */
	boolean insertAppointment(long studentId,long bookId);
}
