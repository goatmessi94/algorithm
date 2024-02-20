package bruthe;

import java.util.Scanner;

public class ModifySum2231 {

    public static void solution() {

        Scanner scanner = new Scanner(System.in);

        String[] firstLineTokens = scanner.nextLine().split(" ");
        int[] firstLineNumbers = new int[firstLineTokens.length];
        for (int i = 0; i < firstLineTokens.length; i++) {
            firstLineNumbers[i] = Integer.parseInt(firstLineTokens[i]);
        }
        
        int limit = firstLineNumbers[0];
        int min = limit;
        for (int i=limit-1; i>0; i--) {
            int total = i;
            //숫자 String으로 변환
            String numStr = Integer.toString(i);
            
            for (int k=0; k<numStr.length(); k++) {
                total += Character.getNumericValue(numStr.charAt(k));
            }    
            if (total == limit) {
                if (min >= i) min = i;
            }
        } 

        if (min == limit) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
        
    }

    public static void main(String[] args) {
        ModifySum2231 modifySum2231 = new ModifySum2231();
        modifySum2231.solution();
    }
}
