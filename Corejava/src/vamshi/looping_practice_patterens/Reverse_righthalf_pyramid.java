package vamshi.looping_practice_patterens;

public class Reverse_righthalf_pyramid {
    public static void main(String[] args) {
        int i, j, size = 5;
        for (i = 0; i <= size; i++) {
            for (j = 0; j <= size - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
