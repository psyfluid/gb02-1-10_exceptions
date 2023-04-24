package gb.hw01.hw01_2;

public class ArraysDifference {
    public static void main(String[] args) {
        int[] arraysDiff = getArraysDifference(new int[]{10, 5, 8, 5, 1}, new int[]{1, 10, 1, 3});
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arraysDiff.length - 1; i++) {
            sb.append(arraysDiff[i]).append(", ");
        }
        sb.append(arraysDiff[arraysDiff.length - 1]).append("]");
        System.out.println(sb);
    }

    private static int[] getArraysDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) throw new RuntimeException("Arrays lengths must match");
        int len = arr1.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) result[i] = arr1[i] - arr2[i];
        return result;
    }
}
