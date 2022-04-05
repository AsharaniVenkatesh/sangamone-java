package JavaProgramming;

import java.awt.List;
import java.util.Scanner;

public class List2 {

	List list1 = new List();
	Scanner sc = new Scanner(System.in);
	int n;

	void datatobeaddinlist() {
		System.out.println(" List");

		
		  System.out.println("\nEnter the item range:");
		  n=Integer.parseInt(sc.nextLine());
		 

		System.out.println("\n Enter the data:");
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextLine());
		}
	}

	void displatthedata() {
		System.out.println("\n The item in the list is: ");
		for (int i = 0; i < list1.getItemCount(); i++) {
			System.out.println(list1.getItem(i));
		}
	}

	void addtheonemoreitem() {
		System.out.println("\n Enter the range for item to be inserted:");
		int i = sc.nextInt();
		System.out.println("\nEnter the data: ");
		String item = sc.next();
		list1.add(item, i - 1);
		displatthedata();

	}

	void removetheonemoreitem() {
		System.out.println("\n Enter the range for item to be removed from list:");
		int i = sc.nextInt();
		System.out.println("\nEnter the data: ");
		String item = sc.next();
		list1.replaceItem(item, i - 1);
		displatthedata();

	}

	void delete() {
		System.out.println("\n Enter the index: ");
		int i = sc.nextInt();
		list1.remove(i - 1);
		displatthedata();
		addtheonemoreitem();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List2 myobject = new List2();
		myobject.datatobeaddinlist();
		myobject.displatthedata();
		myobject.addtheonemoreitem();
		myobject.removetheonemoreitem();
		myobject.delete();
	}

}
