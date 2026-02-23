package intro;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();

		// class level method calling
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();

	}

//	public void getData() {
//		System.out.println("Hello");
//	}
	public String getData() {
		System.out.println("Hello");
		return "Hello World";
	}

	public static String getData2() {
		System.out.println("Hello mayank");
		return "Hello World";
	}

}
