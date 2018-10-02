package arrays;

import java.util.Scanner;

public class SequenceFounder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int size = 0;
        int index = -1;
        int maxSize = 0;
        int bestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                size++;
            } else {
                if (size > maxSize) {
                    maxSize = size;
                    bestIndex = index;
                    size = 0;
                }
            }
            if (size == 1) {
                index = i;
            }
        }
        System.out.println("Size : " + maxSize + ", index: " + bestIndex);
    }


}
