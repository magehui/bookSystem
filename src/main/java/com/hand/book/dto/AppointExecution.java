package com.hand.book.dto;

public class AppointExecution {
	//图书Id
	private long bookId;
	//预约结果的状态
	private int state;
	//状态标识
	private String stateInfo;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	
}	
