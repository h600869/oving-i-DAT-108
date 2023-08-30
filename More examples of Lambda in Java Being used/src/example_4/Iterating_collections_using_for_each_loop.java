package example_4;

import java.util.*;

public class Iterating_collections_using_for_each_loop {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");       
	    list.add("Daryl");         
	    list.add("Glenn");         
	    list.add("Carl");
	    list.forEach(
	    	//Lambda expression to
	    	// print out each name
	    	// in list
	    	(names) -> System.out.println(names)
	    		);
	}

}
