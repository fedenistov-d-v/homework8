import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] masA = new int[]{1, 2, 3};
        double[] masB = {1.57, 7.654, 9.986};
        String[] masC = {"Маша", "Пётр", "Крил", "Олег"};

        // Task 2
        System.out.println(" _____ Задача 1 и 2 ___");
        int i = 0;
        for (; i < masA.length - 1; i++) {
            System.out.printf("%d, ", masA[i]);
        }
        System.out.printf("%d%n", masA[i]);
        for (i = 0; i < masB.length - 1; i++) {
            System.out.print(masB[i] + ", ");
        }
        System.out.printf("%.3f%n", masB[i]);
        for (i = 0; i < masC.length - 1; i++) {
            System.out.print(masC[i] + ", ");
        }
        System.out.printf("%s%n", masC[i]);

        // Task 3
        System.out.println(" _____ Задача 3 _____");
        for (i = masA.length - 1; i > 0; i--) {
            System.out.printf("%d, ", masA[i]);
        }
        System.out.printf("%d%n", masA[i]);
        for (i = masB.length - 1; i > 0; i--) {
            System.out.print(masB[i] + ", ");
        }
        System.out.printf("%.3f%n", masB[i]);
        for (i = masC.length - 1; i > 0; i--) {
            System.out.print(masC[i] + ", ");
        }
        System.out.printf("%s%n", masC[i]);

        // Task 4
        System.out.println(" _____ Задача 4 _____");
        for (i = 0; i < masA.length; i++) {
            if (masA[i] % 2 != 0) { masA[i]++; }
        }
        System.out.println(Arrays.toString(masA));
    }
}