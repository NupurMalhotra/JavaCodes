import java.util.Scanner;
class Sum{
	static void display1(int x, int y){
        System.out.println("the sum is "+ (x+y));
	}
}	
class Sub{
	static void display2(int x, int y){
        System.out.println("the ans is "+ (x-y));
	}
}	
/*class Mult{
	static void display(int x, int y){
        System.out.println("the ans is "+ (x-y));
	}
}	*/

public class Calculator1{
public static void main(String []args){
	Sum object1= new Sum();
	Sub object2= new Sub();
	Scanner inputx= new Scanner(System.in);
	Scanner inputy= new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int intx= inputx.nextInt();
	
	System.out.print("Enter second number: ");
	int inty= inputy.nextInt();
	
	Scanner result= new Scanner(System.in);
	System.out.print("+ or -? ");
	String myresult= result.next();
	
	if(myresult == "+")
	{
		object1.display1(intx, inty);
	}
	else if (myresult== "-")
	{
		object2.display2( intx, inty);
	}
	else{
		System.out.println("invalid expression");
	}
	
		
		
	
}
}
	