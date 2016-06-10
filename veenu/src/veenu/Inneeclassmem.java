package veenu;
class outer
{ public void getdata()
	{
	System.out.println("1");
	class inerclass1
	{ public inerclass1()
		{ System.out.println("Inner class");}
		public void get(){
		System.out.println("method");
		}
	
	}  inerclass1 abc = new inerclass1();
	abc.get();
	}
	public void setdata()
	{ System.out.println("Outer class");
		}
	}
public class Inneeclassmem {
public static void main(String[]args)
{outer obj1 = new outer();
	obj1.getdata();
	outer obj2 = new outer();
	obj2.setdata();
	
}
}