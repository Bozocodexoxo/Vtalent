package vamshi.Arrays;

import java.util.Arrays;

public class Sort_Array_Ascending {

    public static void main(String[] args) {
        int[] arr = {0, 23, 14, 12, 9};
        B_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void B_sort(int[] arr) {
        boolean issorted = true;
        while (issorted) {
            issorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    issorted = true;
                }
            }
        }
    }
}
