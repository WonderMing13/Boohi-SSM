package com.xujc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xujc.bean.Deal;
import com.xujc.bean.Order;
import com.xujc.bean.Rent;
import com.xujc.dao.DealMapper;
import com.xujc.dao.OrderMapper;

@Service
public class OrderService {
       
	@Autowired
	OrderMapper orderMapper;
	
	@Autowired
	DealMapper dealMapper;
	
	public void DeleteOrderPaper(List<String> list){
		orderMapper.deleteBathById(list);
	}
	
	public List<Deal> getDealorder(){
		  
		 List<Deal> list = dealMapper.selectByPrimaryKeywithOrder();
		 return list;
	}
	
//	public List<Rent> getRentorder(Model model){
//		List<Rent> list = 
//	}
}
