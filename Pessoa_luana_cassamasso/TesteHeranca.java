package Aula_2108;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno a1 = new Aluno();
		a1.setNome("luana");
		System.out.println("nome" + a1.getNome());
		
		System.out.println("nota:");
		a1.setNota(entrada.nextFloat());
		System.out.println("nota1:");
		a1.setNota1(entrada.nextFloat());
		a1.calcularMedia();
		System.out.println("media:" + a1.media);
	}

}
