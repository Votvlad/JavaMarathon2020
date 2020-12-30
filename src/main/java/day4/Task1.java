package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random ();
        Scanner scanner = new Scanner(System.in);
        int sum_more = 0;
        int sum_equal = 0;
        int even_number = 0;
        int odd_number = 0;
        int sum_all = 0;
        int element = scanner.nextInt();
        int [] massive = new int[element];
        for (int i = 0; i < massive.length; i++) {
           massive[i] = rand.nextInt(11);

           if (massive[i] > 8 ) {
               sum_more++;
           }

            if (massive[i] == 1 ) {
                sum_equal++;
            }

            if (massive[i] % 2 == 0 ) {
                even_number++;
            }

            if (massive[i] % 2 != 0 ) {
                odd_number++;
            }

        }
        for (int x:massive) {
            sum_all = sum_all + x;
        }

        System.out.println(Arrays.toString(massive));
        System.out.println("Длина массива: " + massive.length);
        System.out.println("Количество чисел больше 8: " + sum_more);
        System.out.println("Количество чисел равных 1: " + sum_equal);
        System.out.println("Количество четных чисел: " + even_number);
        System.out.println("Количество нечетных чисел: " + odd_number);
        System.out.println("Сумма всех элементов массива: " + sum_all );

    }
}
