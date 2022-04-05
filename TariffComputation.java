package JavaProgramming;

import java.util.Scanner;

public class TariffComputation {
	
	public static void main(String args[]) {
		
		int VC1=0,VC2=0,VC3=0;
		int init_amount=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the consulation VC1, VC2 or VC3");
		VC1=sc.nextInt();
		
		if(VC1<=0) {
			init_amount=init_amount+0;
			System.out.println("Your first consultation charge is Rs: " +init_amount);
		}else if(VC1 <= 1 && VC2 >= 7) {
			init_amount=init_amount-4;
			System.out.println("Your second Consultation charges" +init_amount);
		}else if( VC1 >= 1 && VC2 >= 7) {
			init_amount=init_amount-4;
			System.out.println("Yout third Consultation charges" +init_amount);
		}
		else {
			init_amount=4;
			System.out.println("Your consultaion");
		}
				
	}

}
