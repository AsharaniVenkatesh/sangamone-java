package JavaProgramming;

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20;
		int y=10;
		System.out.println("Before Swapping: "+ " x  = "+x+ " and "+"y = "+y );
		//Swapping the values without using the temp variable
		x=x+y; //here x is 20+10=30
		y=x-y; //here y is 30-10=20
		x=x-y; // here x is 20-10=10
		System.out.println("After Swapping : " + " x  = "+x+ " and "+"y = "+y);

	}

}
