package LambdaExpAndFIs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomeSortMapUsingComparatorInterface {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "API");
		map.put(4, "Random");

		// A TreeMap automatically sorts the values based on keys
		//If we need to sort it based on values,we need to use Streams
		System.out.println("map after descending sorting" + map);

	}

}
