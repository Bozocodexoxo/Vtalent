package vamshi.controlflow;
import java.util.*;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sn=new Scanner(System.in);
int marks=sn.nextInt();
if(marks>=35 && marks<=40 ) {
	System.out.println("grade is 4");
}else if(marks>=41 && marks <=75) {
	System.out.println("grade is 3");
}else if(marks >=76 && marks <=90) {
	System.out.println("grade is 2");
}else if(marks >=91 && marks <=100) {
	System.out.println("grade 1");
}
	}

}
