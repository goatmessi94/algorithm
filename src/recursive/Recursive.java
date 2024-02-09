package recursive;

public class Recursive {

    int total = 0;

    // recursive 사용 전
    public int sum (int n) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumRecursive (int total) {
       //더 이상 쪼개지지 않는 지점에서 값을 반환
        if (total == 1) return 1; //기저사례(base case)
        return sumRecursive(total -1 ) + total;
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();

        System.out.println(recursive.sumRecursive(10));
    }
}
