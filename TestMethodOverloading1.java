package JavaProgramming;

public class TestMethodOverloading1 {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(TestMethodOverloading1.add(2,3));
		System.out.println(TestMethodOverloading1.add(2.0,3.0,4.0));


	}

}
