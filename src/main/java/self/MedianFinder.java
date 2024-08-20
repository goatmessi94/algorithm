package self;

import java.util.*;

public class MedianFinder {
    List<Integer> list = new ArrayList<>();

    int middleIndex = 0;

    public MedianFinder() {

    }

    public void addNum(int num) {
        middleIndex = findIdx(num, 0,list.size()-1);
        list.add(middleIndex, num);
    }

    public double findMedian() {
        double result = 0;
        if (list.size() % 2 == 0) {
            result = (double) (list.get((list.size() / 2) - 1) + list.get((list.size() / 2))) / 2;
        } else {
            result = list.get(((list.size() )/2));
        }
        return result;
    }

    public int findIdx(int num, int start, int end){
        if(start>end){
            return start;
        }
        int half = (start+end)/2;
        if(list.get(half)<num){
            return findIdx(num,half+1, end);
        }
        else{
            return  findIdx(num, start, half-1);
        }
    }
}
