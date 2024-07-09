package vamshi.Arrays;

import java.util.Arrays;

public class MovingNegatives_Oneside {
public static void mysort(int[] arr){
        int temp = 0;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] > 0 && arr[right] < 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }

        }}
        public static void main(String[] args) {

            int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
mysort(arr);        
        System.out.println(Arrays.toString(arr));
    }
}
