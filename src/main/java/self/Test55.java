package self;

public class Test55 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length; // 배열의 길이를 n에 저장
        int[] dp = new int[n]; // 동적 프로그래밍을 위한 배열 dp 생성

        for (int i = 0; i < n; i++) { // 배열의 각 원소에 대해서 반복
            int max = arr[i]; // 현재 원소를 최댓값으로 초기화

            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                // 최대 길이가 k인 부분 배열을 만들기 위한 반복문
                // 현재 원소로부터 역방향으로 j개의 원소를 포함한 부분 배열을 만들어봄

                max = Math.max(max, arr[i - j + 1]); // 최댓값 갱신

                // 현재 부분 배열의 최댓값을 구하고, 이를 이용하여 dp 값을 업데이트
                dp[i] = Math.max(dp[i], (i >= j ? dp[i - j] : 0) + max * j);
            }
        }


        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }

        return dp[n - 1]; // 마지막 원소까지 고려한 최댓값 반환
    }


    public static void main(String[] args) {
        Test55 test55 = new Test55();
        test55.maxSumAfterPartitioning(new int[]{1,15,7,9,2,5,10}, 3);
    }
}
