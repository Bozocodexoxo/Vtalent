package vamshi.looping_practice_patterens;

public class Rhombus_patteren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size=6;
for(int i=0;i<size;i++) {
	for(int j=0;j<size-i;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<size;k++) {
		System.out.print("*");
	}
	System.out.println( );
}
	}

}
