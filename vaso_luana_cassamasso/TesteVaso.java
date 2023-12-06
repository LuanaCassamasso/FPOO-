package Atividades_luana_cassamasso;

import java.util.Scanner;

public class TesteVaso  {
	public static void main(String[] args) {
		
	//instanciar o obj
		Vaso vs1 = new Vaso();
		Scanner entrada = new Scanner(System.in);
		System.out.println("qual a cor?");
		String cor = entrada.nextLine();
		vs1.setCor(cor);
		System.out.println("qual o tamanho?");
		double tamanho = entrada.nextDouble();
		vs1.setTamanho(tamanho);
		System.out.println("qual o material?");
		String  material = entrada.next();
		vs1.setMaterial(material);
		
		
		Vaso vs2 = new Vaso();
		System.out.println("qual a cor?");
		String cor2 = entrada.next();
		vs2.setCor(cor2);
		System.out.println("qual o tamanho?");
		double tamanho2 = entrada.nextDouble();
		vs2.setTamanho(tamanho2);
		System.out.println("qual o material?");
		String  material2 = entrada.next();
		vs2.setMaterial(material2);
		
		
		
			
		VasoDecorado vd1 = new VasoDecorado();
		System.out.println("qual a decoracao?");
		String Decoracao = entrada.next();
		vd1.setDecoracao(Decoracao);
		System.out.println("qual a cor?");
		String cor3 = entrada.next();
		vd1.setCor(cor3);
		System.out.println("qual o tamanho?");
		double tamanho3 = entrada.nextDouble();
		vd1.setTamanho(tamanho3);
		System.out.println("qual o material?");
		String  material3 = entrada.next();
		vd1.setMaterial(material3);
		
		
		VasoDecorado vd2 = new VasoDecorado();
		System.out.println("qual a decoracao?");
		String Decoracao2 = entrada.next();
		vd2.setDecoracao(Decoracao2);
		System.out.println("qual a cor?");
		String cor4 = entrada.next();
		vd2.setCor(cor4);
		System.out.println("qual o tamanho?");
		double tamanho4 = entrada.nextDouble();
		vd2.setTamanho(tamanho4);
		System.out.println("qual o material?");
		String  material4 = entrada.next();
		vd2.setMaterial(material4);
		
		System.out.println("");
		vs2.exibir();
		System.out.println("");
		vs1.exibir();
		System.out.println("");
		vd1.exibir();
		System.out.println("");
		vd2.exibir();
	}
}
