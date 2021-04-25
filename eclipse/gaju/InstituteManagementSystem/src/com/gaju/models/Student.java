package com.gaju.models;

public class Student {
	private int sid;
	private String sname;
	private Batch bach;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBach() {
		return bach;
	}
	public void setBach(Batch bach) {
		this.bach = bach;
	}

}
