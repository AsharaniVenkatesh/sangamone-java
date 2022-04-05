package JavaProgramming;

import java.util.Scanner;

public class ChartoInt {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word ");
		String myword=sc.nextLine();
		System.out.println("The Word is " +myword);
		//String input="welcome".toLowerCase();
		final String alphabet="abcdefghijklmnopqrtstuvwxzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for(int i=0;i<myword.length();i++) {
				System.out.println("The integer Value of " + i + " is " +alphabet.indexOf(myword.charAt(i)+1));
			}
	}

}
