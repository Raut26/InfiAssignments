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


/**
 *Getting first page for enter the list of values
 *
 */
	@RequestMapping("/")
	public String welcome() {

		return "first";
	}

/**
 * Accept list of values
 *
 */
	@RequestMapping(value = "/sub", method = RequestMethod.POST)
	public ModelAndView get(@ModelAttribute("list") Listmodel l) {

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

			HashMap<String, String> map = validate(list);

			return new ModelAndView("success", "data", map);

		} else {
			return new ModelAndView("first", "data", "Please enter valid value");
		}

	}
	

/**
 * Accept only comma separated value
 * Perform operation on list of values without any dot and spaces.
 */

	public HashMap<String, String> validate(String list) {

		String even = "", odd = "", nan = "";

		HashMap<String, String> map = new HashMap();

		String listarr[] = list.split(",");

		List<String> al = Arrays.asList(listarr);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String ob = (String) itr.next();

			try {
				int number = Integer.parseInt(ob);

				if (number % 2 == 0) {

					even += number + "  ";

				} else {

					odd += number + "  ";

				}

			}

			catch (NumberFormatException e) {
				nan += ob + "  ";

			}

		}


/**
 * Each value stored into map
 *
 */
		map.put("Even Number", even);
		map.put("Odd Number", odd);
		map.put("Not a Number", nan);

		return map;

	}

}
