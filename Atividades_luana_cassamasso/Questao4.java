package Atividades_luana_cassamasso;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o n1:");
        int num1 = entrada.nextInt();
        System.out.println("digite o n2:");
        int num2 = entrada.nextInt();
	    int mmc = calcularMMC(num1,num2);
	    System.out.println("o MMC de" + num1 +"e" + num2 +"e" + mmc);
	}
	    
	    
	//metodo chamado calcularmmc()
	public static int calcularMMC (int num1, int num2) {
		int maior = Math.max(num1, num2);
		int mmc = maior;
		//system.out.println("maximo:" + maior);
		while(true)	{
			if(mmc % num1 == 0 && mmc % num2 ==0) {
		}
       mmc = mmc + maior;
		}
	}
}
