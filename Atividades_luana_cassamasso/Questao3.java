package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_aleatorio = (int) (Math.random() * 100) + 1;
		System.out.println("numero sorteado foi:" + num_aleatorio);
				int tentativas;
				int contador = 0;
				System.out.println("Start . . .");
				
				do {
					System.out.println("digite um numero de 1 a 30:");
					tentativas = entrada.nextInt();
					contador++;
					if(tentativas < num_aleatorio) {
						System.out.println("digite um maior");
					}else if (tentativas > num_aleatorio) {
						System.out.println("digite um menor");
					}else {
						System.out.println("acertou,parabens!!");
					}
				} while (tentativas != num_aleatorio);
				System.out.println("volte sempre");
						
					}
				}

	