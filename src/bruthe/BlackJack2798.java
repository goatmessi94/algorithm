package bruthe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * BlackJack2798
 */
public class BlackJack2798 {

    public void solution() throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);

        // 두 번째 줄을 읽고 공백으로 구분된 숫자를 배열로 변환
        String[] secondLineTokens = scanner.nextLine().split(" ");
        int[] secondLineNumbers = new int[secondLineTokens.length];
        for (int i = 0; i < secondLineTokens.length; i++) {
            secondLineNumbers[i] = Integer.parseInt(secondLineTokens[i]);
        }

        // 첫 번째 줄을 읽고 공백으로 구분된 숫자를 배열로 변환
        String[] firstLineTokens = scanner.nextLine().split(" ");
        int[] firstLineNumbers = new int[firstLineTokens.length];
        for (int i = 0; i < firstLineTokens.length; i++) {
            firstLineNumbers[i] = Integer.parseInt(firstLineTokens[i]);
        }

        scanner.close();

        Arrays.sort(firstLineNumbers);
        System.out.println("Sorted arr[] : " + Arrays.toString(firstLineNumbers));
        List<Integer> listInt = new ArrayList<>();

        // 1. 합보다 큰 놈은 인덱스에서 제외한다.
        //2. 제일 큰놈 + (다음작은놈의 재귀)
                // 하나씩 제일큰놈을 줄임
        //3. 제일큰놈의 최소는 3개를 더했을 때 합보다 작은놈

        int insertData = 500;
        
        int maxIndex = 0;
        int minIndex = 0;

        for (int i=firstLineNumbers.length-1; i>=0; i--) {
            if (firstLineNumbers[i] <= insertData) {
                maxIndex = firstLineNumbers[i];
                break;
            }
        }

        for (int i=0; i<firstLineNumbers.length; i++) {
            int total = firstLineNumbers[i] + firstLineNumbers[i+1] + firstLineNumbers[i+2];
            if (total > insertData && i != 0) minIndex = i-1; 
        }


        //0 + 1,2 
        // 0 + 1,3

        // function void recursive(int head, ) {
            
        // }

        int resultMin = 500;

        //종료 조건 
        //minIndex가 인덱스 대빵이 될 때
        

    //    minIndex == smallIndex; 

    //1. 베이스 바로 윗단계 생각하기

    // 3 + 2
    // (head + child, child)
    // child == 0 종료





        // for (int i=maxIndex; i>minIndex; i--) {
        
            
        //     firstLineNumbers[i]; // + 재귀
        // }

        // for (int i=0; i<firstLineNumbers.length; i++) {
        //     if (i == firstLineNumbers.length-1) {
        //         int total= firstLineNumbers[i] + firstLineNumbers[0] + firstLineNumbers[1] ;
        //         listInt.add(total);
        //     } else if (i == firstLineNumbers.length-2) {
        //         int total= firstLineNumbers[i] + firstLineNumbers[i + 1] + firstLineNumbers[0] ;
        //         listInt.add(total);
        //     } else {
        //         int total= firstLineNumbers[i] + firstLineNumbers[i + 1] + firstLineNumbers[i + 2] ;
        //         listInt.add(total);
        //     }
        // }

        // int min = 500;
        // int result = 0;
        // int index = 0;
        // for (int i=0; i<listInt.size(); i++) {
        //     System.out.println(listInt.get(i));

        //     if (i == 0 ) {
        //         result = Math.abs(listInt.get(i) - min);
        //         index = 0;
        //     } else {
        //         if (result > Math.abs(listInt.get(i) - min)) {
        //             index = i;
        //             result = Math.abs(listInt.get(i) - min);
        //         }
        //     }
        // }


        // System.out.println(listInt.get(index));

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        //재귀로 풀면 될 것 같음
        //처음 인덱스를 찾아 , 안되는 인덱스도 골라놔
        BlackJack2798 blackJack2798 = new BlackJack2798();
        blackJack2798.solution();
    }
}