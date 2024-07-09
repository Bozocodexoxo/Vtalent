package vamshi.Arrays;

import java.util.Arrays;

public class Quicksort_array {

    public static int Divideconqueor(int[] myarray, int left, int right) {
        int pivot = myarray[(left + right) / 2];
        while (left <= right) {
            while (myarray[left] < pivot) {
                left++;
            }
            while (myarray[right] > pivot) {
                right--;
            }
            if (left <= right) {
                Swapmethod(myarray, left, right);
                left++;
                right--;
            }

        }

        return left;
    }

    public static void Swapmethod(int[] myarray, int start, int end) {
        int temp = myarray[start];
        myarray[start] = myarray[end];
        myarray[end] = temp;
    }

    public static void Arrange(int[] myarray, int start, int end) {
        if (start < end) {
            int left = Divideconqueor(myarray, start, end);

            Arrange(myarray, start, left - 1);

            Arrange(myarray, left, end);
        }
    }

    public static void main(String[] args) {
        int[] myarray = { 1, 9, 6, 8, 9, 5, 10, 5, 7 };
        int start = 0;
        int end = myarray.length - 1;
        Arrange(myarray, start, end);
        System.out.println(Arrays.toString(myarray));

    }
}
