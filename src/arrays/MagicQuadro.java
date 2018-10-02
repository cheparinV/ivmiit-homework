package arrays;

import java.util.Scanner;

public class MagicQuadro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("M = " + m);

        int[][] matrix = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isMagic = true;
        int sum = sumDiagonal(matrix);
        for (int i = 0; i < matrix.length && isMagic; i++) {
            if (sum != sumLine(matrix[i])) {
                isMagic = false;
            }
        }

        for (int i = 0; i < matrix[0].length && isMagic; i++) {
            if (sum != sumColumn(matrix, i)) {
                isMagic = false;
            }
        }

        System.out.println();
        if (isMagic) {
            System.out.println("Magic");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Not Magic");
        }
    }

    public static int sumLine(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }

    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
