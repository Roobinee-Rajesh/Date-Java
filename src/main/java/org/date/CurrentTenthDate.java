package org.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTenthDate {
    public static void main(String[] args) {
        Date currentDate=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH,10);
        Date tenthDate=calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current Date: "+simpleDateFormat.format(currentDate));
        System.out.println("Tenth Date: "+simpleDateFormat.format(tenthDate));
    }
}
