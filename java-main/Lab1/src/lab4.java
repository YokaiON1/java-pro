import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = in.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.printf("%.1f pounds is %.3f kilograms%n", pounds, kilograms);

    }
}