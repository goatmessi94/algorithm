package linear;

import java.util.ArrayList;
import java.util.List;

/**
 * SelfNumber4673 : 백준
 */
public class SelfNumber4673 {
    List<Integer> result = new ArrayList<>();
    int resutArray[] = new int[10001];

    public void solution() {      
        for (int i=1; i<=10000; i++) {
            int defaultCont = i;
            while (defaultCont <= 10000) {                

                String defauString = Integer.toString(defaultCont);
                for (int s = 0; s < defauString.length(); s ++) {
                    defaultCont += Integer.parseInt(defauString.substring(s, s+1));
                }    

                if (defaultCont <= 10000) resutArray[defaultCont] = 1;
            }
        }  
    }

    public static void main(String[] args) {
        SelfNumber4673 selfNumber4673 = new SelfNumber4673();
        selfNumber4673.solution();

        for (int i=1; i < 10000; i ++) {
            if (selfNumber4673.resutArray[i] == 0){
                System.out.println(i);
            }        
        }
    }
}