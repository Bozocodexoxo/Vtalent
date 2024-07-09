package vamshi.Arrays;

import java.util.Arrays;

public class Testsort {
    public static void main(String[] args) {
        int[] myarray={10,5,4,7,2,0};
    rotation(myarray);
        System.out.println(Arrays.toString(myarray));
                }
            
            public static void rotation(int[] myarray){
                boolean issorted=true;
                while(issorted){
                    issorted=false;
                    for(int i=0;i<myarray.length-1;i++){
                        if(myarray[i]>myarray[i+1]){
                            int temp=myarray[i];
                            myarray[i]=myarray[i+1];
                            myarray[i+1]=temp;
                            issorted=true;
        
            } 
        }

    }


}
}
