package bruthe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Hansu {
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1 ; i<=a; i++) {
            String numStr = Integer.toString(i);
            int check = 0;
            boolean checkBool = true;
            for (int j=0; j<numStr.length()-1; j++) {
                if (j!=0) {
                   if (check != (Character.getNumericValue(numStr.charAt(j)) - Character.getNumericValue(numStr.charAt(j+1)))) {            
                    checkBool = false;
                   }
                } else {
                    check = (Character.getNumericValue(numStr.charAt(j)) - Character.getNumericValue(numStr.charAt(j+1)));
                }           
            }
            if (checkBool == true) list.add(i);
        }

        System.out.println(list.size());
    }
}
