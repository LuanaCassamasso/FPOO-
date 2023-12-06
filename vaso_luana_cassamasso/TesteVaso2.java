package Atividades_luana_cassamasso;

import java.util.ArrayList;
import java.util.Scanner;

import Aula_2308.Animal1;

public abstract class TesteVaso2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Vaso> vasos = new ArrayList<>();
		for(int i = 0; i < 2; i ++) {
			System.out.println("escolha a cor do vaso:");
			String cor = entrada.next();
			System.out.println("escolha o tamanho do seu vaso:");
			double tamanho = entrada.nextDouble();
			System.out.println("escolha o materia do vaso:");
			String material = entrada.next();
			
			
			System.out.println("Escolher o tipo do vaso: \n" + "1 - decorado\n " + "2 - simples");
			String tipo = entrada.next();
			Vaso vaso2;
			if(tipo.equalsIgnoreCase("1")) {
				vaso2 = new VasoDecotrado(cor);
				System.out.println("escolha a decoracao do vaso");
				String decoracao = entrada.next();
			}else if(tipo.equalsIgnoreCase("2")) {
				vaso2 = new Vaso(cor);
			}
			vasos.add(vaso2);				
		}
		for(Vaso vaso2 : vasos) {
			vaso2.exibir();
				
				
				
				
			}
			
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
