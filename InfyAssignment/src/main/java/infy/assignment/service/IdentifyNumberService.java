package infy.assignment.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IdentifyNumberService {
	
	/**
	 * Accept only comma separated value
	 * Perform operation on list of values without any dot and spaces.
	 */
	
	public HashMap<String, String> search(String list) {
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
