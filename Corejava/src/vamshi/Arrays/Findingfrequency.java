package vamshi.Arrays;

public class Findingfrequency {
    public static void main(String[] args) {
        int[] myarray = {1, 3, 1, 2, 6, 3, 2, 5};
        for (int i = 0; i < myarray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[i] == myarray[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(myarray[i] + " appears " + count + " times");
            }
        }
    }
}
