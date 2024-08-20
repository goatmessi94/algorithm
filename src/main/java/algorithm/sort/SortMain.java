package algorithm.sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 1, 3, 9, 6, 7};

        BubbleSort bubbleSort = new BubbleSort();
        InsertSort insertSort = new InsertSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();




        System.out.println(Arrays.toString(bubbleSort.solution(data)));
    }
}
