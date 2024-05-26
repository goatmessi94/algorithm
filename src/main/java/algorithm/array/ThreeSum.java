package algorithm.array;

import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        //1. 특정 숫자를 기준으로 투포인터 알고리즘 반복문
        //2. 중복 값 건너 뛰기
        //3. right와 left가 만날때까지 반복
        //3.1 0보다 작으면 왼쪽이 오른쪽으로 한칸 이동
        //3.2 0보다 크면 오른쪽이 왼쪽으로 한칸 이동
        //3.3 0이라면 result 배열 값에 더해줌
        //3.3.1 left오른쪽에 추가적인 동일 값이 있는지 while 반복으로 체크
        //3.3.2 right 왼쪽에 추가적인 동일 값이 있는지 while 반복으로 체크
        //4.1 left 한칸이동
        //4.2 right 한칸이동

        int left, right;
        List<List<Integer>> answerList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            left = i+1;
            right = nums.length-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left += 1;
                } else if (sum > 0) {
                    right -= 1;
                } else {
                    answerList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1])
                        left += 1;
                    while (left < right && nums[right] == nums[right - 1])
                        right -= 1;

                    left += 1;
                    right -= 1;
                }
            }
        }


        return answerList;
    }

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> answer = threeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -5});

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i).toString());
        }
    }
}
