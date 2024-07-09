package vamshi.controlflow;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class My_switch {

	public static void main(String[] args) throws Exception  { 
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String value=br.readLine();
switch(value) {
case "jan":
	System.out.println("month is january");
	break;
case "feb":
	System.out.println("month is feburary");
	break;
case "mar":
	System.out.println("month is march");
	break;
case "apr":
	System.out.println("month is april");
	break;
case "may":
	System.out.println("month is may");
	break;
case "june":
	System.out.println("month is june");
	break;
case "july":
	System.out.println("month is july");
	break;
case "aug":
	System.out.println("month is august");
	break;
case "sep":
	System.out.println("month is september");
	break;
case "oct":
	System.out.println("month is october");
	break;
case "nov":
	System.out.println("month is novomber");
	break;
case "dec":
	System.out.println("month is december");
	break;
default :
	System.out.println("not a month");

}
	}

}
