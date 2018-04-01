package com.xujc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xujc.bean.User;
import com.xujc.dao.UserMapper;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class ManagementService {
	@Autowired
	UserMapper userMapper;
	private static String PERSON_KEY = "User";

	
	public List<User> getAllinfo(){
    	//从缓存中取内容
//    	try{
//    		 String result = jedisClient.hget("用户信息", "userlist");
//   		if(result !=null || result.isEmpty() == false){
//   			 JSONArray jsonArray = JSONArray.fromObject(result);
//    	     List<User> listuser = (List<User>)JSONArray.toCollection(jsonArray, User.class);
//    		 return listuser;
//   		 }
//    	}catch(Exception e){
//    		e.printStackTrace();
//    	}
	     
    	//第一次调用用于分页
    	List<User> list = userMapper.selectByExample(null);
    	
    	//第二次调用用于缓存redis
//        List<User> listredis = userMapper.selectByExample(null);
//
//    	//向缓存中添加内容
//    	try{
//    		//把list转换成字符串
//    		JSONArray json = JSONArray.fromObject(listredis);
//    		String cacheString = json.toString();
//    		jedisClient.hset("用户信息", "userlist", cacheString);
//    	} catch(Exception e){
//    		e.printStackTrace();
//    	}
    	
    	return list;	 
    }
    
    public void updateUser(User user){
    	userMapper.updateByPrimaryKeySelective(user);
    }
    
   public void deleteUser(List<String> list){
	   userMapper.deleteBathById(list);
   }
   
   public void addApi(String keys,String values){
	   userMapper.insertApi(keys,values);
   }
   
	public List<Map<String,Object>> selectApi(String selector,String tablename,String condition,String group,String order){
		List<Map<String, Object>> map=userMapper.selectApi(selector,tablename,condition,group,order);
		return map;
		
	}
}
