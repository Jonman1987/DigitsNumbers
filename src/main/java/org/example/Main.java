package org.example;

import java.util.Scanner;

public class Main {

    public static void Summa(String number){
        int summa = 0;
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            summa += j;
        }
        System.out.println("Сумма всех цифр: " + summa);
    }

    public static void SummaOdd(String number){
        int summ_n = 0;
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            if (j % 2 != 0) {
                summ_n += j;
            }
        }
        System.out.println("Сумма всех нечетных цифр: " + summ_n);
    }

    public static void Max(String number){
        int max = 0;
        int tmp;
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            tmp = j;
            if(tmp > max){
                max = tmp;
            }
        }
        System.out.println("Максимальная цифра в числе: " + max);
    }

    public static void main(String[] args) {
        int count;
        Scanner scanner_count = new Scanner(System.in);

        System.out.println("\nЗадание Цифры числа");
        System.out.println("Введите число: ");
        count = scanner_count.nextInt();
        String digit = String.valueOf(count);
        Summa(digit);
        SummaOdd(digit);
        Max(digit);
    }
}