package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double MEDIA = (A * 0.2) + (B * 0.3) + (C * 0.5);
		
		System.out.print("MEDIA = " + String.format("%.1f", MEDIA));
		System.out.println();
						
		sc.close();
	}
}
