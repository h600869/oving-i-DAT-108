package demo;

import java.util.*;

public class LambdaSortExample {

	public static void main(String[] args) {
		//	Create a list of names
		List<String> names = new ArrayList<>();
		names.add("Charlie");
		names.add("Alice");
		names.add("Eve");
		names.add("Bob");
        names.add("David");
       
        
        //	Sort the list using a lambda expression.
        Collections.sort(names, (a,b) -> a.compareTo(b));
        
        // Print the sorted list
        /* Remember that java prioritizes
         * Strings that start with a big
         * letters before the ones that
         * start with small letters
         * */
        System.out.println("Sorted names: ");
        for (String s:names) {
        	System.out.println(s);
        }
	}

}
