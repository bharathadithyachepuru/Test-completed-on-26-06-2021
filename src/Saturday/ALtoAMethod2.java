package Saturday;

import java.util.ArrayList;

public class ALtoAMethod2 {

	public static void main(String[] args) {

		ArrayList<String> friendsnames= new ArrayList<String>();
		
		friendsnames.add("Manikanta");
		friendsnames.add("Sai manoj");
		friendsnames.add("Shivaram");
		friendsnames.add("Rohit");

		
		String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

		
		for(String k: frnames)
		{
			System.out.println(k);
		}

	}

}
