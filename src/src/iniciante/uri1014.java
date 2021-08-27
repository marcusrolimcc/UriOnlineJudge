package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		
		double consumo = X / Y;
		
		System.out.println(String.format("%.3f", consumo) + " km/l");
		
		sc.close();
	}
}
