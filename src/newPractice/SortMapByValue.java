package newPractice;

import java.util.HashMap;

import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Rohit", 57);
		map.put("Virat", 121);
		map.put("Jaddu", 37);
		map.put("Rahul", 76);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue((a, b) -> b.compareTo(a)))
				.forEachOrdered(System.out::println);

		System.out.println("-----------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue((a, b) -> a.compareTo(b)))
				.forEachOrdered(x -> System.out.println(x));

	}
}
