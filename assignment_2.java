package My_java;

import java.util.Scanner;

public class assignment_2 
{
	int a;
	void show()
	{
		System.out.println("Enter a  number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		String b=a>0?"positive number":"Negative number";
		System.out.println("The entered number is: "+b);
		s.close();
		
		
	}

	public static void main(String[] args) 
	{
		assignment_2 q=new assignment_2();
		q.show();

	}

}
