package JavaProgramming;


import java.util.*;

public class NewClass
{
	public static void main(String[] args)
	{

		int length = 10;//length of the password
		System.out.println(asha_Password(length));
	}
	static char[] asha_Password(int len)
	{

		// Using random method
		Random rm = new Random();


		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

		//concatenating all the strings
		String values = Capital_chars + Small_chars +
						numbers + symbols;
		
		System.out.println(" Password is Generated using random() Method : ");
		System.out.print("Your generated  password is : ");


		char[] password = new char[len];

		for (int i = 0; i < len; i++)
		{
			password[i] =
			values.charAt(rm.nextInt(values.length()));

		}
		return password;
		
	}
}
