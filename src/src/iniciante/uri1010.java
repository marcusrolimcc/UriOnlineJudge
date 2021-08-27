package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String peca1[] = new String[3]; 
		String peca2[] = new String[3];
		
		peca1 = sc.nextLine().split(" ");
		peca2 = sc.nextLine().split(" ");
		
		int codPeca1 = Integer.parseInt(peca1[0]);
		int numPeca1 = Integer.parseInt(peca1[1]);
		double valorPeca1 = Double.parseDouble(peca1[2]);
		
		int codPeca2 = Integer.parseInt(peca2[0]);
		int numPeca2 = Integer.parseInt(peca2[1]);
		double valorPeca2 = Double.parseDouble(peca2[2]);
					
		double TOTAL = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		
		System.out.print("VALOR A PAGAR: R$ " + String.format("%.2f", TOTAL));
		System.out.println();
				
		sc.close();
	}
}
