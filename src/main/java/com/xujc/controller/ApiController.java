package com.xujc.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xujc.Common.Result;
import com.xujc.bean.TableName;
import com.xujc.service.ManagementService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/httpConn")
public class ApiController {
	
	@Autowired
	ManagementService managementService;
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
    public @ResponseBody Result postAll(@RequestBody String str){
		  Result result = new Result();
		  String rback="";
		  //获取表名
		  JSONObject tableName = JSONObject.fromObject(str);
		  Iterator it=tableName.keys();
		  List<String> list=new ArrayList<String>();
		  while(it.hasNext()){
			  list.add(it.next().toString());			  
		  }	
		  
		  if(list.get(0).equals(TableName.info_user.toString())){
			  JSONObject type=tableName.getJSONObject(list.get(0));
			  Iterator ituser=type.keys();
			  List<String> listuser=new ArrayList<String>();
			  while(ituser.hasNext()){
				  listuser.add(ituser.next().toString());
			  }
			  
			  
			  JSONArray data_add=type.getJSONArray(listuser.get(0));
			  if(data_add.isEmpty()){
				  rback="FAIL ";
			  }else{
				  JSONObject dataadd=new JSONObject();
				  List<Object> listadd=new ArrayList();
				  for(int i=0;i<data_add.size();i++){
					  dataadd=data_add.getJSONObject(i);
					  listadd.add(dataadd);
				  }	 
				  

				  String keys = "";
				 
				  String values = "";
				  for(int i=0;i<listadd.size();i++){
					  dataadd=(JSONObject)(listadd.get(i));
					  Iterator itadd = dataadd.keys();
					  while(itadd.hasNext()){
						  String key = (String) itadd.next();
						  String value = dataadd.getString(key);
						  keys= keys+ key+",";
						  values= values + "'"+value+"',";
					  }
					  
					  String keyfinall=keys.substring(0, keys.length()-1);
					  String valuefinall=values.substring(0, values.length()-1);
					  managementService.addApi(keyfinall, valuefinall);	
					  keys = "";
					  values = "";
					  
					  
				  }
				  
			  }
			  
		  }
		  
		  result.setMessage("false");
		  return result;
		
	}
	
	
	  @RequestMapping(value="/get",method=RequestMethod.POST)
	  public @ResponseBody Result getAll(@RequestBody String str){
		  
		  Result result = new Result();
		  JSONObject getname=JSONObject.fromObject(str);
		  Iterator it=getname.keys();
		  List<String> list=new ArrayList<String>();
		  while(it.hasNext()){
			  list.add(it.next().toString());			  
		  }	

		  String str_selec="";
		  String selec=getname.getString("selector");
		  if(selec.equals("")==false){
			  JSONArray jsonArray=JSONArray.fromObject(selec);
	          Object[] strs=jsonArray.toArray();
	          for(int i=0;i<strs.length;i++){
          	  str_selec +=strs[i] ;
          	  if(i != strs.length-1){
          		  str_selec +=",";
          	  }
            }
		  }
		
        String str_tableName = "";
        String tablename=getname.getString("tableName");
        if(tablename.equals("")==false){
      	  JSONArray jsonArray1=JSONArray.fromObject(tablename);
            Object[] strs1=jsonArray1.toArray();
            for(int i=0;i<strs1.length;i++){
          	  str_tableName +=strs1[i] ;
          	  if(i != strs1.length-1){
          		  str_tableName +=",";
          	  }
            }
        }
        
        
        String str_condi="";
        String con=getname.getString("condition");
        if(con.equals("")==false){
      	  str_condi = "where ";
      	  JSONArray jsonArray2=JSONArray.fromObject(con);
            Object[] strs2=jsonArray2.toArray();
            for(int i=0;i<strs2.length;i++){
          	  str_condi +=strs2[i] ;
          	  if(i != strs2.length-1){
          		  str_condi +=" and ";
          	  }
            }
        }
        
        String str_group="";
        String group=getname.getString("groupBy");
        if(str_group.equals("")==false){
      	  str_group="group by ";
      	  JSONArray jsonArray3=JSONArray.fromObject(group);
            Object[] strs3=jsonArray3.toArray();
            for(int i=0;i<strs3.length;i++){
          	  str_group +=strs3[i] ;
          	  if(i != strs3.length-1){
          		  str_group +=",";
          	  }
            }
        }
      
        
        String str_order="";
        String order=getname.getString("orderBy");
        if(str_order.equals("")==false){
      	  str_order="order by ";
      	  JSONArray jsonArray4=JSONArray.fromObject(order);
            Object[] strs4=jsonArray4.toArray();
            for(int i=0;i<strs4.length;i++){
          	  str_order +=strs4[i] ;
          	  if(i != strs4.length-1){
          		  str_order +=",";
          	  }
            }
            
            List<Map<String,Object>> map=managementService.selectApi(str_selec,str_tableName,str_condi,str_group,str_order);
        }
        
          result.setMessage("false");
		  return result;
	  }
}
