package vamshi.Strings;

import java.util.Arrays;

public class String_reverse_2 {
    public static void main(String[] args) {
        String s = "welcome to the city of Hyderabad";

        String[] cont = s.split(" ");
        StringBuilder sr = new StringBuilder();
        for (int i = 0; i < cont.length; i++) {
            char[] ch = cont[i].toCharArray();
            int start = 0;
            int end = ch.length - 1;
            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            sr.append(ch);
            if (i < cont.length - 1) {
                sr.append(" ");
            }


        }
        System.out.println(sr);
    }
}
