package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int operacoes;
		int operacao = 1;
		do {
			exibirMenu();    
			operacoes = entrada.nextInt();
			int valor1;
			int valor2;
			switch(operacoes) {
			case 1:
				 System.out.println("multiplicacao selecionada");
				 valor1 = entrada.nextInt();
				 valor2 = entrada.nextInt();
				 System.out.println("o resultado e:");
				 System.out.println(valor1 * valor2);
				 break;
			case 2:
				 System.out.println("divisao selecionada");
				 valor1 = entrada.nextInt();
				 valor2 = entrada.nextInt();
				 System.out.println("o resultado e:");
				 System.out.println(valor1 / valor2);
				 break;
			case 3:
				 System.out.println("subtracao selecionada");
				 valor1 = entrada.nextInt();
				 valor2 = entrada.nextInt();
				 System.out.println("o resultado e:");
				 System.out.println(valor1 - valor2);
				 break;
			case 4:
				 System.out.println("adicao selecionada");
				 valor1 = entrada.nextInt();
				 valor2 = entrada.nextInt();
				 System.out.println("o resultado e:");
				 System.out.println(valor1 + valor2);
				 break;
				 default:
					 System.out.println("");
					 break;
			}
			 System.out.println();
			 
		}while(operacao != 0);	
		
	}   //fim main
	

		public static void exibirMenu() {
			System.out.println("Selecione uma opcao");
			System.out.println("1 - multiplicacao");
			System.out.println("2 - divisao");
			System.out.println("3 - subtracao ");
			System.out.println("4 - adicao");
			System.out.println("0 - SAIR");
			
			
			}
					
		}  
    //fim classe
