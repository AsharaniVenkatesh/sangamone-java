package JavaProgramming;

import java.util.Scanner;

public class StringReverse3 {
	public static void main(String args[]) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>-1;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String is: ");
		System.out.println(rev);
		
	}

}
