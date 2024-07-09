package vamshi.Strings;

public class Stringwith_Methods {
    public static void main(String[] args) {
        String s1 = "vamshi";
        String s2 = new String("deque");
        if (s1.equals(s2)) {
            System.out.println("s1");
        } else {
            String s3 = s1.concat(s2);
            System.out.println(s3);
        }

    }

}
