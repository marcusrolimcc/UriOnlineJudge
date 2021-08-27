package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		double pi = 3.14159;
		
		double VOLUME = (4/3.0) * pi * Math.pow(R, 3);
		
		System.out.println("VOLUME = " + String.format("%.3f", VOLUME));
		sc.close();
	}
}
