package vamshi.Arrays;

import java.util.Arrays;

public class Cyclic_rotate {

    public static void main(String[] args) {
        int[] rotate = {1, 2, 3, 4, 5};
        int k = 3;
        int n=rotate.length;
        k=k%n;
        myrotate(rotate, k, n - 1);
        myrotate(rotate, 0, k - 1);
        myrotate(rotate, 0, n - 1);
        System.out.println(Arrays.toString(rotate));
    }

    public static void myrotate(int[] r, int start, int end) {
        
         while (start < end) {
          int  temp = r[start];
            r[start] = r[end];
            r[end] = temp;
            start++;
            end--;
        }

    }

}
