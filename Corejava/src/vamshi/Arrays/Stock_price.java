package vamshi.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class Stock_price {
    public static void main(String[] args) {
        int[] myarray = { 100, 80, 60, 70, 60, 75, 85 };
       int[] ans= mystock(myarray);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mystock(int[] m) {
        int t = m.length;
        int[] ans = new int[m.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < t; i++) {
            while (!st.isEmpty() && m[st.peek()] <= m[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i+1;

            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);

        }
        return ans;
    }

}
