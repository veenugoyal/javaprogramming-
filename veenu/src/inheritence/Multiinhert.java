package inheritence;



class D
{public void getmessage1()
	{System.out.println("1");
}}
class C extends D
{	public void getmessage3()
	{ System.out.println("3");}
}
class E extends C{
public void getmessage2() {

 System.out.println("4::");
}}
public  class Multiinhert{

	public static void main(String[] args) {
		E obj = new E();
		obj.getmessage1();
		obj.getmessage3();
		obj.getmessage2();
	}
	}


