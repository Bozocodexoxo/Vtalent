package vamshi.looping_practice_patterens;

public class Zero_Ones_patteren {
    public static void main(String[] args) {
        int i, j, size = 5;
        for (i = 0; i < size; i++) {
            for (j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}
