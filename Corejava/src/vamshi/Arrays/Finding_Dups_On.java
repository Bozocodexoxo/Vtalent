package vamshi.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Finding_Dups_On {

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i] )-1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                dups.add(index + 1);

            }

        }
        System.out.println(dups);
    }

}
