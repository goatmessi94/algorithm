package algorithm.array;

import java.util.*;

public class ArrayPartition {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0) answer += nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayPartition arrayPartition = new ArrayPartition();
        System.out.println(arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}
