package JavaProgramming;

import java.util.Scanner;

public class Student2 {
	
	String name;
	String classes;
	/*
	 * String str1="tolstoy"; String str2="shakespeare";
	 */

	public Student2() {
		//super();
		// TODO Auto-generated constructor stub
	}


	public Student2(String name, String classes) {
		//super();
		this.name = name;
		this.classes = classes;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name : ");
		String name= sc.nextLine(); //reads string.
		System.out.println("Enter the student class : ");
		String classes= sc.nextLine(); //reads string.
		System.out.println("Name: " +name);
		System.out.println("Class: " +classes);

		if(classes.equals("tolstoy")){
			System.out.println(name + "" + " belongs to tolstoy class.");
		}

		else if(classes.equals("shakespeare")){
			System.out.println(name + "" + " belongs to shakespeare class.");

		}else {
			System.out.println("not equal");
		}	

	}

}
