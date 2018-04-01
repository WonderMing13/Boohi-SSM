package com.xujc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xujc.bean.Deal;
import com.xujc.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	  @RequestMapping("/Deal")
	  public String getDealOrder(Model model){
		  List<Deal> list = orderService.getDealorder();
		  model.addAttribute("dealinfo", list);  
		  return "info-order-deal";
	  }
	  
	  
	  @RequestMapping("/Rent")
	  public String getRentOrder(){
		  return "info-order-rent";
	  }

}
