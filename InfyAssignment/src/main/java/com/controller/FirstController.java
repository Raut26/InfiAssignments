package com.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exception.InvalidFormatException;

@Controller
public class FirstController {
	
	
	@RequestMapping("/")
	public String welcome()
	{
		
		return "first";
	}
	
	
	@RequestMapping("/sub")
	public ModelAndView get(@RequestParam String list) 
	{
		String even="",odd="",nan="";
		
		Map<String, String> map=new HashMap();
		
		if(list.contains(" ") || list.contains("."))
		{
			
			InvalidFormatException e=new InvalidFormatException("Please Specify Correct Format");
		
		return new ModelAndView("errorPage","data",e);
		}
		
			
		if(!list.isEmpty())
		{
		
		String listarr[]=list.split(",");
		
		
		
		List<String> al =Arrays.asList(listarr);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String ob=(String)itr.next();
			
			
			try{
			int number=Integer.parseInt(ob);
			
			if(number%2==0)
			{
				
				even+=number+"  ";
				
			}
			else
			{
				
				odd+=number+"  ";
				
			}
			
			}
			
			catch(NumberFormatException e)
			{
				nan+=ob+"  ";
				
			}
			
			
			
		}
		
	
		
		map.put("Even Number", even);
		map.put("Odd Number", odd);
		map.put("Not a Number", nan);
		
		return new ModelAndView("success","data",map);
		
		}
		else
		{
			
			return new ModelAndView("first","data","Please enter valid value");
			
		}
		
		
		
	}
	

}
