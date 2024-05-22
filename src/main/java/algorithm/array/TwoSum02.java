package algorithm.array;

import java.util.*;
//https://leetcode.com/problems/two-sum/
public class TwoSum02 {
    public int[] twoSum(int[] nums, int target) {
        //1. Map에 nums 데이터를 전부 넣고 key = 값, value = index
        //2. target 과 nums[i]를 연산하여 같은 뺀값이 MAP에 있는지 확인
        Map<Integer, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            dictionary.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if ( dictionary.containsKey(target - nums[i]) && i != dictionary.get(target-nums[i]))
                return new int[]{i, dictionary.get(target-nums[i])};
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum02 twoSum = new TwoSum02();
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 9);

        for (int rst : result) {
            System.out.println(rst);
        }
    }
}
