package day1;

public class Task1 {
    public static void main(String[] args) {
       int i = 0;
       while (i < 10) {
           System.out.print("JAVA" + " ");
           i++;
        }

        System.out.println();

       for (i = 0; i < 10; i++) {
           System.out.print("JAVA" + " ");
       }

        System.out.println();

        for (i = 0; i < 10; i++) {
            System.out.println("JAVA");
        }

        int year = 1980;
        int X = year;
          while (X < 2020) {
            System.out.println("Олимпиада " + X + " года");
            X = X + 4;
        }
    }
}
