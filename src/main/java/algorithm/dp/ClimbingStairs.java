package algorithm.dp;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int dp[] = new int[46];
        if (n <= 2)
            return n;

        if (dp[n] != 0)
            return dp[n];
        dp[n] = climbStairs(n - 2) + climbStairs(n - 1);
        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(4));
    }
}
