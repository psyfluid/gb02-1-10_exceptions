package gb.hw02.hw02_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float number");
        float number = getFloat(scanner);
        System.out.println("Your number: " + number);
    }

    private static float getFloat(Scanner scanner) {
        float number;
        try {
            number = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Try again:");
            scanner.next();
            number = getFloat(scanner);
        }
        return number;
    }
}
