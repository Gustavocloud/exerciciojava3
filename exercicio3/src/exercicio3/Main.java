package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         Scanner sc = new Scanner (System.in);
         
         int numero;
         
         System.out.println("Digite um numero");
         numero = sc.nextInt();
         
         //temos que calcular o resto da divisão por 2, se o resto for diferente de 0 da ímpar!
         if (numero % 2 !=0) {
        	 
        	 System.out.println("Seu numero é ímpar");
         }
         else
        	 System.out.println("Seu numero é par");
	}
        
  
}
