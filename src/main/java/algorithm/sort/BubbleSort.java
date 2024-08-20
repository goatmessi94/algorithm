package algorithm.sort;

public class BubbleSort {
    public int[] solution (int[] data) {
        for (int i = 1; i < data.length; i++) { //
            for (int j = 0; j < data.length-1; j++) { // 마지막 원소 까지 접근하면 배열 범위벗어난 에러남
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
}
