package day4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 0;
        int min = 10000;
        int counter = 0;
        int sum_all = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }
            for (int x : array) {
                if (x > max) {
                    max = x;
                }

                for (int y : array) {
                    if (y < min) {
                        min = y;
                    }

                }

            }
            for (int z: array) {
                if (z % 10 == 0) {
                    counter++;
                }
            }
        for (int x:array) {
            if (x % 10 == 0)
            sum_all = sum_all + x;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(counter);
        System.out.println(sum_all);
    }

}