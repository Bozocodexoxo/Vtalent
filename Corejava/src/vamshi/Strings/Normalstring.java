package vamshi.Strings;

public class Normalstring {
    public static void main(String[] args) {
        String s1 = "vamshi";
        String s2 = "vamshi";
        
        if (s1 == s2) {
            System.out.println("its same");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            
        }
        String s3=new String("vamshi");
        if(s1==s3){
            System.out.println("this is equal");
        }else{
            System.out.println("this is not equal");
        }

    }

}
