package JavaProgramming;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tariff4{

    public static void main(String[] args) {

        System.out.print("Insert first date: ");
        Scanner s = new Scanner(System.in);
        String[] insert1 = new String[3];

        while (s.hasNext()) {
            int i = 0;
            insert1[i] = s.next();
            if (!s.hasNext()) {
                s.close();
                break;
            }
            i++;
        }

        System.out.print("Insert second date: ");
        Scanner t = new Scanner(System.in);
        String[] insert2 = new String[3];

        while (t.hasNext()) {
            int i = 0;
            insert2[i] = t.next();
            if (!t.hasNext()) {
                t.close();
                break;
            }
            i++;
        }

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(insert1[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(insert1[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(insert1[2]));
        Date firstDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(insert2[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(insert2[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(insert2[2]));
        Date secondDate = cal.getTime();


        long diff = secondDate.getTime() - firstDate.getTime();

        System.out.println ("Days: " + diff / 1000 / 60 / 60 / 24);
    }
}