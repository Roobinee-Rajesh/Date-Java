package org.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConversion {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String input=inputDateFormat.format(date);
        SimpleDateFormat outputDateFormat=new SimpleDateFormat("yyyy.MM.dd");
        String output=outputDateFormat.format(date);
        System.out.println("Input Date: "+input);
        System.out.println("Output Date: "+output);
    }
}
