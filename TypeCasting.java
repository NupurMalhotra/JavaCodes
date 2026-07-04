import java.util.Scanner;
public class TypeCasting{
    public static void main(String [] args){
         Scanner input= new Scanner(System.in);
         System.out.print("Enter your marks: ");
         float marks= input.nextFloat();
         System.out.println("marks: "+ marks);

         Scanner inputm= new Scanner(System.in);
         int rollno= (int)intputm.nextInt();  //example of type casting
         System.out.println("roll no: "+ rollno);
    }
}