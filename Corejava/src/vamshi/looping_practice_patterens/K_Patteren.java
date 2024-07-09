package vamshi.looping_practice_patterens;

public class K_Patteren {
    public static void main(String[] args) {
        int i, j, k = 5;
        //upper k
        for (i = 0; i < k; i++) {
            for (j = 0; j < k - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }//lower k
        for (i = 1; i < k; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
