package JavaProgramming;

//A school method based JAVA program
//to check if a number is prime

class isPrime {

	static boolean isPrime1(int num)
	{
		boolean flag = false;
	    for (int i = 2; i <= num/2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	      System.out.println(num + " is a prime number.");
	    }
	    else {
	      System.out.println(num + " is not a prime number.");
	    }
		return flag;
	  }

	// Driver Program
	public static void main(String args[])
	{
		isPrime o1=new isPrime();
		isPrime.isPrime1(5);
	}
}
