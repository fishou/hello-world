package com.alipay.ibatis;

import java.sql.Date;

public class Student {
	private int sid = 0;
	private String sname = null;
	private String major = null;
	private Date birth =  null;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "id:" + sid + " " + "name:" + sname + " " + "major:" + major + " " + "birth:" + birth;
	}
	
	
}
