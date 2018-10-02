package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int[] bArray = new int[n];
        int bIndex = 0;
        int i = 0;
        while ( i < array.length) {
            bArray[bIndex] = array[i];
            bIndex++;
            i++;
            while (i < array.length && array[i] == array[i-1]) {
                i++;
            }
        }
        System.out.println("Array B:");
        for (int i1 = 0; i1 < bIndex; i1++) {
            System.out.print(bArray[i1] + " ");
        }
    }

}
