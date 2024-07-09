package vamshi.Arrays;

public class Largestsum_subarray {

    public static void main(String[] args) {
        int[] myarray = { -2, -3, -4, -8, 2, -7, 5, -3 };

        int ans = sum(myarray);
        System.out.println(ans);

    }

    public static int sum(int[] myarray) {
        if (myarray.length == 1) {
            return 0;
        }
        int sum_sofar = myarray[0];
        int total = myarray[0];
        // boolean istrue = true;
        // int element = myarray[0];
        // for (int ans : myarray) {
        // if (ans > 0) {
        // istrue = false;
        // break;
        // } else {
        // if (element<ans) {
        // element = ans;
        // }
        // }
        // if (istrue) {
        // return element;
        // }
        // }
        for (int i = 1; i < myarray.length; i++) {
            total = Math.max(total + myarray[i], myarray[i]);
            if (sum_sofar < total) {
                sum_sofar = total;
            }
        }
        return sum_sofar;
    }

}
