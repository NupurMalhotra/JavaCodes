import java.util.Scanner;
public class Form{
	public static void main(String[] args){
		Scanner inputname= new Scanner(System.in);
		System.out.print("enter your name: ");
		String name= inputname.nextLine();
		
		Scanner inputclass= new Scanner(System.in);
		System.out.print("Enter your class: ");
		String myclass= inputclass.nextLine();
		
		Scanner inputroll= new Scanner(System.in);
		System.out.print("Enter your roll number: ");
		int roll= inputroll.nextInt();
		
		Scanner inputmarks= new Scanner(System.in);
		System.out.print("Enter your marks: ");
		float marks= inputmarks.nextFloat();
		
		System.out.println("-------------------------------------------- ");
		System.out.println("Student Details: ");
		System.out.println("Name: " + name);
		System.out.println("class: " + myclass);
		System.out.println("Roll no.: " + roll);
		System.out.println("Marks: " + marks);
	}
}
		
		
		