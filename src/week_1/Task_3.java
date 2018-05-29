package week_1;

import java.util.Scanner;

//Пользователь вводит число. Вывести на экран его
// удвоенное значение, если число делится на 7 нацело.

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();


        if (number % 7 == 0){
            System.out.println("number * 2 = " + number * 2);
        } else {
            System.out.println("Число не делится на 7 нацело");
        }
    }
}
