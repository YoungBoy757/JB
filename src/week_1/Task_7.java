package week_1;

import java.util.Scanner;

/*Вводим два числа, если одно из них делиться на другое
без остатка, то выводим тру и показываем результат деления
 (целую часть от деления  и остачу) в другом случае выводим
 false и показываем результат деления (целую часть от деления  и остачу)
 */

public class Task_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input 2 numbers for division");

        float a = s.nextFloat();
        float b = s.nextFloat();


        if (a % b == 0 || b % a == 0){
            System.out.println("without remainder " + (a / b));
        } else {
            System.out.println("with remainder " + (a / b));
        }
    }
}
