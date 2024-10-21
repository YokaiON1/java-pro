

import java.util.Scanner;

public class beec1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        in.nextLine();

        for (int i = 0; i < x; i++) {
            String line = in.nextLine();
            System.out.println(encrypt(line));
        }
    }

    private static String encrypt(String line) {

        StringBuilder avaczedr = new StringBuilder();

        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                avaczedr.append((char) (ch + 3));
            } else {
                avaczedr.append(ch);
            }
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = avaczedr.length() - 1; i >= 0; i--) {
            reversed.append(avaczedr.charAt(i));
        }

        int length = reversed.length();
        for (int i = length / 2; i < length; i++) {
            reversed.setCharAt(i, (char) (reversed.charAt(i) - 1));
        }

        return reversed.toString();
    }
}