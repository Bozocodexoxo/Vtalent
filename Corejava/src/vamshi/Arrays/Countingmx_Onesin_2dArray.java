package vamshi.Arrays;

public class Countingmx_Onesin_2dArray {
    public static void main(String[] args) {
        int[][] countsof = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 } };
        // not jagged array
        int ans = Getting1(countsof, 4, 4);
        System.out.println(ans);
    }

    public static int Getting1(int[][] countsof, int r, int c) {
        int row = 0;
        int max1 = 0;
        for (int i = 0; i < r; i++) {
            int count1s = 0;

            for (int j = 0; j < c; j++) {
                if (countsof[i][j] == 1) {
                    count1s++;
                }
            }
            if (max1 < count1s) {
                max1 = count1s;
                row = i;
            }
        }
        return row;
    }
}
