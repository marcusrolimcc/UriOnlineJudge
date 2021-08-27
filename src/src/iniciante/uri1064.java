package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] numero = new double[6];
		int positivo = 0;
		double somaPositivo = 0;
		double media;
		
		for(int i = 0 ; i <= 5 ; i++ ) {
			numero[i] = sc.nextDouble();
			if(numero[i] >= 0) {
				positivo++;
				somaPositivo += numero[i];
			}
		}
		
		media = somaPositivo / positivo;
		
		System.out.println(positivo + " valores positivos");
		System.out.print(String.format("%.1f",media));
		System.out.println();

		sc.close();
	}
}
