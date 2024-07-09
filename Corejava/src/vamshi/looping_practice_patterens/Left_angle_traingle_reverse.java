package vamshi.looping_practice_patterens;

public class Left_angle_traingle_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated met	hod stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("   ");
			}
			for (int k = i; k < n; k++) {
				System.out.print(" " + " * ");
			}
			System.out.println();
		}

}}
