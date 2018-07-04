package infy.assignment.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import infy.assignment.exception.InvalidFormatException;
import infy.assignment.model.Listmodel;
import infy.assignment.service.IdentifyNumberService;


@Controller
public class IdentifyNumberController {
	
	@Autowired
	IdentifyNumberService service;
	
	
	
/**
 *Getting first page for enter the list of values
 *
 */
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
/**
 * Accept list of values
 * @throws IOException 
 * @throws InvalidFormatException 
 *
 */
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView get(@ModelAttribute("list") Listmodel l){
		String list = String.valueOf(l);
		try {
			if (list.contains(" ") || list.contains(".")) {
				throw new InvalidFormatException("Please Specify Correct Format");
			}
		}
		catch (InvalidFormatException e) {
			return new ModelAndView("errorPage", "data", e);
		}
		if (!list.isEmpty()) {
			HashMap<String, String> map = service.search(list);
			return new ModelAndView("success", "data", map);
		} else 
			return new ModelAndView("first", "data", "Please enter valid value");
		}
	}

