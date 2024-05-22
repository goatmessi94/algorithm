package algorithm.array;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/trapping-rain-water

//& 는 앞의 조건식이 false 여도 뒤의 조건식이 true인지 false 인지 판별한다. 어차피 결과는 false인데도 말이다.
//&& 는 앞의 조건식이 false 라면, 뒤의 조건식은 true인지 false인지 신경쓰지 않는다. 어차피 결과는 false이기 때문이다.


public class TrappingRainWater02 {
    public int trap(int[] height) {
        // 1. left index가 right index보다 같거나 커지는 경우 while 종료
        // 2.0 leftMax가 더 작거나 같은 경우 오른쪽 이동
        // 2.1 rightMax가 더 작은 경우 왼쪽이동
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left += 1;
            } else {
                volume += rightMax - height[right];
                right -= 1;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        TrappingRainWater02 trappingRainWater = new TrappingRainWater02();
        System.out.println(trappingRainWater.trap(new int[]{4,3,2,1,0,5}));
    }
}
