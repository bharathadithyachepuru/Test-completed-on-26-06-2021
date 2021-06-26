package Saturday;

//Manual conversion

import java.util.ArrayList;

public class AtoALMethod3 {

	public static void main(String[] args) {
		
		ArrayList<String> arraylist= new ArrayList<String>();

	    
	    String array[] = {"Bharath","Kareem","Sumanth","Venky"};   

	    
	    for(int i =0;i<array.length;i++)
           
	    {

	      arraylist.add(array[i]);
	    }

	    
	    for(String str: arraylist)
	    {
	         System.out.println(str);
	    }

	}

}
