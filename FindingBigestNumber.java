package JavaProgramming;

public class FindingBigestNumber {
	

	int f;
	int s;
	int big;
	public int getLargestNumber(int f, int s) {
		if(f==s) {
			System.out.println("true");
		}else {
			big=Math.max(f, s);
			//big = (f>s) ? f:s;
			return big;
			//System.out.println("correct "+ big);

		}
		
		return big;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingBigestNumber f1=new FindingBigestNumber();
		f1.getLargestNumber(1, 2);
		
	}

}
