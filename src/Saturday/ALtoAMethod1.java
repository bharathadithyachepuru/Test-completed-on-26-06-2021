package Saturday;

//Using ArrayList get() method

import java.util.ArrayList;

public class ALtoAMethod1 {

	public static void main(String[] args) {

		ArrayList<String> arrlist= new ArrayList<String>();
		
		arrlist.add("Bharath");
		arrlist.add("Kareem");
		arrlist.add("Sumanth");
		arrlist.add("Venky");

		
		String array[] = new String[arrlist.size()];
		
		for(int j =0;j<arrlist.size();j++){
			
		  array[j] = arrlist.get(j);
		}

		
		for(String s: array)
		{
			System.out.println(s);
		}

	}

}
