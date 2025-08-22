package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamsTest {

	public static void main(String[] args) {

		// Multiple ways to create a stream
		// 1)
		List<String> list = Arrays.asList("Java", "Selenium", "API", "Postman");
		Stream<String> listStream = list.stream();

		// 2)
		int[] array = { 1, 2, 3, 4, 5, };
		IntStream intstream= Arrays.stream(array);

		
		//3)Create a stream using iterate
		
		Stream<Integer> stream1=Stream.iterate(0, n->n+1).limit(100);
		
		
		//4)Create a stream Using generate
		//Stream.generate;
	}
	
	
      	
	
	    

}
