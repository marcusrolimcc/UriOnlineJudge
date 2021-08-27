package src.iniciante;

import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = 0;
		int nota1 = 0;
		int nota2 = 0;
		int nota5 = 0;
		int nota10 = 0;
		int nota20 = 0;
		int nota50 = 0;
		int nota100 = 0;
		
		if(N >= 0 && N < 1000000) {
			nota100 = (int)(N / 100);
			num = N - (nota100 * 100);
			nota50 = (int)(num / 50);
			num = num - (nota50 * 50);
			nota20 = (int)(num / 20);
			num = num - (nota20 * 20);
			nota10 = (int)(num / 10);
			num = num - (nota10 * 10);
			nota5 = (int)(num / 5);
			num = num - (nota5 * 5);
			nota2 = (int)(num / 2);
			num = num - (nota2 * 2);
			nota1 = (int)(num / 1);
			num = num - (nota1 * 1);
			
		}else {
			System.out.println("Opcao invalida!");
		}
		
		System.out.println(N);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");

		sc.close();
	}
}
