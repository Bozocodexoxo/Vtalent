package vamshi.looping_practice_patterens;

public class Reverse_Pyramid_number {
     public static void main(String[] args) {
            // TODO Auto-generated method stub
            int size = 5;
            for (int i = 1; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");

                }
                for (int k = 0; k < size - i; k++) {
                    System.out.print(" "+i );
                }
                System.out.println();
            }
        }

    }


