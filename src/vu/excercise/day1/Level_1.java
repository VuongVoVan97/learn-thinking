package vu.excercise.day1;

public class Level_1 {

    public static void main(String[] args) {


    }

    public static void contans (int a, int b ){
     int temp = b;
     b = a;
     a = temp;
        System.out.println(a);
        System.out.println(b);



    }
    public static int calulate (int birthYear, int currentYear ) {

        int rr = currentYear - birthYear;

     return rr;
    }

    public static int maxnumber (int a,int b){
        if (a > b){
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


    /*Exercise 4 — Compare two numbers
    int a = 15;
    int b = 8;
    15 is greater
    a = 5;
    b = 20;*/



}
