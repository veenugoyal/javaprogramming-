package basic;

import java.util.Scanner;

public class Userinp {

	public static void main(String[] args) {
	int a = 0;
	int b;
	for(int i=0;i<2;i++)
	{Scanner scan= new Scanner(System.in);
     System.out.println("enter no.");
     int x = scan.nextInt();
      
     a=x+a;
    		
	}
	
	System.out.println("sum:"+a);
	}
}
