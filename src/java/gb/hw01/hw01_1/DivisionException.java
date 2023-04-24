package gb.hw01.hw01_1;

public class DivisionException {
    public static void main(String[] args) {
        System.out.println(divide(5, 0));
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
