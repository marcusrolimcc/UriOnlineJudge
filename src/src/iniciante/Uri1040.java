package src.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, n5, media, media2;
		int a = 2, b = 3, c = 4, d = 1;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble(); 
		
		media = toDouble(((n1 * a) + (n2 * b) + (n3 * c) + (n4 * d))/( a + b + c + d));
		System.out.println("Media: " + media);
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if(media >= 5.00 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			n5 = sc.nextDouble();
			System.out.println("Nota do exame: " + n5);
			media2 = toDouble((n5 + media) / 2);
			if(media2 >= 5.0) {
				
				System.out.println("Aluno aprovado.");
			} else if (media2 <= 4.9) {
				
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + media2);
		}
		sc.close();
	}
	
	private static double toDouble(double x) {
		DecimalFormat format = new DecimalFormat("#0.0");
		return Double.valueOf(format.format(x));
		
	}
	
}
