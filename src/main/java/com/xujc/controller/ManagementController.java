package com.xujc.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xujc.bean.User;
import com.xujc.service.ManagementService;

@Controller
public class ManagementController {
	
	@Autowired
	ManagementService managemetService;
	
    @RequestMapping("/Man")
    public String getManagement(@RequestParam (value="pn",defaultValue="1")Integer pn,Model model){
    	PageHelper.startPage(pn,3);
    	List<User> list=managemetService.getAllinfo();
    	PageInfo page = new PageInfo(list);
   	    model.addAttribute("pageInfo", page);
    	model.addAttribute("userinfo", list);
    	return "info-management-user";
    }
    
    @RequestMapping(value="/Manchange/{id}", method=RequestMethod.POST)
	   public String getUser(@PathVariable(value="id") Integer id,@RequestParam(value="userId") String userid,@RequestParam(value="userPassword") String userPassword,@RequestParam(value="userName") String userName,@RequestParam(value="userstNumber") String userstNumber,@RequestParam(value="userGender") String userGender,@RequestParam(value="userWallet") Double userWallet,@RequestParam(value="userPhone") String userPhone,@RequestParam(value="userSchool") String userSchool,@RequestParam(value="userMajor") String userMajor,@RequestParam(value="userDepartment") String userDepartment,@RequestParam(value="userAddress") String userAddress,@RequestParam(value="userEmail") String userEmail)
	{
	     User user = new User(id,userid,userPassword,userName,userstNumber,userGender,userWallet,userPhone,userSchool,userMajor,userDepartment,userAddress,userEmail);
	     managemetService.updateUser(user);
		 return "redirect:/Man"; 
	}
    
    @RequestMapping("/ManDele")
	@ResponseBody
	public Integer create(@RequestParam(value="id")String[] id){		
		managemetService.deleteUser(Arrays.asList(id));
		return 0;
	}
    
    
}
