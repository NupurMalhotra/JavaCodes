import java.util.Scanner;
public class Addition
	{
		public static void main(String [] args)
		{
			Scanner inputA= new Scanner(System.in);
			Scanner inputB= new Scanner(System.in);
			
			System.out.println("Addition of 2 numbers");
			System.out.print("Enter one number: ");
			int num1= inputA.nextInt();
			
			System.out.print("Enter second number: ");
			int num2= inputA.nextInt();
			
			int sum= num1 + num2;
			System.out.println("Sum is " + sum);
		}
	}
			
			
			

