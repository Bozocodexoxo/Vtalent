package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brandswitch {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String value = br.readLine();
		switch (value) {
		case "Nike" -> System.out.println("Just Do It");
		case "Adidas" -> System.out.println("Impossible Is Nothing");
		case "Puma" -> System.out.println("Forever Faster");
		case "Rebook" -> System.out.println("I Am What I Am");
		default -> System.out.println("No Brand");
		}
	}
}
