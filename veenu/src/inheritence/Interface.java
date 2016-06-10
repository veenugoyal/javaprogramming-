package inheritence;

import java.util.Scanner;

interface SUM
{public void sum(int a,int b);

}
interface SUB
{public void sub(int a,int b);
}

class calculator implements SUM,SUB
{int c;
	public void sum (int a,int b ){
	int c=a+b;
	System.out.println("c  "+c);
}
	public void sub(int a,int b)
	{ int c=a-b;
	System.out.println("c  "+c);
}
}
public class Interface {

	public static void main(String[] args) {
		//input of a
		System.out.println("enter no.");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("no. a= "+a);
		//input of b
		System.out.println("enter no.");
		Scanner scan1 =new Scanner(System.in);
		int b=scan1.nextInt();
		System.out.println("no. b= "+b);
		calculator obj=new calculator();
		obj.sum(a, b);
		obj.sub(a, b);
		
		
	
		
	
	

	}

}
