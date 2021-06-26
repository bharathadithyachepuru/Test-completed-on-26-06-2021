package Saturday;

//collections.addAll method

import java.util.ArrayList;
import java.util.Collections;

public class AtoALMethod2 {

	public static void main(String[] args) {

		 String array[]={"Hi", "Hello", "How", "what"};

		    
		    ArrayList<String> arraylist= new ArrayList<String>();

		    
		    Collections.addAll(arraylist, array);

		    
		    arraylist.add("why");
		    arraylist.add("where");

		    
		    for (String str: arraylist)
		    {
		 	System.out.println(str);
		    }

	}

}
