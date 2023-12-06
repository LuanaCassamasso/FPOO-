package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor v:");
		int v = entrada.nextInt();
		System.out.println("digite o valor a");
		int a = entrada.nextInt();
		System.out.println("digite o valor f");
		int f = entrada.nextInt();
		System.out.println("digite o valor p");
		int p = entrada.nextInt();
		
	if ( v >= (a+f+p) ) {
		System.out.println("Joao consegue pagar todas as contas");
	} else if ( v >= (a+f) || v>= (a+p)) {
	    System.out.println("Joao consegue pagar duas conta");
	} else if (v >= a || v > f || v > p) {
	 System.out.println("Joao  consegue uma pagar");
	}
	
	}
}
		
	
	


