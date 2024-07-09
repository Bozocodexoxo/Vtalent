package vamshi.looping_practice_patterens;

public class Hallow_Reverse_Patteren {
    public static void main(String[] args) {
        int i, j, k, x = 5;

        for (i = x; i >= 1; i--) {

                    for (j = i; j < x; j++) {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= (2 * i - 1); k++) {
                        if (k == 1 || i == x || k == (2 * i - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
        }
    }
}

