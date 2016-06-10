package inheritence;



class A
{public void getmessage1()
	{System.out.println("1");
}}
class B extends A
{public void getmessage2() {

 System.out.println("2");
}}
public  class Inhert{

	public static void main(String[] args) {
		B obj = new B();
		obj.getmessage1();
		obj.getmessage2();
	}
	}


