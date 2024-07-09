package vamshi.Arrays;

import java.io.IOException;

public class Gcd_of_Largenumber {
    public static void main(String[] args)throws IOException {
        // InputStreamReader isr=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(isr);
        // String value=bf.readLine();
        // int number=Integer.parseInt(value);
        int ans=gcd(50, 100);
        System.out.println(ans);
    }
    public static  int gcd(int a,int b){
        if(b==0){
            return a;
        }
            return gcd(b, a%b); 
        }
}
