package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void operation_with_for_cycle() {
        float result = 0; //float потому что Math.pow выдает ответ в float.
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
            if (number > 0)
            {
                for(int i = 0; i <= number;i++)
                {
                    result += Math.pow(number + i, 2 );
                }
                System.out.printf("Полученный результат равен: %f",result);
            }
            else
            {
                System.out.println("Ошибка. Чисто является отрицательным");
            }
    }
    public static void main(String[] args) {
        operation_with_for_cycle();
    }
}
