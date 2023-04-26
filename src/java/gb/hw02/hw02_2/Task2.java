package gb.hw02.hw02_2;

public class Task2 {
    public static void main(String[] args) {
        testMethod(null);
        testMethod(new int[] {9, 2, 5, 0, 4});
        testMethod(new int[] {1, 4, 10, 8, 1, 7, 7, 10, 8, 9});
    }

    private static void testMethod(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
