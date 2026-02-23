package intro;

public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String literals // String is an object that represents sequence of characters

		// String s = "Hello how you?";
		String s1 = "Hello how you?";
		String d = "Wow";

		// new
		String e = new String("Hello how you?");
		String e1 = new String("wowoowowow");
		String e2 = new String("wowoowowow");

		String[] splittedStrings = e.split("how");
		System.out.println(splittedStrings[0]);
		System.out.println(splittedStrings[1]);
		// System.out.println(splittedStrings[2]);
		System.out.println(splittedStrings[1].trim());

		// print 1 char at a time in reverse
		for (int i = e.length() - 1; i >= 0; i--) {
			System.out.println(e.charAt(i));
		}

		// print 1 char at a time
		for (int i = 0; i < e.length(); i++) {
			System.out.println(e.charAt(i));
		}

	}

}
