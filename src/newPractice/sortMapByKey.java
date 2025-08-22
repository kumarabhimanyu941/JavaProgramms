package newPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sortMapByKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Rohit", 57);
		map.put("Virat", 121);
		map.put("Jaddu", 37);
		map.put("Rahul", 76);

		// 1 Using Tree Map
		Map<String, Integer> sortedmap = new TreeMap<>(map);
		System.out.print(sortedmap);

		// 2 Using Streams
		System.out.println("--------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);

	}

}
