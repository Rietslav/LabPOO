package Lab1;

import java.util.Random;

public class Main {

    public static void randomArray(int A[], int SIZE) {
        Random random = new Random();
        for (int i = 0; i < SIZE; ) {
            boolean thatVar = false;
            int newVar = random.nextInt(100);
            for (int j = 0; j < i; j++) {
                if (A[j] == newVar) {
                    thatVar = true;
                    break;
                }
            }
            if (!thatVar) {
                A[i] = newVar;
                i++;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void numberMinim(int A[]) {
        int min = A[0];
        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }
        }
        System.out.println("Numarul minim este: " + min);
    }

    public static void numberMaxim(int A[]) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println("Numarul maxim este: " + max);
    }

    public static void main(String[] args) {
        final int SIZE = 20;
        int[] arr = new int[SIZE];

        System.out.println("Matricea randoma: ");
        randomArray(arr, SIZE);
        numberMinim(arr);
        numberMaxim(arr);
    }
}

