package vamshi.Arrays;

import java.util.Arrays;

public class Sort_zeros_ones {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortingtec(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortingtec(int[] a) {
        int lows = 0;
        int mids = 0;
        int highs = a.length - 1;
        int temp = 0;
        while (mids <= highs) {
            switch (a[mids]) {
                case 0:
                    temp = a[lows];
                    a[lows] = a[mids];
                    a[mids] = temp;
                    lows++;
                    mids++;
                    break;
                case 1:
                    mids++;
                    break;
                case 2:
                    temp = a[mids];
                    a[mids] = a[highs];
                    a[highs] = temp;
                    highs--;
                    break;
                default:

            }
        }

    }
}
