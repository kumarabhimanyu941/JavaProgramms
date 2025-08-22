package practice1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class sortMapByKeyAndValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Virat", 23);
		map.put("Rohit", 101);
		map.put("Jadeja", 67);
		map.put("KL", 123);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(x->System.out.print(x+" "));
       System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(x->System.out.print(x+" "));
		System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).forEach(x->System.out.print(x+" "));
		System.out.println();
       map.entrySet().stream().sorted(Map.Entry.comparingByValue((x,y)->(y-x))).forEach(x->System.out.print(x+" "));
	}

}
