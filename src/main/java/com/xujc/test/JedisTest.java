package com.xujc.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.xujc.bean.User;


import net.sf.json.JSONArray;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	

    
	@Test
	 public void testJedisSingle() {
		  //����һ��jedis�Ķ���
		  Jedis jedis = new Jedis("127.0.0.1",6379);
		  
		  //����jedis����ķ������������ƺ�redis������һ��
		  
		  jedis.set("key1", "jedis test");
		  
		  String string = jedis.get("key1");
		  
		  System.out.println(string);
		  
		  //�ر�jedis
		  jedis.close();
	 }
	
	/*
	 *  ʹ�����ӳ�
	 */
	 
	@Test
	  public void testJedisPool() {
		   //����jedis���ӳ�
		  JedisPool pool = new JedisPool("127.0.0.1",6379);
		  
		   //�����ӳ��л��Jedis����
		  
		  Jedis jedis = pool.getResource();
		  String string = jedis.get("key1");
		  System.out.println(string);
		  
		  //�ر�jedis
		  jedis.close();
		  pool.close();
	  }
	
	@Test
	public void testSpringJedis(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
	}
	

}
