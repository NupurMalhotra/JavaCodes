import java.util.Scanner;

public class ScanBaby{
	public static void main (String [] args){
		System.out.println("Hello world!!");
		Scanner input= new Scanner(System.in);
		/*Scanner is the class, input is the object of that class
		here, system.in is used instead of system.out, cause we wanna use
		input form the keyword, thats why 'in' is used*/
		System.out.println("Enter any number:");
		System.out.println(input.nextInt());
		//aisa kyu?
	}
}
