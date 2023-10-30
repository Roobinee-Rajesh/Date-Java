package org.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDatesOfSameFormat {
    public static void main(String[] args) {


        try {
            Scanner scanner=new Scanner(System.in);;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter Date 1: ");
            Date dateStr1 = dateFormat.parse(scanner.nextLine());
            System.out.println("Enter Date 2: ");
            Date dateStr2 = dateFormat.parse(scanner.nextLine());

            if(dateStr1.equals(dateStr2))
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
