package practice1;

import java.util.stream.IntStream;

public class StreamsSumOfAllEvenNumInGivenRange {

	public static void main(String[] args) {
		
		
		int sum=IntStream.range(1, 10).filter(n->n%2==0).sum();
		System.out.println(sum);
		
		
	}
	
	
}

