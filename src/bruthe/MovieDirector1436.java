package bruthe;

import java.util.Scanner;

public class MovieDirector1436 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 666;

        while (num > 1) {
            count ++;
            if (Integer.toString(count).contains("666")) {
                num--;
            }
        }

        System.out.println(count);
    }
}
