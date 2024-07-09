package vamshi.Arrays;

public class Twodimension_array {

    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}, {10, 20, 30}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
