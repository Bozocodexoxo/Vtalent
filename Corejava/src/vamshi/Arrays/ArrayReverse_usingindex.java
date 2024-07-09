package vamshi.Arrays;

public class ArrayReverse_usingindex {

    public static void main(String[] args) {
        int[] myarray = {10, 2, 3, 5, 78};
        int temp = 0;
        for (int i = 0; i < myarray.length / 2; i++) {
            temp = myarray[i];
            myarray[i] = myarray[myarray.length - 1 - i];
            myarray[myarray.length - 1 - i] = temp;

        }
        for (int ans : myarray) {
            System.out.println(ans);

        }
    }
}
