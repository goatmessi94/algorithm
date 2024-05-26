package algorithm.dp;

public class ClimbingStairsTabulation {

    public int climbStairs(int n) {
        int one = 1;
        int two = 2;
        int answer = 0;

        for (int i = 2; i < n; i++) {
            int temp = two;
            answer = one + two;
            two = answer;
            one = temp;
        }

        return n== 1 ? 1 : n == 2 ? 2 : answer; //n이 1이면 1 2이면 2 나머진 answer
    }

    public static void main(String[] args) {
        ClimbingStairsTabulation climbingStairs = new ClimbingStairsTabulation();
        System.out.println(climbingStairs.climbStairs(4));
    }
}
