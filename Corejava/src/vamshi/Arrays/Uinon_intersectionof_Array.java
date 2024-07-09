package vamshi.Arrays;

import java.util.Set;
import java.util.TreeSet;

public class Uinon_intersectionof_Array {

    public static void main(String[] args) {
        int[] myarary = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        Set<Integer> un = new TreeSet<Integer>();
        for (int i = 0; i < myarary.length; i++) {
            un.add(myarary[i]);

        }
        for (int j = 0; j < arr2.length; j++) {
            un.add(arr2[j]);
        }
        System.out.println(un);
    }

}
