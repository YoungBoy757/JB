package week_1;

import java.util.Scanner;

//Вводим два числа, сравнить последнии
// цифры этих чисел (пользоваться оператором %)

public class Task_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter first number");
        int a = s.nextInt();
        System.out.println("Please enter second number");
        int b = s.nextInt();
        //
        if ((a - b) % 10 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
