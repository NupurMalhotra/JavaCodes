import java.util.Scanner;
class Addition{
public static int add(int a, int b){
	int sum= a+b;
	return sum;
}
}
public class Method1{
	public static void main(String[] args){
		Addition sbj= new Addition();
		Scanner inputa= new Scanner(System.in);
		Scanner inputb= new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a_input= inputa.nextInt();
		
		System.out.print("Enter the second number: ");
		int b_input= inputb.nextInt();
		
		int result= sbj.add(a_input, b_input);
		System.out.println("sum= "+ result);
		
	}
}
	