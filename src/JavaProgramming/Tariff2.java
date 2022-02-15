package JavaProgramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tariff2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] list_vc = {4 , 0 , 2};
		int [] list_opd = {600 , 0 , 300};
		
		int t1 = 7;
		int t2 = 30;
		int t3=90;
		long diff = 0;
		int VC_consult=0;
		int OPD_consult=0;
		
		Date date_Firstconsult1;
		Date date_Secondconsult2;
		
		
		int slab_Vc1 = 1;
		int slab_Vc2 = 0;
		int slab_Vc3 = 0;
		
		String patient1 = "Suresh";
		int tariff1 = 0;
		int tariff2 = 0;
					
			String sDate1="01/01/2022";  
		    Date date_ref;
			try {
				date_ref = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				
				System.out.println(date_ref);
			    String dateConsult1="02/01/2022";
			    Date date_consult1=new SimpleDateFormat("dd/MM/yyyy").parse(dateConsult1);  
			    System.out.println( date_consult1);
			    diff = ((date_consult1.getTime() - date_ref.getTime())/(1000*3600*24))%365;
			    VC_consult = 1;
			    
			    tariff1 = (list_vc[0]*slab_Vc1) + (list_vc[1]*slab_Vc2) + (list_vc[2]*slab_Vc3);
			    tariff2 = (tariff1)*VC_consult;
			    System.out.println(tariff2);
			    
			    
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		    
			
			
		}

	}


