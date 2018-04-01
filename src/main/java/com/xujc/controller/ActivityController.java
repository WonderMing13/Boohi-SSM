package com.xujc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivityController {
	@RequestMapping("/Act")
    public String getActivity(){
   	 return "activity-management";
    }
	
	@RequestMapping("/Aut")
	public String getAutority(){
		return "authority-management";
	}
	
	@RequestMapping("/Exp")
	public String getExperience(){
		return "experience-exchange";
	}
}
