package LambdaExpAndFIs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortTreeMapUsingComparator {

	public static void main(String[] args) {

		Set set = new TreeSet();

		set.add("Java");
		set.add("Test");
		set.add("Random");

		//A TreeSet automatically sorts the values in ascending order
		System.out.println(set);
	
	}

}
