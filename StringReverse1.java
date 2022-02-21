package JavaProgramming;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>-1;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse of String is : ");
		System.out.println(sb.toString());

	}

}
