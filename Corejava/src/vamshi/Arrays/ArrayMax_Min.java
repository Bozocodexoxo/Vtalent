package vamshi.Arrays;

public class ArrayMax_Min {

    public static void main(String[] args) {
        int[] array = {1, 10, 30, 6};
        int max = array[0];
        int min = array[0];

        for (int a : array) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;

            }
        }
        System.out.println("maximum : " + max);
        System.out.println("minimum : " + min);
    }

}
