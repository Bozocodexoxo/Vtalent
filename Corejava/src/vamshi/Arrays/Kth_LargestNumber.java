package vamshi.Arrays;

import java.util.PriorityQueue;

public class Kth_LargestNumber {

    public static void main(String[] args) {
        int[] m = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int K = 4;
        int ans = findingKth_Big(m, K);
        System.out.println(ans);
    }

    private static int findingKth_Big(int[] m, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> a - b);
        for (int i = 0; i < m.length; i++) {
            q.add(m[i]);
            if (q.size() > K) {
                q.poll();
            }
        }
        System.out.println(q);
        return q.peek();

    }

}
