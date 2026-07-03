import java.util.Scanner;
public class TypeCasting{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your marks: ");
       float marks= input.nextFloat();
        System.out.println("marks: "+ marks);

        
    int rollno= (int)12.34f;  //example of type casting
         System.out.println("roll no: "+ rollno);
    }
}