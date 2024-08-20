package self;

import java.util.*;

public class Temp7 {
    public boolean increasingTriplet(int[] nums) {
        ArrayList<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nodeList.add(new Node(i, nums[i]));
        }
        // Sort the list using the ValueComparator
        Collections.sort(nodeList, Node.ValueComparator);


        int left = 0;
        int middle = 1;
        int right = 2;

        while (right < nums.length) {
            if (nodeList.get(left).index < nodeList.get(middle).index && nodeList.get(middle).index < nodeList.get(right).index )
                return true;
            else {
                left += 1;
                middle += 1;
                right += 1;
            }
        }


        return false;
    }

    static class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
        public static Comparator<Node> ValueComparator = new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n1.value, n2.value);
            }
        };
    }

    public static void main(String[] args) {

    }

}
