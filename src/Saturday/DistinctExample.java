package Saturday;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 30, 40, 40, 50, 70, 90, 90, 100);
		
	      System.out.println("List = "+list);
	      
	      System.out.println("Displaying only the distinct elements = ");
	      
	      list.stream().distinct().forEach(System.out::println);

	}

}
