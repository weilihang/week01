package com.weilihang.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weilihang.bean.Camp;
import com.weilihang.bean.Heros;
import com.weilihang.service.HerosService;

@Controller
public class HerosController {

	@Autowired
	HerosService service;

	@RequestMapping("findAll")
	public String findAll(Model mo, @RequestParam(defaultValue = "1") int pageNum, int cid, int hstatus, int stprice,
			int endprice) {
		Map<String, Object> map = new HashMap<String, Object>();
		int pageSize = 3;
		PageHelper.startPage(pageNum, pageSize);
		map.put("cid", cid);
		map.put("hstatus", hstatus);
		map.put("stprice", stprice);
		map.put("endprice", endprice);
		List<Heros> list = service.findAll(map);
		PageInfo<Heros> p = new PageInfo<Heros>(list);
		mo.addAttribute("plist", p);
		return "list";
	}

	@RequestMapping("findCamp")
	@ResponseBody
	public List<Camp> findCamp() {
		List<Camp> list = service.findCamp();
		return list;
	}
	@RequestMapping("addHero")
	public String addHeros(Heros he,int cid){
		he.setHuptime(new Date());
		Camp c= new Camp();
		c.setCid(cid);
		he.setCamp(c);
		int i = service.insertHeros(he);
		if(i>0){
			return "forward:findAll";
		}else{
			return "add";
		}
	}
	@RequestMapping("gm")
	public String gmHero(int hid,Model model){
		Heros hero = service.findHeroByid(hid);
		
		
		model.addAttribute("list", hero);
		return "buy";
	}
	
	@RequestMapping("upHero")
	public String upHero(int hid){
		Heros h = new Heros();
		h.setHstatus(1);
		h.setHid(hid);
		int i = service.upHero(h);
		if(i>0){
			return "forward:findAll";
		}else{
			return "buy";
		}
	}
	@RequestMapping("show")
	public String showHeros(int hid,Model m){
		Heros heros = service.findHeroByid(hid);
		m.addAttribute("list", heros);
		return "shows";
	}
}
