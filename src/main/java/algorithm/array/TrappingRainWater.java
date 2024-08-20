package algorithm.array;

import java.util.*;

//https://leetcode.com/problems/trapping-rain-water

//& 는 앞의 조건식이 false 여도 뒤의 조건식이 true인지 false 인지 판별한다. 어차피 결과는 false인데도 말이다.
//&& 는 앞의 조건식이 false 라면, 뒤의 조건식은 true인지 false인지 신경쓰지 않는다. 어차피 결과는 false이기 때문이다.


public class TrappingRainWater {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for (int i=0; i<height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer top = stack.pop();
                if (stack.isEmpty()) break;

                int distance = i - stack.peek() -1;
                int waters = Math.min(height[i], height[stack.peek()]) - height[top];

                sum += waters * distance;
            }

            stack.push(i); //값을 넣는 것이 아닌, 인덱스를 넣었음
        }

        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{2,2,0,0,4}));
    }
}
