package com.xujc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatController {
    @RequestMapping("/Ord")
    public String getStateOrd(){
    	return "orderchart";
    }
    
    @RequestMapping("/Sea")
    public String getStateSearch(){
    	return "search-engine";
    }
}
