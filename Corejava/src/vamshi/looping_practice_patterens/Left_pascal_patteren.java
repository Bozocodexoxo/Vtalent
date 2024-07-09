package vamshi.looping_practice_patterens;

public class Left_pascal_patteren {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        int t = size;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < t; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}