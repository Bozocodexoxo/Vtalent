package vamshi.Arrays;

public class Minimumnumber_Linearsearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int min_ele = arr[0];
        int flag = 0;
        for (int ans : arr) {
            if (min_ele > ans) {
                min_ele = ans;
                flag++;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("no element found");
        }
        System.out.println("minimum element in array -> "+min_ele);
    }
}
