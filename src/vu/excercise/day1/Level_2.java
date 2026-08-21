package vu.excercise.day1;

public class Level_2 {

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 10, 5};
        int max = excercise1(numbers);
        System.out.println("Số lớn nhất là: " + max);

        int[] numbers2 = {3, 8, 2, 10, 5};
        int min = excercise2(numbers2);
        System.out.println("Số nhỏ nhất là: " + min);

    }

    public static int excercise1(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {

                max = numbers[i];
            }
        }
        return max;
    }

    public static int excercise2(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    /*Exercise 5 — Find the largest number
    int[] numbers = {3, 8, 2, 10, 5};
    Find the largest number.

    Expected: 10*/

    /*Exercise 6 — Find the smallest number*/

}
