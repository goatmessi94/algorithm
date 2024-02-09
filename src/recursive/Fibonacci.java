package recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    List<Integer> recursiveData = new ArrayList<>();

    public void recursive (int index, int total) { //정 방향 

        total = recursiveData.get(index -1) + recursiveData.get(index);    
        recursiveData.add(total);
        index += 1;
        if (recursiveData.get(index) < 100) {
            recursive(index, total);//based package (기저 함수)
        } else {
            recursiveData.remove(index);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.recursiveData.add(1);
        fibonacci.recursiveData.add(1);
        fibonacci.recursive(1, 100);
        System.out.println(fibonacci.recursiveData.toString());
    }
}