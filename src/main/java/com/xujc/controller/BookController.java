package com.xujc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xujc.bean.Book;
import com.xujc.bean.Electronic;
import com.xujc.bean.Paper;
import com.xujc.service.BookService;
import com.xujc.service.OrderService;

@Controller
public class BookController {
	  @Autowired
	  BookService bookService;
	  
	  @Autowired
	  OrderService orderService;
	
      @RequestMapping("/Ele")
      public String getElectronicBook(Model model){
    	  List<Electronic> list = bookService.getElectronicBook();
    	  model.addAttribute("Eleinfo", list);
    	  return "books-info-electronic";
      }
      
      
      @RequestMapping("/Com")
      public String getCommonBook(Model model){
    	  List<Paper> list=bookService.getPaperBook();
    	  model.addAttribute("Paperinfo", list);
    	  return "books-info-common";
      }
      
      @RequestMapping(value="/Paperchange/{id}", method=RequestMethod.POST)
  	public String updatePaper(@PathVariable(value="id") Integer id,@RequestParam(value="paperBookid") String paperBookid,@RequestParam(value="bookname") String bookname,@RequestParam(value="bookeditor") String bookeditor,@RequestParam(value="bookpress") String bookpress,@RequestParam(value="bookpublicationdate") String bookpublicationdate,@RequestParam(value="bookisbn") String bookisbn,@RequestParam(value="bookcategory") String bookcategory,@RequestParam(value="imgPath") String imgPath,@RequestParam(value="paperBidprice") Double paperBidprice,@RequestParam(value="paperOnsalenum") Integer paperOnsalenum){
  		Book book=new Book(id,paperBookid,bookname,bookeditor,bookpress,bookpublicationdate,bookisbn,bookcategory,imgPath);
  		Paper paper=new Paper(id,paperBookid,paperBidprice,paperOnsalenum);		
  		bookService.UpdatePaperbook(book);
  		bookService.UpdatePaper(paper);
  		return "redirect:/Com";
  	}
  	
  	@RequestMapping("/PaperDele")
  	@ResponseBody
  	public Integer deletePaper(@RequestParam(value="bookid") String[] bookid){
  		  bookService.DeletePaper(Arrays.asList(bookid));
  		  orderService.DeleteOrderPaper(Arrays.asList(bookid));
  		  bookService.DeletePaperbook(Arrays.asList(bookid)); 		  
  		return 0;
  	}
  	
  	@RequestMapping("/PaperAdd")
  	public String addPaper(@RequestParam(value="paperBookid") String paperBookid,@RequestParam(value="bookname") String bookname,@RequestParam(value="bookeditor") String bookeditor,@RequestParam(value="bookpress") String bookpress,@RequestParam(value="bookpublicationdate") String bookpublicationdate,@RequestParam(value="bookisbn") String bookisbn,@RequestParam(value="bookcategory") String bookcategory,@RequestParam(value="imgPath") String imgPath,@RequestParam(value="paperBidprice") Double paperBidprice,@RequestParam(value="paperOnsalenum") Integer paperOnsalenum){
  		Book book=new Book(null,paperBookid,bookname,bookeditor,bookpress,bookpublicationdate,bookisbn,bookcategory,imgPath);
  		bookService.AddPaperbook(book);
  		Paper paper=new Paper(null,paperBookid,paperBidprice,paperOnsalenum);	
  		bookService.AddPaper(paper);
  		return "redirect:/Com";
  	}
}
