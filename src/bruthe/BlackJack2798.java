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
 * BlackJack2798, 일반적 풀이 1
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
        // System.out.println("Sorted arr[] : " + Arrays.toString(firstLineNumbers));
        List<Integer> listInt = new ArrayList<>();
        
        int limit = secondLineNumbers[1];
        int minResultData = 0;
        int[] minResultArray = new int[3];
        boolean check = true;

        // 풀이 1. for문으로 전부 다 고려
        for (int i=firstLineNumbers.length-1; i>1; i--) {
            for (int j=i-1; j>0; j--) {
                for (int k=j-1; k>=0; k--) {
                    int sum = firstLineNumbers[i] + firstLineNumbers[j] + firstLineNumbers[k];
                    // System.out.println("숫자는 = " + firstLineNumbers[i] + ", " + firstLineNumbers[j] + ", " + firstLineNumbers[k]);
                    if (check && sum <= limit) {                
                        minResultArray[0] = firstLineNumbers[i];
                        minResultArray[1] = firstLineNumbers[j];
                        minResultArray[2] = firstLineNumbers[k];                    
                        minResultData = limit - sum;
                        check = false;
                    } else if (sum <= limit){                
                        if (minResultData > limit - sum) {
                            minResultArray[0] = firstLineNumbers[i];
                            minResultArray[1] = firstLineNumbers[j];
                            minResultArray[2] = firstLineNumbers[k];  
                            minResultData = limit - sum;
                        }                    
                    }
                }
            }
        }

        int resultSum = 0;
        
        for (int i=0; i<minResultArray.length; i++) {
            resultSum += minResultArray[i];
        }

        System.out.println(resultSum);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        //재귀로 풀면 될 것 같음
        //처음 인덱스를 찾아 , 안되는 인덱스도 골라놔
        BlackJack2798 blackJack2798 = new BlackJack2798();
        blackJack2798.solution();
    }
}

