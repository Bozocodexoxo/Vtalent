package vamshi.Arrays;

public class Minimumnumber_Binarysearch {
    public static void main(String[] args) {
        int[] my = { 5, 6, 1, 2, 3, 4 };
        int ans = findMinimumInRotatedSortedArray(my);
        System.out.println("Minimum element in array -> " + ans);
    }

    public static int findMinimumInRotatedSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        if (arr[left] <= arr[right]) {
            return arr[left];
        }

        while (left < right) {
            int mid = (left + right) / 2;

            
            if (arr[mid] > arr[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }
}
