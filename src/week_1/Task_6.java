package week_1;

import java.util.Scanner;

//Вводим два числа, вывести их суму,
// если она в диапазоне от 11 до 19.

public class Task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("input two num");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int summ = num1 + num2;

        if (summ <= 19 && summ >= 11){
            System.out.println(summ + " lie in the range [11:19]");
        } else {
            System.out.println(summ + " don't lie in the range [11:19]");
        }
    }
}
