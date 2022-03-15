package My_java;
import java.util.Scanner;
public class assignment_1 
{
	int mark;
	String a;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		mark=s.nextInt();
		a=mark>=40?"pass":"fail";
		System.out.println("Your result : "+a);
		s.close();
		
	}

	public static void main(String[] args) 
	{
		assignment_1 a=new assignment_1();
		a.input();
		
	}

}
