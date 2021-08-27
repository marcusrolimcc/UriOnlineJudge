package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double MEDIA = ((A * (3.5/11)) + (B * (7.5/11)));
		
		System.out.print("MEDIA = " + String.format("%.5f", MEDIA));
		System.out.println();
		
		sc.close();
	}

}
