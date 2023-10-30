package org.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DifferenceBetweenTwoDates {
    public static void main(String[] args) {
        Date date1 = new Date();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.print("Enter the end date (dd/MM/yyyy): ");
            Date date2 = sdf.parse(scanner.nextLine());
            long differenceInMillis = date2.getTime() - date1.getTime();
            long daysDifference = differenceInMillis / (1000 * 60 * 60 * 24);
            System.out.println("Date 1: " + sdf.format(date1));
            System.out.println("Date 2: " + sdf.format(date2));
            System.out.println("Number of days between the two dates: " + daysDifference+1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
