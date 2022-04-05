package JavaProgramming;

import java.util.Scanner;

public class ReverseOfNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Number");

		
		//int number=1234;
	 // Numerical input
	    int num1 =number.nextInt();
		int rev=0;
		while(num1!=0) {
			int remainder=num1%10;
			rev=rev*10+remainder;
			num1=num1/10;
		}
		System.out.println("The reverse of number is:"  + rev);

	}

}
