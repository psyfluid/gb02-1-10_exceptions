package gb.hw01.hw01_3;

public class ArraysQuotient {
    public static void main(String[] args) {
        int[] newArray = getArraysQuotient(new int[]{10, 5, 8, 5, 1}, new int[]{1, 10, 1, 3, 0});
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < newArray.length - 1; i++) {
            sb.append(newArray[i]).append(", ");
        }
        sb.append(newArray[newArray.length - 1]).append("]");
        System.out.println(sb);
    }

    private static int[] getArraysQuotient(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) throw new RuntimeException("Arrays lengths must match");
        int len = arr1.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (arr2[i] == 0) throw new RuntimeException("Division by zero");
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
