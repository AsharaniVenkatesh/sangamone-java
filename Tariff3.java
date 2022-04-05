package JavaProgramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tariff3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int [] list_vc= {4,0,2};
		int vc1=4;
		int vc2=0;
		int vc3=2;
		int diff_date;
		
		String date11="14/02/2022";
		String date22="15/02/2022";


		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date date1=null;
		date1=format.parse(date11);
		
		System.out.println("First Consulataion Fees is Rs: " + vc1);
		System.out.println("First consultation dates is:  " +date11);
		System.out.println("Yours consultation date is:  "+date22);
		
	}

}
