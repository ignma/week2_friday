public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 2, 7};
        int[] result = findMinMax(array);
        System.out.println("Output: " + result[0] + "," + result[1]);
    }

    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
}
