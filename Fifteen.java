package JavaProgramming;

public class Fifteen extends Thread {
	
	public void run()
	{
		System.out.println("Sangam");
		System.out.println("one");
		suspend();
		resume();
		System.out.println("one");	
	}
	
}

class Thread2{
	public static void main(String args[]) {
		Fifteen f15=new Fifteen();
		f15.start();
	}
}