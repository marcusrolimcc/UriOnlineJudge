package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1063 {

	//CASO QUEIRA APENAS COPIAR PARA O URI, COPIE APENAS O CÓDIGO DENTRO DO MAIN,
	//E NÃO SE ESQUEÇA DOS IMPORTS

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = B * B - 4 * A * C;
		double raiz = Math.sqrt(delta);
		
		if (raiz < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		}
		
		double R1 = (-B + raiz) / ( 2 * A);
		double R2 = (-B - raiz) / ( 2 * A);
		
		if((R1 >= 0 || R1 <= 0) && (R1 >= 0 || R1 <= 0)) {
		
			System.out.println("R1 = " + String.format("R1 = %.5f", R1));
			System.out.println("R2 = " + String.format("R2 = %.5f", R2));
		}else {
			System.out.println("Impossivel calcular");
		}
		sc.close();
	}
}

