package JavaProgramming;

import java.awt.List;
import java.util.Scanner;

public class ListEx {
	List list=new List();
	Scanner sc =new Scanner(System.in);
	int n;
	
	//adding the element into the list
	void getItem() {
		System.out.println("List");
		System.out.println("\n Enter the item");
		n=Integer.parseInt(sc.nextLine());
		System.out.println("\n Enter the data");
		for(int i=0;i<n;i++) {
			list.add(sc.nextLine());
		}
	}
	
	//displaying the element in the list
	void  display() {
		System.out.println("\n ====The element in list====");
		for(int i=0;i<list.getItemCount();i++) {
			System.out.println(list.getItem(i));
		}
	}
	
	
	//adding more item into the list
	void addmoreItem() {
		System.out.println("\n Enter the index where to add the item: ");
		int i=sc.nextInt();
		System.out.println("Enter the data");
		String item=sc.next();
		list.add(item, i-1);
		display();	
		
	}
	
	
	//replacing the item into list
	void replacemoreItem() {
		System.out.println("\n Enter the Index which i was replace the item: ");
		int i=sc.nextInt();
		System.out.println("Enter the data");
		String item=sc.next();
		list.replaceItem(item, i-1);
		display();	
		
	}
	
	
	//deleting the item into list
	void deletemoreItem() {
		System.out.println("\n Enter the Index which item to delete: ");
		int i=sc.nextInt();
		System.out.println("Enter the data");
		String item=sc.next();
		list.remove(i-1);
		display();	
		
	}
	
	
	
	public static void main(String args[]) {
		ListEx obj1=new ListEx();
		obj1.getItem();
		obj1.display();
		obj1.addmoreItem();
		obj1.replacemoreItem();
		obj1.deletemoreItem();
	}
	
}
