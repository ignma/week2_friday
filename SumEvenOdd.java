public class SumEvenOdd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = findSumOfEvenOdd(array);
        System.out.println("Output: array = " + result[0] + " " + result[1]);
    }

    public static int[] findSumOfEvenOdd(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        return new int[]{sumEven, sumOdd};
    }
}
