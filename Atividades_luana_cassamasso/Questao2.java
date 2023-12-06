package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int menor = 0;
		int numero;
		boolean primeiro_numero = true;
		Scanner entrada = new Scanner (System.in);
		while(true) {
			System.out.println("digite numeros positivos e negativos:");
			numero = entrada.nextInt();
			if (numero == 0) {
				break;
			}
			if(primeiro_numero) {
		        menor = numero;
		        primeiro_numero = false;
		        
		       }else if(menor > numero) {
		        menor = numero;
		       }  
		    	   System.out.println("o menor numero digitado foi:" + menor);
		       }
		    	   
		}

}