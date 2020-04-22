package com.weilihang.bean;

import java.util.List;

public class Camp {
	private int cid;
	private String cname;
	private List<Heros> heros;
	public Camp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camp(int cid, String cname, List<Heros> heros) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.heros = heros;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Heros> getHeros() {
		return heros;
	}
	public void setHeros(List<Heros> heros) {
		this.heros = heros;
	}
	@Override
	public String toString() {
		return "Camp [cid=" + cid + ", cname=" + cname + ", heros=" + heros + "]";
	}
	
	
	
}
