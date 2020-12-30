package day4;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");

              }
                System.out.println("\n");
            }
        int sum_max = 0;
        int index_max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
              }
            if (sum >= sum_max) {
                sum_max = sum;
                index_max = i;
             }
           }
            System.out.println(index_max);
       }
    }

