package vu.excercise.day1;

import java.util.Calendar;

public class Level_1 {

    public static void main(String[] args) {

        excercise1(10, 20);
        System.out.println(excercise2(1997));
        System.out.println(excercise3(14,15));
    }

    public static void excercise1(int a, int b ){

        System.out.println("a ban dau: " + a);
        System.out.println("b ban dau: "+ b);

        int temp = b;

        b = a;
        a = temp;

        System.out.println("a hoan vi: " + a);
        System.out.println("b hoan vi: " + b);

    }
    public static int excercise2(int birthYear) {

        int year;

        Calendar x = Calendar.getInstance();
        //year sẽ là năm hien tai
        year = x.get(Calendar.YEAR);

        return year - birthYear;
    }

    public static int excercise3(int a, int b){

        if (a > b) {
            return a;
        }

        return b;
    }

    /* Exercise 1 — Swap two variables

     int a = 10;
     int b = 20;

     Make the result:

     a = 20
     b = 10
    */

    /*Exercise 2 —Calculate age
    int birthYear = 2000;
    int currentYear = 2026;
    You are 26 years old*/


    /*Exercise 3 — Compare two numbers
    int a = 15;
    int b = 8;
    15 is greater
    a = 5;
    b = 20;*/



}
