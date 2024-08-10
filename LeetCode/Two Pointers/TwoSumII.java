import java.util.HashMap;
import java.util.HashSet;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        // System.out.println(twoSum(numbers, target));
        int[] arr = twoSum(numbers, target);
        PrintArray.print(arr);
    }

    public static int[] twoSum(int[] numbers, int target) {
        // HashSet<Integer> hash = new HashSet<>();
        // for (int i = 0; i < numbers.length; i++) {
        // int comp = target - numbers[i];
        // if (hash.contains(comp)) {
        // return new int[] { comp, i };
        // } else {
        // hash.add(i);
        // }
        // }
        // return new int[] { -1, -1 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int comp = target - numbers[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i + 1 };
            } else {
                map.put(numbers[i], i + 1);
            }
        }
        return new int[] { -1, -1 };
    }
}
