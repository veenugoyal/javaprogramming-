package veenu;

class Outer1 {
	private static int i = 5;
	private static final int j = 7;

	class inner1 {
		int j = 14;

		public inner1() {
			System.out.println("INNER CLASS1");
		}

		public void getdata1() {
			System.out.println("innerclass1>> i:" + i);
			System.out.println("innerclass1>> j" + Outer1.j);
		}
	}

	// static inner class
	static class inner2 {
		public inner2() {
			System.out.println("Innerclass2");
		}

		static int j = 11;

		// static method of static inner class
		public static void getdata2() { // int j =9;
			System.out.println("innerclass2 static>> i" + i);
			System.out.println("innerclass2 static>> j" + j);
		}

		// method of static inner class
		public void setdata() {// int j=10;

			System.out.println("innerclass2 >> i" + i);
			System.out.println("innercalss2 >> j" + j);
		}
	}

	public void outerdata() {
		System.out.println("outerclass>> i" + i);
		System.out.println("outerclass>> j" + j);
		inner1 obj1 = new inner1();
		obj1.getdata1();
		inner2 obj2 = new inner2();
		obj2.getdata2();
		inner2 obj3 = new inner2();
		obj3.setdata();
		// to call static inner class directly
		inner2.getdata2();
	}
}

public class Memberclass {

	public static void main(String[] args) {
		Outer1 obj = new Outer1();
		obj.outerdata();

		Outer1.inner1 obj1 = new Outer1().new inner1();
		obj1.getdata1();

		Outer1.inner2 obj2 = new Outer1.inner2();
		obj2.getdata2();
		obj2.setdata();
	}

}
