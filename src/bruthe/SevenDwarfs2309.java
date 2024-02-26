package bruthe;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SevenDwarfs2309 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] dwarfs = new int[9];
        int tempOne = 0;
        int tempTwo = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = sc.nextInt();
        }

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (i==j) continue;

                int sum = 0;
                for (int k=0; k<9; k++) {
                    if (i==k || j==k) continue;
                    sum += dwarfs[k];
                }
                if (sum == 100) {
                    tempOne = dwarfs[i];
                    tempTwo = dwarfs[j];
                    Arrays.sort(dwarfs); // 먼저 정렬을 하면 i와 j값 도 바뀜
                    for (int y=0; y<9; y++) {
                        if (dwarfs[y] == tempOne || dwarfs[y] == tempTwo) continue;

                        System.out.println(dwarfs[y]);
                    }
                    return;
                }
            }
        }
    }
}
