package Saturday;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitExample {

	public static void main(String[] args) {

       Stream<Integer> infiniteNumbers = Stream.iterate(2, i -> i * 2);
		
		
		Set<Integer> limit10 = infiniteNumbers.limit(5).collect(Collectors.toSet());

		
		System.out.println("Limit output with 5 : ");
		
		limit10.forEach(value -> System.out.println(value));


	}

}
