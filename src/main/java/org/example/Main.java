package org.example;
import java.util.Scanner;

public class Main {
    public static void solution(int number){
        int step = 0;
        int max = 0;
        int summ = 0;
        int summOdd = 0;

        while(number > 0){
            step = number % 10;
            summ += step;
            System.out.println(step);
            number /= 10;
            if(max < step){
                max = step;
            }
            if((step % 2) != 0){
                summOdd += step;
            }
        }
        System.out.println("Сумма всех цифр: " + summ);
        System.out.println("Сумма всех нечетных цифр: " + summOdd);
        System.out.println("Максимальная цифра в числе: " + max);
    }

    public static void main(String[] args) {
        Scanner scannerCount = new Scanner(System.in);
        System.out.println("\nЗадание Цифры числа");
        System.out.println("Введите число: ");
        int count = scannerCount.nextInt();
        System.out.println("Число состоит из цифр:");
        solution(count);
    }
}