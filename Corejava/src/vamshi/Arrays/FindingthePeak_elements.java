package vamshi.Arrays;

public class FindingthePeak_elements {
    public static void main(String[] args) {
        int[] arr={3, 1, 2, 3};
        int n=4;
    int ans=peakElement(arr, n);
    System.out.println(ans);
    }  
      public static int peakElement(int[] arr,int n)
        {
             n = arr.length;
                    if (n == 1) {
                        return 0;
                    }
                    if (arr[0] >= arr[1]) {
                        return 0;
                    }
                    if (arr[n-1] >= arr[n-2]) {
                        return n-1;
                    }
                    for (int i = 1; i < n-1; i++) {
                        if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                            return i;
                        }
                    }
                    return -1;
                }
            
            }
            
        
        


