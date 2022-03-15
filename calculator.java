package My_java;

public class calculator 
{
	int x;int y;
	void add()
	{
		x=15;y=20;
		System.out.println("The sum is "+(x+y));
	}
	void sub()
	{
		x=15;y=10;
		System.out.println("The subtraction is "+(x-y));
	}

	public static void main(String[] args) 
	{
		calculator w=new calculator();
		w.add();
		w.sub();
		
	}

}
