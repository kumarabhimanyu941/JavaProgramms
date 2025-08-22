package firstPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sortHashMapOnValues {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Hardik", 5);
		map.put("Virat", 100);
		map.put("Rohit", 57);
		map.put("Rahul", 40);

		// First Approach-By converting map to set to list and then using lambda
		// function
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList(set);

		Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		System.out.println("Map Sorted by Values::");

		list.forEach(s -> System.out.println(s.getKey() + "\t" + s.getValue()));
		
		// By directly using streams
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
