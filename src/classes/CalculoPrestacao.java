package classes;

import java.util.Scanner;

public class CalculoPrestacao {

	public static void main(String[] args) {
		//criação objeto scanner		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculo Prestações");
		
		//declaração e atribuição das variáveis
		double valor, taxa, prestacao;
		int meses;
		
		System.out.println("Insira o valor: ");
		valor = ler.nextDouble();
		
		System.out.println("Insira a taxa: ");
		taxa = ler.nextDouble();
		
		System.out.println("Insira os meses: ");
		meses = ler.nextInt();
		
		//processamento
		prestacao = valor + (valor*(taxa/100)*meses);
		
		//saida
		System.out.println("Nova Prestação: R$ " + prestacao);		
	}
}