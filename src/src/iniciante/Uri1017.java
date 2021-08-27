package src.iniciante;

import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double litros = (tempo * velocidadeMedia) / 12.00;
		
		System.out.println(String.format("%.3f", litros));
		
		sc.close();
	}
}
