package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.println("SALARY = U$ " + String.format("%.2f", salario));
		sc.close();
	}
}
