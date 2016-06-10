package basic;
 
class B
{ public void sum(int a,int b)
	{int c=a+b;
	System.out.println("sum:"+c);
	}
}

public class SumB {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		B object= new B();
		object.sum(a, b);
		

	}

}
