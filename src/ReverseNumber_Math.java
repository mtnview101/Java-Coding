
public class ReverseNumber_Math {
	public static void main(String[] args) {
		int number=12345;
		int reverse=0;
		int index=0;
		
		while(number!=0){

			reverse=reverse*10;System.out.println("reverse=reverse*10 \t\t"+reverse);
			reverse=reverse+number%10;System.out.println("reverse=reverse+number%10 \t"+reverse);
			number=number/10;System.out.println("number=number/10 \t\t"+number);
			System.out.println("------------------------------- index="+(index++)+" -------------------------------");
		}
		System.out.println("Reverse: "+reverse);
}}
