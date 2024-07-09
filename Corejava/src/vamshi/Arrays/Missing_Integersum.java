package vamshi.Arrays;

public class Missing_Integersum {
    public static void main(String[] args) {
        int[] myarray={1,2,3,5,6,7,8,9};
int n=myarray.length;
        int sum=0;
        for(int i=0;i<n-1;i++){
sum+=myarray[i];
}
int expected =(n*(n+1))/2;
System.out.println(expected-sum);
    }

}
