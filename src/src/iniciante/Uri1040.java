package src.iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		
		System.out.println("Media final: " + df.format(media));
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado.");
		}else if(media < 7.0 && media >= 5.0){
			System.out.println("Aluno em exame.");
			double n5 = sc.nextDouble();
			System.out.println("Nota do exame: " + n5);
			media = (media + n5) / 2.0;
			if(media > 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format(media));
			}else {
				System.out.println("Aluno reprovado.");
			}
		}
		sc.close();
	}
}
