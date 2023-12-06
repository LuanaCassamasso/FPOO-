package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	int soma =0;
	while(true) {
		int num = entrada.nextInt();
		if (num <= 0) {
			break;
		}
		 soma = soma + num;
	}
	System.out.println("resultado da soma:" + soma);
	}

}
