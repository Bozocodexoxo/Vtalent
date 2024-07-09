package vamshi.Arrays;

import java.util.HashMap;
import java.util.Map;

public class First_Non_Repatingelements {

    public static void main(String[] args) {
        int[] myarr = {-1, 2, -1, 3, 0};
        int count = 0;
        Map<Integer, Integer> norep = new HashMap<Integer, Integer>();
        for (int i = 0; i < myarr.length; i++) {
            norep.put(myarr[i], norep.getOrDefault(myarr[i], 0) + 1);
        }
        for (int i = 0; i <= myarr.length - 1; i++) {
            if (norep.get(myarr[i]) == 1) {
                System.out.println(myarr[i]);
            }
        }

    }

}
