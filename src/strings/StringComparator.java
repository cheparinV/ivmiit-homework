package strings;

import java.util.Scanner;

public class StringComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String two = scanner.next();

        System.out.println(one.equals(two));
    }
}
