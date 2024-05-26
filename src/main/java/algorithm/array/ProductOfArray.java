package algorithm.array;

import java.util.*;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                answer[i] *= nums[j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductOfArray productOfArray = new ProductOfArray();
        productOfArray.productExceptSelf(new int[]{1, 3, 5, 7});
    }
}
