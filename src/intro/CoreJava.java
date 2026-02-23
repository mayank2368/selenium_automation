package intro;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Data types
		int myNum = 5;
		String myStr = "Mayank";
		char letter = 'r';
		double dec1 = 6.3;
		boolean myCard = true;

		// System.out.println(myNum + " is the num" );

		/////// Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] arr2 = { 1, 2, 3, 4, 5 };

		// System.out.println(arr2[0]);

		////// For loop
		///
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}

		String[] name = { "mayank", "gg", "helyu" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
