package src.iniciante;

import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resultado;
		
		for (int i = 1 ; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(i + " x " + numero + " = " + resultado);
		}

		sc.close();
	}
}
