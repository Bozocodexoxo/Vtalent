package vamshi.Arrays;

import java.util.Arrays;

public class Arrange_positv_neg {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, -1, 4 };
        rearrange(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void rearrange(int[] myarr, int left, int right) {
        left = 0;
        right = myarr.length - 1;
        while (left <= right) {
            if (myarr[left] < 0) {
                left++;
            } else if (myarr[right] > 0) {
                right--;
            } else {
                int temp = myarr[left];
                myarr[left] = myarr[right];
                myarr[right] = temp;
            }
        }

    }
}
