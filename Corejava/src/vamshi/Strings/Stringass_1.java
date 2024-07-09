package vamshi.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringass_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        String value=bf.readLine();
        String username="vamshi";
        String password = "vamshi@143";
        if(username.equals(value)&&password.startsWith("vamshi")){
            System.out.println("login sucessful");
        }else{
            System.out.println("login failed");
        }
    }
}
