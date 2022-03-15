package My_java;
import java.util.Scanner;
public class odd_even 
{
	int a;
	void show()
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
			System.out.println("The entered number is: Even");
		else
			System.out.println("The entered number is: Odd");		
	}
	public static void main(String[] args) 
	{
		odd_even r=new odd_even();
		r.show();
		
	}

}
