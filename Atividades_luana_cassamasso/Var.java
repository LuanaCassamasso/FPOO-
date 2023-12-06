package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int X = entrada.nextInt();
		int Y = entrada.nextInt();
		
		if (X < -8 || X > 8 || Y < 0 || Y > 8) {
			System.out.println("N");
		}else
			System.out.println("S");
	}

}
