package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void operation_with_while_cycle() {
        int number_K = 0;
        int sum = 0;
        System.out.println("Введите целое число: ");
        int number_N = scanner.nextInt();
        if (number_N > 1)
        {
            while (number_N > sum)
            {
                number_K++;
                sum += number_K;
            }
            System.out.printf("Сумма данных чисел равна: %d\nЧисло К равно :%d",sum,number_K);
        }
        else
            {
        System.out.println("Ошибка. Недопустимое значение");
        }
    }
    public static void main(String[] args) {
        operation_with_while_cycle();
    }
}



