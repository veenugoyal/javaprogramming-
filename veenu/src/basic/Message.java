package basic;

class Message1 {
	public static void getMessage1() {
		System.out.println("Jagte Raho !!");
	}
}

public class Message {

	public static void main(String[] args) {
		Message1 obj = new Message1();
		obj.getMessage1();
		
		Message1.getMessage1();
	}
}



