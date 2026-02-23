package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// COnditional statements inside for loop
		String[] name = { "mayank", "gg", "helyu" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (String s : name) {
			System.out.println(s);
		}

		int[] arr3 = { 23, 43, 65, 4, 6, 8 };

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] % 2 == 0) {
				System.out.println(arr3[i]);
				break;
			} else {
				System.out.println(arr3[i] + " is not divided by 2");
			}
		}

		// ArrayList
		List<String> a = new ArrayList<String>();
		a.add("Mayank");
		a.add("Hello");
		a.add("wie gehts");
		System.out.println(a.get(2));

		/////// Iterate over arrays and array lists
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		for (String val : a) {
			System.out.println(val);
		}

		// find if item is present in the arrayList
		System.out.println(a.contains("Mayank"));
		String[] name1 = { "Mayank", "Parvatia" };
		List<String> nameArrayList = Arrays.asList(name1);
		nameArrayList.contains("Parvatia");
	}

}
