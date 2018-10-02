package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();
        while (scanner.hasNextInt()) {
            vector.add(scanner.nextInt());
        }

        for (int i = 0; i < vector.size(); i++) {
            if (isPrime(vector.get(i))) {
                vector.add(i, 0);
            }
        }

        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
    }

    private static boolean isPrime(int num) {
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
