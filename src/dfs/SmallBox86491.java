package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * SmallBox86491
 */

public class SmallBox86491 {

    List<int[]> boxSpace = new ArrayList<>();

    List<Integer> resultData = new ArrayList<>();

    public int solution(int[][] sizes) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        SmallBox86491 smallBox86491 = new SmallBox86491();

        // {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}
        // {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}
        // [[20,10],[12,18]]
        int[][] sizes = {{20, 10}, {12, 18}, {12, 19}};
        
        for (int i=0; i<sizes.length; i++) {
            for (int j=0; j<sizes.length; j++) {
                smallBox86491.boxSpace.add(new int[]{sizes[i][0], sizes[j][1]});
            }
        }

        for (int i=0; i<sizes.length; i++) {
            for (int j=i+1; j<sizes.length; j++) {
                smallBox86491.boxSpace.add(new int[]{sizes[i][0], sizes[j][0]});
            }
        }


        for (int i=0; i<smallBox86491.boxSpace.size(); i++) {
            for (int k=0; k<sizes.length; k++) {
                if ((sizes[k][0] <= smallBox86491.boxSpace.get(i)[0] && sizes[k][1] <= smallBox86491.boxSpace.get(i)[1]) || (sizes[k][0] <= smallBox86491.boxSpace.get(i)[1] && sizes[k][1] <= smallBox86491.boxSpace.get(i)[0]) )  {                    

                    if (k == sizes.length -1)  {
                        // System.out.println(smallBox86491.boxSpace.get(i)[0] +", "+ smallBox86491.boxSpace.get(i)[1]);                
                        smallBox86491.resultData.add(smallBox86491.boxSpace.get(i)[0] * smallBox86491.boxSpace.get(i)[1]);
                    }                
                } else {
                    break;                
                }
            }
        }


        for (int i=0; i<smallBox86491.boxSpace.size(); i++) {
            System.out.println(smallBox86491.boxSpace.get(i)[0] +", " + smallBox86491.boxSpace.get(i)[1]);
        }


        int minValue = Collections.min(smallBox86491.resultData);
        
        System.out.println(minValue);
       
    }
}