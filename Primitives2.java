import java.util.Scanner;  //scanner is in-built class.

public class Primitives2
{
	public static void main(String []args)
	{
		/*now here, to access this Scanner 'class', we need an object*/ 
		 Scanner input= new Scanner(System.in);
		 Scanner inputInt= new Scanner(System.in);
		 
		 
		 System.out.print("- Enter your name: ");
		 String name= input.next();  //gave a datatype to the name i.e string
		 System.out.println("Your first name is " + name);
		 System.out.println("Your last name is " + input.next()+ "\n");
		 
		 System.out.print("- Enter your roll number: ");
		 int roll= inputInt.nextInt();  //inputInt = int datatype
		 System.out.println("Your roll number is " + roll);

	}
}
		 
		
		
			