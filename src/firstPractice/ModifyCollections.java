package firstPractice;

import java.util.ArrayList;
import java.util.List;

public class ModifyCollections {

	public static void main(String[] args) {

		List<String> strList = new ArrayList();
		strList.add("Abhimanyu");
		strList.add("Automation");
		strList.add("randomValue");

		for (String str : strList) {
			strList.remove(str);
		}

	}

}
