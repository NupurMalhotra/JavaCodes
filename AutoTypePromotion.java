
public class AutoTypePromotion{
	public static void main(String []args){
		int a= 257;
		System.out.println(a);
		byte b= (byte)(a); //type change krdi explicitly
		
		/* now here if i change the dt of a to byte, then it wont run 
		and will give me an error. now i want to display a as a byte datatype,
		but instead of showing 256 and one extra it gave me 1 as an output.
		why tho?*/
		
	}
}
		