package vamshi.looping_practice_patterens;

public class Mirrorimage_triangle {
    public static void main(String[] args) {
        int size = 5;
        //top
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // bottom
        for (int i = size - 1; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


