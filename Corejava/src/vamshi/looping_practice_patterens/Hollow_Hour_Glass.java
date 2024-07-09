package vamshi.looping_practice_patterens;

public class Hollow_Hour_Glass {
    public static void main(String[] args) {
        int i, j, k, size = 5;


        for (i = size; i >= 1; i--) {

            for (j = i; j < size; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (i = 2; i <= size; i++) {

            for (j = size; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
