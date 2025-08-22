package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsSecondSmallest {

	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(34,-90,87,1,45);
		
		int secondSmallest=list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
		System.err.println(secondSmallest);
	}
	
	
	
	
	
	
}
