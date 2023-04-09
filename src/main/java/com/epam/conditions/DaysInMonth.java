package com.epam.conditions;

import java.util.DoubleSummaryStatistics;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year<0 || month>12 || month <1) {
            System.out.println("invalid date");
            return;
        }

        boolean isLeap = (year%4==0 && year%100!=0) || (year%400 == 0);

        switch (month) {
            case 2:
                if(isLeap) System.out.println("29");
                else System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("31");
        }
    }

}
