package week_1;

import java.util.Scanner;

//Вводим число с плавающей точкой с консоли,
// и проверяем лежит ли оно в диапазоне от 0 до 1
//Если 0 и 1 включительно, то используем <= и >=

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ввести число с плавающей точкой");
        double num = sc.nextDouble();

        if (num <= 1 && num >= 0){
            System.out.println("lie in the range [0 : 1]");
        } else {
            System.out.println("don't lie in the range [0 : 1]");
        }

    }
}
