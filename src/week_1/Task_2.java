package week_1;

import java.util.Scanner;

//Пользователь вводит три числа с консоли,
// нужно вывести на консоль наибольшее, наименьшее

public class Task_2 {

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min;
        int max;

        if (a < b && a < c){
            min = a;
        } else {
            if (b < a && b < c ) {
                min = b;
            } else {
                min = c;
            }
        }

        if (a > b && a > c) {
            max = a;
        } else {
            if (b > a && b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("min = " + min + " max = " + max );
    }
}
