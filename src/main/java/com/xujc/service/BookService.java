package com.xujc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xujc.bean.Book;
import com.xujc.bean.Electronic;
import com.xujc.bean.Paper;
import com.xujc.dao.BookMapper;
import com.xujc.dao.ElectronicMapper;
import com.xujc.dao.PaperMapper;

@Service
public class BookService {
	
	@Autowired
	ElectronicMapper electronicMapper;
	
	@Autowired
	PaperMapper paperMapper;
	
	@Autowired
	BookMapper bookMapper;
	
	public List<Electronic> getElectronicBook(){
		return electronicMapper.selectByPrimaryKeywithbook(null);
	}
    
	public List<Paper> getPaperBook(){
		return  paperMapper.selectByPrimaryKeywithbook();
	}
	
	public void UpdatePaperbook(Book book){
		bookMapper.updateByPrimaryKeySelective(book);
	}
	
	public void UpdatePaper(Paper paper){
		paperMapper.updateByPrimaryKeySelective(paper);
	}
	
	public void DeletePaper(List<String> list){
		paperMapper.deleteBathById(list);
	}
	
	public void DeletePaperbook(List<String> list){
		bookMapper.deleteBathById(list);
	}
	
	public void AddPaperbook(Book book){
		bookMapper.insertSelective(book);
	}
	
	public void AddPaper(Paper paper){
		paperMapper.insertSelective(paper);
	}
}
