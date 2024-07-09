package vamshi.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyear {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String value = br.readLine();
		int numb = Integer.parseInt(value);
		boolean is_leapyear = false;
		if (numb % 4 == 0) {
			is_leapyear = true;
			if (numb % 100 == 0) {
				if (numb % 400 == 0)
					is_leapyear = true;
				else
					is_leapyear = false;
			}
		} else {
			is_leapyear = false;
		}
		if (!is_leapyear) {
			System.out.println("not a leapyear : " + numb);
		} else {
			System.out.println("leapyear  : " + numb);
		}
	}

}
