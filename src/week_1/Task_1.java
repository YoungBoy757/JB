package week_1;

import java.util.Scanner;

/*Пользователь вводит параметр с консоли (текущий час от 0 до 24) Если
        время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Input time");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if  (time >= 9 && time <= 18){
            System.out.println("I'm working");
        } else {
            if (time > 24 || time <= 0) {
                System.out.println("Invalid time");
            } else {
                System.out.println("I'm resting");
            }
        }


    }
}
