package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		
		System.out.print("A=" + String.format("%.4f", area));
		System.out.println();

		sc.close();
	}
}
