package JavaProgramming;

import java.awt.List;
import java.util.Scanner;
 
public class List_Ex2 {
 
	List list = new List();
	Scanner scan = new Scanner(System.in);
	
	int n;
	
	void getVal() {
		
		System.out.println("List - Insert a Data");
		
		System.out.println("\nEnter 'n' value :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the data :");
		
		for(int i=0; i<n; i++) {
			
			list.add(scan.nextLine());
		}		
	}
	
	void display() {
		
		System.out.println("\nThe Stored List data are :");
		
		for(int i=0; i<list.getItemCount(); i++) {
			
			System.out.println(list.getItem(i));
		}
	}
	
	void addMore() {
		
		System.out.println("\nEnter the index :");
		int i = scan.nextInt();
		
		System.out.println("Enter the data :");
		String item = scan.next();
		
		list.add(item, i-1);
		
		display();
	}

	
	public static void main(String args[]) {
		
		List_Ex2 obj = new List_Ex2();
		
		obj.getVal();
		obj.display();
		
		obj.addMore();
	}
}

