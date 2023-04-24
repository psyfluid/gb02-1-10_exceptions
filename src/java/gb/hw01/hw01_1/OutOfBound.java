package gb.hw01.hw01_1;

public class OutOfBound {
    public static void main(String[] args) {
        System.out.println(getElement(5, new String[]{""}));
    }

    private static Object getElement(int index, Object[] arr) {
        return arr[index];
    }
}
