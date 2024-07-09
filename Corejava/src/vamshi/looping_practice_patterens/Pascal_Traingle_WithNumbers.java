package vamshi.looping_practice_patterens;

public class Pascal_Traingle_WithNumbers {
    public static void main(String[] args) {
        int size=5;
        for(int i=1;i<=size;i++){
            for(int j=0;j<size-i;j++){
                System.out.print(" ");
            }
            int x=1;
            for (int k=1;k<=i;k++){
                System.out.print(x+" ");
                x=x*(i-k)/k;
            }
            System.out.println();
        }
    }
}
