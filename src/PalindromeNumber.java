
public class PalindromeNumber {
public static void main(String[] args) {
	int number=454;
	int reverse=0;
	int origin=number;
	
	while (number>0){
		reverse=reverse*10;
		reverse=reverse+number%10;
		number=number/10;
	}
	if (origin==reverse) {System.out.println(origin+" is palindrome number");}
	else
	System.out.println(origin+" is NOT palindrome number");
}
}
