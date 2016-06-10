package basic;
class C
{public int sub(int a,int b)
	{int c=a-b;
	return c;
	}
}
public class SumC {

	public static void main(String[] args) {
		int a=18;
		int b=5;
		int c;
		C obj= new C();
		System.out.println("sub:"+obj.sub(a,b));

	}

}
