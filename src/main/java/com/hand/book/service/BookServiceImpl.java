package com.hand.book.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.book.dao.AppointmentDao;
import com.hand.book.dao.BookDao;
import com.hand.book.dto.AppointExecution;
import com.hand.book.exception.AppoinException;
import com.hand.book.exception.NoNumberException;
import com.hand.book.exception.RepeatAppointException;
import com.hand.book.pojo.Appointment;
import com.hand.book.pojo.Book;

public class BookServiceImpl implements BookService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private BookDao bookDao;
	@Autowired
	private AppointmentDao appointmentDao;

	public Book srchByBookId(long bookId) {
		Book book = bookDao.queryBookByid(bookId);
		return book;
	}

	public List<Book> srchAllBook() {
		return bookDao.queryAllBook();
	}

	public List<Book> srchBookByName(String bookName) {
		return bookDao.queryBookByName(bookName);
	}

	public List<Appointment> getAppointByStuId(long studentId) {
		return appointmentDao.queryAndReturnAppo(studentId);
	}

	public AppointExecution appoint(long bookId, long studentId) {
		boolean reduceBookFlag = bookDao.reduceBook(bookId);
		try {
			if (!reduceBookFlag) {
				throw new NoNumberException("no number");
			} else {
				// 执行预约操作
				boolean insertAppointmentFlag = appointmentDao.insertAppointment(studentId, bookId);
				if (!insertAppointmentFlag) {
					throw new RepeatAppointException("重复预约");
				} else {
					AppointExecution appointExecution = new AppointExecution();
					appointExecution.setBookId(bookId);
					appointExecution.setState(1);
					appointExecution.setStateInfo("预约成功");
					return appointExecution;
				}
			}
		} catch (NoNumberException e1) {
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 所有编译期异常转换为运行期异常
			throw new AppoinException("appoint inner error:" + e.getMessage());
		}
	}
}
