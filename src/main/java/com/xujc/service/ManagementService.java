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
    	//�ӻ�����ȡ����
//    	try{
//    		 String result = jedisClient.hget("�û���Ϣ", "userlist");
//   		if(result !=null || result.isEmpty() == false){
//   			 JSONArray jsonArray = JSONArray.fromObject(result);
//    	     List<User> listuser = (List<User>)JSONArray.toCollection(jsonArray, User.class);
//    		 return listuser;
//   		 }
//    	}catch(Exception e){
//    		e.printStackTrace();
//    	}
	     
    	//��һ�ε������ڷ�ҳ
    	List<User> list = userMapper.selectByExample(null);
    	
    	//�ڶ��ε������ڻ���redis
//        List<User> listredis = userMapper.selectByExample(null);
//
//    	//�򻺴����������
//    	try{
//    		//��listת�����ַ���
//    		JSONArray json = JSONArray.fromObject(listredis);
//    		String cacheString = json.toString();
//    		jedisClient.hset("�û���Ϣ", "userlist", cacheString);
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
