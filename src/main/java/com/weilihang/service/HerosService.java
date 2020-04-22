package com.weilihang.service;

import java.util.List;
import java.util.Map;

import com.weilihang.bean.Camp;
import com.weilihang.bean.Heros;

public interface HerosService {
	public List<Heros> findAll(Map<String, Object> map);
	public int insertHeros(Heros he);
	public List<Camp> findCamp();
	public Camp findCampByid(int cid);
	public int upHero(Heros he);
	public Heros findHeroByid(int hid);
}
