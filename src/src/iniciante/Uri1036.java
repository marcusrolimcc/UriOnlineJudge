package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	//CASO QUEIRA APENAS COPIAR PARA O URI, COPIE APENAS O CÓDIGO DENTRO DO MAIN,
	//E NÃO SE ESQUEÇA DOS IMPORTS

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = (B * B) - (4 * A *C);
		double raiz = (Math.pow(delta, 0.5));
		
		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}else {
		
		double R1 = (((-1 * B) + raiz) / (2 * A));
		double R2 = (((-1 * B) - raiz) / (2 * A));
		
		System.out.printf(String.format("R1 = %.5f\n", R1));
		System.out.printf(String.format("R2 = %.5f\n", R2));
		}
		sc.close();
	}
}

