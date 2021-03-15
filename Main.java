/* Dado um número inteiro positivo n, crie um programa em java para imprimir os n
primeiros naturais ímpares. Exemplo: para n=4 a saída deverá ser 1,3,5,7.
Nome do programa: NumerosNaturaisImpares.java */

import java.util.*;

class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean foi = false;

		System.out.print("Olá!\n\n");
		do {
			try{
				System.out.print("Digite um número inteiro positivo: ");
				int numero = sc.nextInt();

				for (int i=0; i<numero; i++) {
					System.out.println(2*i+1);
				}

				foi = true;
			}catch (InputMismatchException erro1) {
				System.out.println("\n\nVocê deve digitar um número inteiro!\n\n");
				sc.nextLine();
			}
		} while (!foi);

  }
}