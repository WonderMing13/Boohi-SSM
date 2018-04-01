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
		  //创建一个jedis的对象
		  Jedis jedis = new Jedis("127.0.0.1",6379);
		  
		  //调用jedis对象的方法，方法名称和redis的命令一致
		  
		  jedis.set("key1", "jedis test");
		  
		  String string = jedis.get("key1");
		  
		  System.out.println(string);
		  
		  //关闭jedis
		  jedis.close();
	 }
	
	/*
	 *  使用连接池
	 */
	 
	@Test
	  public void testJedisPool() {
		   //创建jedis连接池
		  JedisPool pool = new JedisPool("127.0.0.1",6379);
		  
		   //从连接池中获得Jedis对象
		  
		  Jedis jedis = pool.getResource();
		  String string = jedis.get("key1");
		  System.out.println(string);
		  
		  //关闭jedis
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
