package bruthe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BigBody7568 {

    public static void solution() {

        Scanner scanner = new Scanner(System.in);


        String[] firstLineTokens = scanner.nextLine().split(" ");
        int[] firstLineNumbers = new int[firstLineTokens.length];
        for (int i = 0; i < firstLineTokens.length; i++) {
            firstLineNumbers[i] = Integer.parseInt(firstLineTokens[i]);
        }

        int[][] numArray = new int[firstLineNumbers[0]][2];

        for (int i=0; i<firstLineNumbers[0]; i++) {
            String[] secondLineTokens = scanner.nextLine().split(" ");
            int[] secondLineNumbers = new int[secondLineTokens.length];
            for (int k = 0; k < secondLineTokens.length; k++) {
                secondLineNumbers[k] = Integer.parseInt(secondLineTokens[k]);
            }
            numArray[i][0] = secondLineNumbers[0];
            numArray[i][1] = secondLineNumbers[1];
        }

        Stack<int[]> stack = new Stack<>(); 
        

        // numArray를 xArray로 복사
        int[][] xArray = Arrays.copyOf(numArray, numArray.length);
        // xArray를 첫 번째 요소로 정렬
        Arrays.sort(xArray, (arr1, arr2) -> Integer.compare(arr2[0], arr1[0]));
        // numArray를 yArray로 복사
        int[][] yArray = Arrays.copyOf(numArray, numArray.length);
        // yArray를 두 번째 요소로 정렬
        Arrays.sort(yArray, (arr1, arr2) -> Integer.compare(arr2[1], arr1[1]));

        // for (int i = 0; i < numArray.length; i++) {
        //     System.out.println(numArray[i][0] + ", " + numArray[i][1]);
        // }

        // System.out.println("종료 1");

        // for (int i = 0; i < xArray.length; i++) {
        //     System.out.println(xArray[i][0] + ", " + xArray[i][1]);
        // }

        // System.out.println("종료 2");

        // for (int i = 0; i < yArray.length; i++) {
        //     System.out.println(yArray[i][0] + ", " + yArray[i][1]);
        // }

        Map<String, Integer> map = new HashMap();

        int count = 1; 
        for (int i=0; i<numArray.length; i++) {
            for (int j=0; j<numArray.length; j++) {           
                if (xArray[i][1] < yArray[j][1] && xArray[i][0] < yArray[j][0]) continue;        
                if (xArray[i][1] <= yArray[j][1]) {
                    map.put(yArray[j][0]+","+yArray[j][1], count);
                    // System.out.println(yArray[j][0] + ", " +yArray[j][1]);
                    stack.push(yArray[j]);
                }
                else { 
                    i = i + stack.size()-1;      
                    count = count + stack.size();                                                                                 
                    while (!stack.isEmpty()) {
                        // System.out.println(count);                                        
                        stack.pop();
                    }                                        
                    break;
                }
            }
        }

        while (!stack.isEmpty()) {
            // System.out.println(count);                                      
            stack.pop();
        }  

        String resultStr = "";

        for (int i=0; i< numArray.length; i++) {   
                 
            // System.out.println("정답은 = "+ numArray[i][0]+","+numArray[i][1] + "="+map.get(numArray[i][0]+","+numArray[i][1]));
            
            resultStr = resultStr +" "+ map.get(numArray[i][0]+","+numArray[i][1]);
        }

        System.out.println(resultStr.trim());

        // System.out.println(resultStr.trim().equals("2 2 1 2 5"));
    //    System.out.println(resultStr + map.get(numArray[numArray.length-1][0]+","+numArray[numArray.length-1][1]));
    }

    public static void main(String[] args) {
        BigBody7568 bigBody7568 = new BigBody7568();
        bigBody7568.solution();
    }
}
