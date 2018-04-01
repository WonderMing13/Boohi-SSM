package com.xujc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CommonInterceptor implements HandlerInterceptor {
	  
	    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {  
	  
	        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");  
	  
	        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");  
	  
	        httpServletResponse.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
	  
	        httpServletResponse.setHeader("X-Powered-By","Jetty");  
	  
	  
	        String method= httpServletRequest.getMethod();  
	  
	        if (method.equals("OPTIONS")){  
	            httpServletResponse.setStatus(200);  
	            return true;  
	        }  
	  
	        System.out.println(method);  
	  
	        return true;  
	    }  
	  
	    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {  
	  
	    }  
	  
	    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {  
	  
	    }  
	}  
