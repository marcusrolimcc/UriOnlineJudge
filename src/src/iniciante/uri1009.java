package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double TOTAL = salarioFixo + totalVendas * 0.15;
		
		System.out.println("TOTAL = R$ " + String.format("%.2f",TOTAL));
		sc.close();

	}

}
