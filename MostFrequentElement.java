import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 4, 1};
        System.out.println("Most frequent element: " + findMostFrequentElement(array));
    }

    public static int findMostFrequentElement(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequentElement = array[0];

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
    }
}
