package vamshi.looping_practice_patterens;

public class Hollow_diamond_pattern {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {

            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {

            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
