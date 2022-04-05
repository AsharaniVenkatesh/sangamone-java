package JavaProgramming;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1234;
		int rev=0;
		while(number!=0) {
			int remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
		System.out.println("The reverse of number is:"  + rev);

	}

}
