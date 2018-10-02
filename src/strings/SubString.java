package strings;

import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String sub = scanner.next();

        if (string.length() < sub.length()) {
            String tmp = new String(string);
            string = sub;
            sub = tmp;
        }

        char[] stringChar = string.toCharArray();
        char[] subChar = sub.toCharArray();

        for (int i = 0; i < stringChar.length; i++) {
            if (stringChar[i] == subChar[0]) {
                boolean contains = contains(stringChar, subChar, i);
                if (contains) {
                    System.out.println(contains);
                    System.out.println("index = " + i);
                    break;
                }
            }
        }

    }

    public static boolean contains(char[] stringChar, char[] subChar, int index) {
        for (int i = 0; i < subChar.length; i++) {
            if (stringChar[index + i] != subChar[i]) {
                return false;
            }
        }
        return true;
    }
}
