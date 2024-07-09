package vamshi.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Finding_first_repating_elements {

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        Set<Integer> mys = new HashSet<>();
        int min = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (mys.contains(arr[i])) {

                min = i;
            } else {
                mys.add(arr[i]);
            }
        }
        if (min != -1) {
            System.out.println("repeating number ->" + arr[min]);
        } else {
            System.out.println("no repeating num");
        }
    }

}
