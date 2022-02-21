package JavaProgramming;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Reverse of the string: " );
		System.out.println(sb.reverse().toString());

	}

}
