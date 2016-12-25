public class ReverseNumber_StrinBuffer {
public static void main(String[] args) {
	
	int number=12345;
										//String number_string=String.valueOf(number);
										//StringBuffer string_buffer=new StringBuffer(number_string);
	StringBuffer string_buffer=new StringBuffer(String.valueOf(number));
										//string_buffer.reverse();
										//String reversed_string=string_buffer.toString();
										//String reversed_string=string_buffer.reverse().toString();
										//int reverse=Integer.parseUnsignedInt(reversed_string);
	int reverse=Integer.parseUnsignedInt(string_buffer.reverse().toString());	
	
	System.out.println("Reverse: "+reverse);
}
}

