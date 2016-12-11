
public class ReverseNumber_String {
public static void main(String[] args) {
	int number=12345;
	String num=String.valueOf(number);
	String result="";
	
	for (int i=num.length()-1;i>=0;i--){
		result=result+num.charAt(i);}
											//System.out.println(result);
	String reversed_string=result;
	int reverse=Integer.parseUnsignedInt(reversed_string);
	System.out.println("Reverse: "+reverse);
	
}
}
