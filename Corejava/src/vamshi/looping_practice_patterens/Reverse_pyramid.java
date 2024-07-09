package vamshi.looping_practice_patterens;

public class Reverse_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < size - i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
