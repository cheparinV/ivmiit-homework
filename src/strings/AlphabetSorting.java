package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
