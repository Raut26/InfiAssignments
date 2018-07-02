package com.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	
	@RequestMapping(value="/sub", method=RequestMethod.POST)
	public ModelAndView get(@ModelAttribute("list") Listmodel l) 
	{
	
		
		
		String list=String.valueOf(l);
		
		
		
		if(list.contains(" ") || list.contains("."))
		{
			
			InvalidFormatException e=new InvalidFormatException("Please Specify Correct Format");
		
		return new ModelAndView("errorPage","data",e);
		}
		if(!list.isEmpty())
		{
		
			HashMap<String, String> map=validate(list);
				
			return new ModelAndView("success","data",map);
			
		}
		else
		{
			return new ModelAndView("first","data","Please enter valid value");
		}
		
		
	}


	public  HashMap<String, String> validate(String list) {
		
		String even="",odd="",nan="";
		
		HashMap<String, String> map=new HashMap();
		
		
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
		
		return map;
		

		
	}
	

}
