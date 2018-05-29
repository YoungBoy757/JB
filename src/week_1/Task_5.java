package week_1;

import java.util.Scanner;

// Вводим 2 числа. Если первое число больше второго,
// то вывести на экран разницу чисел. Если второе больше,
// то выводим сумму.

public class Task_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input two numbers");

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b){
            System.out.println("a > b, difference a & b =" + (a - b));
        } else {
            if (a < b) {
                System.out.println("a < b, summ a & b =" + (a + b));
            } else {
                System.out.println("a = b");
            }
        }
    }
}
