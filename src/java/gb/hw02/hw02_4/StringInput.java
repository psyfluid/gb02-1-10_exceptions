package gb.hw02.hw02_4;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        String s = getString();
        System.out.println("Your string: " + s);
    }

    private static String getString() {
        System.out.println("Input string:");
        String s;
        try {
            s = inputString();
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
            s = getString();
        }
        return s;
    }

    private static String inputString() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        if (result.isEmpty()) throw new EmptyStringException();
        return result;
    }
}
