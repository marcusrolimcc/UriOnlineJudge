package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	//ERRO:	Wrong answer (0%)
	//TUDO INDICA QUE É UM ERRO DE ARREDONDAMENTO QUE A URI ENCONTROU NOS TESTES
	//AINDA NÃO DESCOBRI COMO CORRIGIR
	
	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		double num = 0;
		double centavos = 0;
		int nota2 = 0;
		int nota5 = 0;
		int nota10 = 0;
		int nota20 = 0;
		int nota50 = 0;
		int nota100 = 0;
		int moeda001 = 0;
		int moeda005 = 0;
		int moeda010 = 0;
		int moeda025 = 0;
		int moeda050 = 0;
		int moeda1 = 0;
						
		if(N >= 0 && N < 1000000) {
			
			nota100 = (int)(N / 100);
			num = (int)(N - (nota100 * 100));
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
			moeda1 = (int)(num / 1);
			num = num - (moeda1 * 1);
			
			centavos = N - (nota100 * 100) - (nota50 * 50) - (nota20 * 20) - (nota10 * 10) - (nota5 * 5) - (nota2 * 2) - (moeda1 * 1);
			
			moeda050 = (int)(centavos / 0.50);
			centavos = centavos - (moeda050 * 0.50);
			moeda025 = (int)(centavos / 0.25);
			centavos = centavos - (moeda025 * 0.25);
			moeda010 = (int)(centavos / 0.10);
			centavos = centavos - (moeda010 * 0.10);
			moeda005 = (int)(centavos / 0.05);
			centavos = centavos - (moeda005 * 0.05);
			moeda001 = (int)(centavos * 100);
								
		}else {
			System.out.println("Opcao invalida!");
		}
		
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda050 + " moeda(s) de R$ 0.50");
		System.out.println(moeda025 + " moeda(s) de R$ 0.25");
		System.out.println(moeda010 + " moeda(s) de R$ 0.10");
		System.out.println(moeda005 + " moeda(s) de R$ 0.05");
		System.out.println(moeda001 + " moeda(s) de R$ 0.01");
		System.out.println();

		sc.close();
	}
}
