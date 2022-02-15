package JavaProgramming;

import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Tariff {

    public static void main(String[] args) {
    	
    	int vc1=0;
    	int vc2=7;
    	int vc3=90;
    	int vctoOPD=0;
    	
    	int consul_vc1=4;
    	int consul_vc2=0;
    	int consul_vc3=consul_vc1/2;
    	
    	int opd1=0;
    	int opd2=7;
    	int opd3=90;
    	
    	int consul_opd1=600;
    	int consul_opd2=0;
    	int consul_opd3=consul_opd1/2;

        System.out.print("Insert first  date1: ");
        Scanner s = new Scanner(System.in);
        String firstdate = s.nextLine();
        System.out.print("Insert second  date2: ");
        String seconddate = s.nextLine();

        // Date Formatter
        DateTimeFormatter dateStringFormat = DateTimeFormat
                .forPattern("dd MM yyyy");
        
        DateTime firstTime = dateStringFormat.parseDateTime(firstdate);
        DateTime secondTime = dateStringFormat.parseDateTime(seconddate);
        int days = Days.daysBetween(new LocalDate(firstTime),
                                    new LocalDate(secondTime)).getDays();
        
        System.out.println("Days between the VC1 and VC2 dates " + days);
        System.out.println("Days between the OPD1 and OPD2 dates " + days);

        //vc
        
        if(vc1<=days && vc2>=days) { //its true
        	System.out.println("Your video consultation charge is: Rs  " +consul_vc2);
        }
        else if(vc2<=days && vc3>=days ) {
        	System.out.println("Your Video consultation charge is : Rs " +consul_vc3);
        }
        else if(vc3<=90) {
        	System.out.println("Your Video consultation charge is : Rs " +consul_vc1);
        }
        else {
        	System.out.println("Sorry");
        }
        //opd
        if(opd2>=days) {
        	System.out.println("Your OPD consultation charge is: Rs  " +consul_opd2);
        }
        else if(opd3>=days) {
        	System.out.println("Your OPD consultation charge is : Rs "+consul_opd3);
        }
        else if(opd3<=days) {
        	System.out.println("Your OPD  consultation charge is : Rs " + consul_opd1);
        }
        else {
        	System.out.println("Sorry");
        }
        
        //vc to opd
		/*
		 * Scanner s2=new Scanner(System.in);
		 * System.out.println("Enter the first OPD Date : ");
		 */
         if(opd1>=days) {
        	 
        	 System.out.println("Your charges is Rs: " + consul_opd1);
         }
         else if(vc2>days && opd2>days) {
        	 System.out.println("Your conslation charge is: Rs "  +consul_vc2);
         }
         else if(vc2<days && opd2<days) {
        	 vctoOPD = consul_opd1 - consul_vc1;
        	 System.out.println("After OPD consultation charge is : Rs  " +vctoOPD+ "  because you beyond the limit. ");
         }
         
         else if(vc3<=days && opd3<=days) {
        	 System.out.println(" Now your charge id : Rs : " +consul_opd1);
         }
         else {
        	 System.out.println("Sorry Error");
         }
    }
}








