import java.util.Scanner;

public class ScanPrimitive{
	public static void main(String [] args){
		
	System.out.print("Enter your full name: ");	

	Scanner input= new Scanner(System.in);
	
	String name= input.next();
	
	System.out.println("Your first name is " + name + ".");	
	String lname= input.next();
	System.out.println("Your last name is " + lname + ".");
	}
}
	