package Saturday;

//using Arrays.asList()

import java.util.ArrayList;
import java.util.Arrays;

public class AtoALMethod1 {

	public static void main(String[] args) {

		 String citynames[]={"Mumbai", "Chennai", "Hyderabad", "Banglore"};

		  
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

		
		  citylist.add("Vizag");
		  citylist.add("Pune");

		  
		  for (String str: citylist)
		  {
			System.out.println(str);
	       	  }

	}

}
