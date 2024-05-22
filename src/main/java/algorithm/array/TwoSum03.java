package algorithm.array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum03 {
    public int[] twoSum(int[] nums, int target) {
        // 1. 딕셔너리에서 찾는다
        // 2. 딕셔너리에 없다면 넣는다.

        Map<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dictionary.isEmpty() && dictionary.containsKey(target - nums[i]))
                return new int[]{dictionary.get(target - nums[i]), i};

            dictionary.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum03 twoSum = new TwoSum03();
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 9);

        for (int rst : result) {
            System.out.println(rst);
        }
    }
}
