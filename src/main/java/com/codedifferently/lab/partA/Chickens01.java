package com.codedifferently.lab.partA;

public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken1 = 5;
        int eggsPerChicken2 = 4;
        int chickenCount1 = 3;
        int chickenCount2 = 8;

//Monday nothing changes but the egg count
        int mondayEggs = ((eggsPerChicken1 * chickenCount1) + (eggsPerChicken2 * chickenCount2));
        // Equals 47 eggs

//Tuesday he gains one chicken so egg count and chicken count go up
        int tuesdayEggs = ((eggsPerChicken1 * chickenCount1) + (eggsPerChicken2 * chickenCount2));
        //Equals 47
        int tuesdayChickens = (1 + (chickenCount1 + chickenCount2));

//Wednesday half of his chickens were eaten
        int wednesdayChickens = (tuesdayChickens / 2);
        //The two and four come from half the chickens from both groups being eaten
        int wednesdayEggs = ((eggsPerChicken1 * 2) + (eggsPerChicken2 * 4));
        //Equals 26

//Total amount of eggs that have been collected throughout the 3 days
        int totalEggs = (mondayEggs + tuesdayEggs + wednesdayEggs);

        System.out.println("Total eggs were " + totalEggs);

    }
}
