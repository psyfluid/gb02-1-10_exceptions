package gb.hw01.hw01_1;

public class NPE {
    public static void main(String[] args) {
        System.out.println(getLength(null));
    }

    public static int getLength(Integer[] arr) {
        return arr.length;
    }
}
