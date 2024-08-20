package self;

import java.util.*;

public class Temp6 {
    public int solution(int[][] jobs) {

        int answer = 0;
        int end = 0; // 수행되고난 직후의 시간
        int jobsIdx = 0; // jobs 배열의 인덱스
        int count = 0; // 수행된 요청 갯수

        // 원본 배열 오름차순 정렬 (요청시간 오름차순)
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        // 요청이 모두 수행될 때까지 반복
        while (count < jobs.length) {

            // 하나의 작업이 완료되는 시점(end)까지 들어온 모든 요청을 큐에 넣음

            // [0,3] 이면 3까지는 바로 시작 시킬 수 있는 놈들이니까 다 때려 밖음
            // 어차피 우선순위 큐가 실행 시간으로 정렬되기 때문에 상관없음
            // 시작 할 수 있는건 바로 실행
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) { //end 수행 총시간이 더 크면 바로 실행 시킬 수 있다는 뜻임
                pq.add(jobs[jobsIdx++]);
            }

            // 큐가 비어있다면 작업 완료(end) 이후에 다시 요청이 들어온다는 의미
            // (end를 요청의 가장 처음으로 맞춰줌)
            if (pq.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0]; //끝난시간에서 시작 부터 종료시간을 더해야함
                end += temp[1];                    //end는 끝난 시간이니까 끝난 시간 고정
                count++;
            }
        }

        return (int) Math.floor(answer / jobs.length);
    }

    public static void main(String[] args) {
        Temp6 temp6 = new Temp6();
        temp6.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
    }
}
