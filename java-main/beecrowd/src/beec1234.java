
import java.util.Scanner;

public class beec1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(convertToDancingSentence(line));
        }

        scanner.close();
    }

    private static String convertToDancingSentence(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean upperCase = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                if (upperCase) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                upperCase = !upperCase;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
