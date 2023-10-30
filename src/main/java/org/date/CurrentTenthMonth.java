package org.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTenthMonth {
    public static void main(String[] args) {
        Date currentDate=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH,10);
        Date tenthMonth=calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current Date: "+simpleDateFormat.format(currentDate));
        System.out.println("Tenth Month: "+simpleDateFormat.format(tenthMonth));
    }
}
