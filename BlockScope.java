public class BlockScope{
	public static void main(String []args){
		int a= 10;

		System.out.println("a= "+a);
		{
			 a= 68;
			 int b= 20;
			System.out.println("a= "+a);
			// System.out.println("b= "+b);
		}
		//outside the block scope tho
		System.out.println("now a= "+a);
					System.out.println("b= "+b);
	}
}