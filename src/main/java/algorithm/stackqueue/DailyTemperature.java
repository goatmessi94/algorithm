package algorithm.stackqueue;

import java.util.*;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] resultTemperature = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int last = stack.pop();
                resultTemperature[last] = i - last;
            }

            stack.push(i);
        }

        return resultTemperature;
    }

    public static void main(String[] args) {
        DailyTemperature dailyTemperature = new DailyTemperature();
        int[] hello = dailyTemperature.dailyTemperatures(new int[]{23, 10, 10, 10, 10, 10, 10, 10});


        for (int i = 0; i < hello.length; i++) {
            System.out.println(hello[i]);
        }
    }
}
