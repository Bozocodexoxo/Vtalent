package vamshi.Arrays;

public class Maximum_productsinSum {
    public static void main(String[] args) {
        int[] arr = { 6, -3, -10, 0, 2 };
        int ans = maxproduct(arr);
        System.out.println(maxproduct(arr));
    }

    public static int maxproduct(int[] myarray) {
        int max = myarray[0];
        int min = myarray[0];
        int result = myarray[0];
        for (int i = 1; i < myarray.length; i++) {
            if (myarray[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(myarray[i], max * myarray[i]);
            min = Math.min(myarray[i], min * myarray[i]);
            result = Math.max(result, max);
        }
        return result;
    }

}
