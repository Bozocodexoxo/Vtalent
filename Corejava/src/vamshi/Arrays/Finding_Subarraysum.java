package vamshi.Arrays;

public class Finding_Subarraysum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int start = 0;
        int currentSum = 0;

        int sum = 33;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            while (currentSum > sum && start <= i) {

                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.println(start + " " + i);
                break;
            }
        }
    }
}
