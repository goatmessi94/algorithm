package algorithm.array;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 9);

        for (int rst : result) {
            System.out.println(rst);
        }
    }
}
