package com.xujc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {
	@RequestMapping("/Data")
    public String getData(){
    	return "data";
    }
}
