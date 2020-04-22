package com.weilihang.service;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weilihang.bean.Camp;
import com.weilihang.bean.Heros;
import com.weilihang.mapper.HerosMapper;
@Service
public class HerosServiceImp implements HerosService{
	
	
	@Autowired
	HerosMapper mapper;
	
	@Override
	public List<Heros> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.findAll(map);
	}

	@Override
	public int insertHeros(Heros he) {
		// TODO Auto-generated method stub
		return mapper.insertHeros(he);
	}

	@Override
	public List<Camp> findCamp() {
		// TODO Auto-generated method stub
		return mapper.findCamp();
	}

	@Override
	public Camp findCampByid(int cid) {
		// TODO Auto-generated method stub
		return mapper.findCampByid(cid);
	}

	@Override
	public int upHero(Heros he) {
		// TODO Auto-generated method stub
		return mapper.upHero(he);
	}

	@Override
	public Heros findHeroByid(int hid) {
		// TODO Auto-generated method stub
		return mapper.findHeroByid(hid);
	}

}
