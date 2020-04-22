package com.weilihang.bean;

import java.util.Date;

public class Heros {
	private int hid;
	private String hname;
	private double hprice;
	private Camp camp;
	private Date huptime;
	private int hstatus;
	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heros(int hid, String hname, double hprice, Camp camp, Date huptime, int hstatus) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hprice = hprice;
		this.camp = camp;
		this.huptime = huptime;
		this.hstatus = hstatus;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public double getHprice() {
		return hprice;
	}
	public void setHprice(double hprice) {
		this.hprice = hprice;
	}
	public Camp getCamp() {
		return camp;
	}
	public void setCamp(Camp camp) {
		this.camp = camp;
	}
	public Date getHuptime() {
		return huptime;
	}
	public void setHuptime(Date huptime) {
		this.huptime = huptime;
	}
	public int getHstatus() {
		return hstatus;
	}
	public void setHstatus(int hstatus) {
		this.hstatus = hstatus;
	}
	@Override
	public String toString() {
		return "Heros [hid=" + hid + ", hname=" + hname + ", hprice=" + hprice + ", camp=" + camp + ", huptime="
				+ huptime + ", hstatus=" + hstatus + "]";
	}
	
	
	
	
}
