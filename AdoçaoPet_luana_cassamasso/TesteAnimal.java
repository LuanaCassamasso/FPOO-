package AdoçaoPet_luana_cassamasso;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Tutor tu1 = new Tutor ();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("nome do tutor:");
		tu1.setNome(entrada.next());
		System.out.println("idade do tutor:");
		tu1.setIdade(entrada.nextInt());
		System.out.println("telefone:");
		tu1.setTelefone(entrada.nextDouble());
		System.out.println("CPF:");
		tu1.setCPF(entrada.nextDouble());
		System.out.println("email:");
		tu1.setEmail(entrada.next());
		System.out.println("endereco do tutor:");
		tu1.setEndereco(entrada.next());
		
		
		System.out.println("ANIMAIS PARA ADOCAO:");
		Coelho c1 = new Coelho(" australiano", 1, 1,"ligerinho", 'm' );
		Gato g1 = new Gato(" persa", 1, 2, "mussulango", 'm');
		Cao ca1 = new Cao(" golden", 1, 2, "fofinha", 'f' );
		Peixe p1 = new Peixe(" tilapia", 1, 3, "nemo", 'm' );
		
		System.out.println("Coelho:" + c1.getEspecie() + "  " + c1.getIdade() + "  " + c1.getPeso()  + "  " + c1.getNome()+ "  " + c1.getSexo());
		System.out.println("Gato:" + g1.getEspecie() + "  " + g1.getIdade() + "  " + g1.getPeso()  + "  " + g1.getNome()+ "  " + g1.getSexo());
		System.out.println("Cao:" + ca1.getEspecie() + "  " + ca1.getIdade() + "  " + ca1.getPeso()  + "  " + ca1.getNome()+ "  " + ca1.getSexo());
		System.out.println("Peixe:" + p1.getEspecie() + "  " + p1.getIdade() + "  " + p1.getPeso()  + "  " + p1.getNome()+ "  " + p1.getSexo());
		
		
		System.out.println("-------------------------");
		System.out.println("QUAL ANIMAL VOCE QUER ADOTAR?");
		tu1.setNome(entrada.next());
		
		Contrato con1 = new Contrato();
		System.out.println("Assine o contrato (nome completo)");
		tu1.setNome(entrada.next());
		System.out.println(" numero do contrato e: ");
		con1.setNumeroContrato(entrada.nextInt());
		
		System.out.println("**********************************");
		System.out.println("PARABENS VOCE ACABOU DE ADOTAR!!!!!");
	}
}
