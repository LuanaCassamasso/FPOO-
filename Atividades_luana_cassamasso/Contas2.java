package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Contas2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe valor disponivel:");
		int v = entrada.nextInt();
		int a = entrada.nextInt();
		int f = entrada.nextInt();
		int p = entrada.nextInt();
		if(v >=(a+f+p )) {
			System.out.println("3");
		} else if (v >= (a + f) || v>=(a + p)) {
			System.out.println("2");
		} else if (v >= a || v >= f || v>= p) {
			System.out.println("1");
		}
		

	}

}
