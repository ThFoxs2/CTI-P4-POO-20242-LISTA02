package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double sal, novo_sal, boni, aux;
		System.out.println("INSIRA O SALÁRIO");
		sal = sc.nextDouble();
		if (sal <= 500) {
			boni = sal*5/100;
			
		} else if (sal <= 1200) {
			
			boni = sal*12/100;
			
		} else {
			boni = 0;
		}
		
		if (sal <= 600) {
			aux = 150;
		} else {
			aux = 100;
		}
		
		novo_sal = sal + boni + aux;
		System.out.println("O novo salário é " + novo_sal);

		
		
		
	}

}
