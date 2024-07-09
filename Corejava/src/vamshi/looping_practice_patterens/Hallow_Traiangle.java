package vamshi.looping_practice_patterens;

public class Hallow_Traiangle {

    public static void main(String[] args) {
        int i, j, k, size = 5;
        for (i = 1; i <= size; i++) {

            for (k = size - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



