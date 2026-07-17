import java.util.Scanner;
public class Methods{
	public static void main (String [] args){
		Methods object= new Methods();
		Scanner scanA= new Scanner(System.in);
		System.out.print("Enter first number: ");
		int scana= scanA.nextInt();
		
		Scanner scanB= new Scanner(System.in);
		System.out.print("Enter second number: ");
		int scanb= scanB.nextInt();
		
		
		int result= object.number(scana, scanb);
		System.out.println("the sum is "+ result);
		
		// for string input:
		
		Scanner scaninput = new Scanner(System.in);
		System.out.print("today's day?: ");
		String scanresult= scaninput.next();
		
		String getmessage= object.words(scanresult);
		System.out.println(scanresult + getmessage);
		
	}
	
static int number(int a, int b){
	 int sum= a+b;
	 return sum;
}
static String words(String input){
	String message = " hello world!";
	return message;
}
}