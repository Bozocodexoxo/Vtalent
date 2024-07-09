package vamshi.Strings;

public class Charat_string {
    public static void main(String[] args) {
        String ss = "vamshi";
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < ss.length(); i++) {
            sb.append(ss.charAt(i));
        }
        sb.reverse();
        System.out.println(sb);
    }
}
