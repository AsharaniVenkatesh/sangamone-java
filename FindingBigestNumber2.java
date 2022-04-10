package JavaProgramming;

public class FindingBigestNumber2 {
	
	public static int[] twoLargest(int values[]){
	    int largestA = Integer.MIN_VALUE;
	    int largestB = Integer.MIN_VALUE;

	    for(int value : values) {
	        if(value > largestA) {
	            largestB = largestA;
	            largestA = value;
	        } else if (value > largestB) {
	            largestB = value;
	        }
	    }
	    return new int[] { largestA, largestB }; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingBigestNumber2 f1=new FindingBigestNumber2();
		//f1.getLargestNumber(1, 2);
		
	}

}
