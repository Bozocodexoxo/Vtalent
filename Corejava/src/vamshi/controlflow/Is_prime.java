package vamshi.controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Is_prime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String value=br.readLine();
int number=Integer.parseInt(value);
int mark=0;
if(number<=1) {
	System.out.println("number is not prime");
}
for(int i=2;i<number/2;i++) {
	if(number%i==0) {
		System.out.println("not prime");
		mark=1;
		break;}
}
if(mark==0) {

System.out.println("number is  prime");
}
	}
	}


