package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		int totalN = (int)(N * 100);
		int nota100 = 100 * 100;
		int nota50 = 50 * 100;
		int nota20 = 20 * 100;
		int nota10 = 10 * 100;
		int nota5 = 5 * 100;
		int nota2 = 2 * 100;
		int moeda1 = 1 * 100;
		int moeda50 = (int)(0.50 * 100);
		int moeda25 = (int)(0.25 * 100);
		int moeda10 = (int)(0.10 * 100);
		int moeda05 = (int)(0.05 * 100);
		int moeda01 = (int)(0.01 * 100);
		
		int totalNota100 = (int)(totalN / nota100);
		totalN -= (nota100 * totalNota100);
		int totalNota50 = (int)(totalN / nota50);
		totalN -= (nota50 * totalNota50);
		int totalNota20 = (int)(totalN / nota20);
		totalN -= (nota20 * totalNota20);
		int totalNota10 = (int)(totalN / nota10);
		totalN -= (nota10 * totalNota10);
		int totalNota5 = (int)(totalN / nota5);
		totalN -= (nota5 * totalNota5);
		int totalNota2 = (int)(totalN / nota2);
		totalN -= (nota2 * totalNota2);
		int totalMoeda1 = (int)(totalN / moeda1);
		totalN -= (moeda1 * totalMoeda1);
		int totalMoeda50 = (int)(totalN / moeda50);
		totalN -= (moeda50 * totalMoeda50);
		int totalMoeda25 = (int)(totalN / moeda25);
		totalN -= (moeda25 * totalMoeda25);
		int totalMoeda10 = (int)(totalN / moeda10);
		totalN -= (moeda10 * totalMoeda10);
		int totalMoeda05 = (int)(totalN / moeda05);
		totalN -= (moeda05 * totalMoeda05);
		int totalMoeda01 = (int)(totalN / moeda01);
		totalN -= (moeda01 * totalMoeda01);
		
		System.out.println("NOTAS:");
		System.out.println(totalNota100 + " nota(s) de R$ 100.00");
		System.out.println(totalNota50 + " nota(s) de R$ 50.00");
		System.out.println(totalNota20 + " nota(s) de R$ 20.00");
		System.out.println(totalNota10 + " nota(s) de R$ 10.00");
		System.out.println(totalNota5 + " nota(s) de R$ 5.00");
		System.out.println(totalNota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(totalMoeda1 + " moeda(s) de R$ 1.00");
		System.out.println(totalMoeda50 + " moeda(s) de R$ 0.50");
		System.out.println(totalMoeda25 + " moeda(s) de R$ 0.25");
		System.out.println(totalMoeda10 + " moeda(s) de R$ 0.10");
		System.out.println(totalMoeda05 + " moeda(s) de R$ 0.05");
		System.out.println(totalMoeda01 + " moeda(s) de R$ 0.01");
		
		sc.close();
	}
}

