import java.util.Arrays;

public class DuplicateNumbers_Array {
public static void main(String[] args) {
			int[] numbers= {50,55,21,55,2,12,21,21,21,21};
	Arrays.sort(numbers); //2,12,21,21,21,21,21,50,55,55
	for (int i=1;i< numbers.length;i++){
		if (numbers[i]==numbers[i-1]) System.out.println("Duplicate: "+numbers[i-1]);
	}
	
}
}
