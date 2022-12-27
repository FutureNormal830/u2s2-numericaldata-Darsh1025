package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        int monday = 100;
        int tuesday = 121;
        int wednesday = 117;

//This is the average amount on eggs he gets a day, it is rounded to the nearest whole number
        int dailyAverage = (int) Math.round((monday + tuesday + wednesday) / 3.0);

    //Printing out the average a day
        System.out.println("Daily Average:   " + dailyAverage);

//This is to find the monthly average of eggs
        int monthlyAverage = (dailyAverage * 30);

    //Printing out the monthly average of eggs
        System.out.println("Monthly Average: " +monthlyAverage);

//This is to find the monthly profit
        int monthlyProfit = (int) (monthlyAverage * .18);

    //Printing out the average profit monthly
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
