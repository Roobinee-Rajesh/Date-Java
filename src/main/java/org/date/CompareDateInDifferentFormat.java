package org.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDateInDifferentFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr1 = dateFormat1.format(date);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy.MM.dd");
        String dateStr2 = dateFormat2.format(date);

        try {
            Date parsedDate1 = dateFormat1.parse(dateStr1);
            Date parsedDate2 = dateFormat2.parse(dateStr2);

           if(parsedDate1.equals(parsedDate2))
           {
               System.out.println("Equal");
           }
           else{
               System.out.println("Not Equal");
           }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
