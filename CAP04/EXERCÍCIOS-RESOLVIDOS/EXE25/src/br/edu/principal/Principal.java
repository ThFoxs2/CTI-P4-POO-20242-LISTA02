package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, qtd;
		
		System.out.println("Custo do espetáculo teatral: ");
		custo = sc.nextDouble();
		System.out.println("Preço do convite: ");
		convite = sc.nextDouble();
		qtd = custo / convite;
		System.out.println("Seriam nescessário "+qtd+" de convites para alcançar o custo do espetáculo.");


		

	
	

	}

}
