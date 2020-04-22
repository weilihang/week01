package com.bw.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.weilihang.bean.Heros;
import com.weilihang.service.HerosService;

public class MyTest {
	
	
	@Test
	public void test01(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Map<String, Object> map = new HashMap<String, Object>();
		HerosService se = (HerosService) app.getBean("HerosServiceImp");
		List<Heros> list = se.findAll(map);
		for (Heros heros : list) {
			System.out.println(heros);
		}
	}
	@Test
	public void test02(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Map<String, Object> map = new HashMap<String, Object>();
		HerosService se = (HerosService) app.getBean("HerosServiceImp");
		Heros heros = se.findHeroByid(1);
		System.out.println(heros);
	}@Test
	public void test03(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Map<String, Object> map = new HashMap<String, Object>();
		HerosService se = (HerosService) app.getBean("HerosServiceImp");
		Heros he = new Heros();
	
		int i = se.upHero(he);
		if(i>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	
	
	
}
