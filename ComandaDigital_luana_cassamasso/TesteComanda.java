package ComandaDigital_luana_cassamasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteComanda {
	
	public static void main(String[] args) {
		Cliente2 cli1 = new Cliente2();
		Cliente2 cli2 = new Cliente2();
		Cliente2 cli3 = new Cliente2();
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome cli1:");
	    cli1.setNome(entrada.next());
		System.out.println("numero da mesa:");
		cli1.setMesa(entrada.nextDouble()); 
		System.out.println("telefone:");
		cli1.setTelefone(entrada.nextInt());
		
	
		
		System.out.println("Gostaria de ver o cardapio de pratos? (sim ou nao)");
		cli1.setNome(entrada.next());  
		
		
		Prato p1 = new Prato("macarrao", 30.00);
		Prato p2 = new Prato("panqueca", 20.00);
		Prato p3 = new Prato("Risoto", 40.00);
		Prato p4 = new Prato("PF caseiro", 15.00);
		Prato p5 = new Prato("Lasanha", 25.00);
		
		System.out.println("Prato 1: " + p1.getPratos()+ " " + p1.getPrecoPratos());
		System.out.println("Prato 2:" + p2.getPratos()+ " " + p2.getPrecoPratos());
		System.out.println("Prato 3:" + p3.getPratos()+ " " + p3.getPrecoPratos());
		System.out.println("Prato 4:" + p4.getPratos()+ " " + p4.getPrecoPratos());
		System.out.println("Prato 5:" + p5.getPratos()+ " " + p5.getPrecoPratos());
		

		
		System.out.println("__________________");
		System.out.println("Qual o prato escolhido?");
		cli1.setNome(entrada.next());
		System.out.println("__________________");
		
		
		System.out.println("gostaria de ver as bebidas?  (sim ou nao)");
		cli1.setNome(entrada.next());
		
		Bebida b1 = new Bebida("Refrigerante", 6.00);
		Bebida b2 = new Bebida("Suco de laranja", 8.00);
		Bebida b3 = new Bebida("Agua", 4.00);
		
		System.out.println("Bebida 1: " + b1.getBebidas()+ " " + b1.getPrecoBebidas());
		System.out.println("Bebida 2:" + b2.getBebidas()+ " " + b2.getPrecoBebidas());
		System.out.println("Bebida 3:" + b3.getBebidas()+ " " + b3.getPrecoBebidas());
		
		
		System.out.println("__________________________");
		System.out.println("Qual o bebida escolhida?");
		cli1.setNome(entrada.next());
		
		System.out.println("__________________");
		System.out.println("gostaria de ver as sobremesas?  (sim ou nao)");
		cli1.setNome(entrada.next());
		
		Sobremesa s1 = new Sobremesa("Sorvete", 8.00);
		Sobremesa s2 = new Sobremesa("Pudim", 11.00);
		Sobremesa s3 = new Sobremesa("Merengue", 15.00);
		
		System.out.println("Sobremesa 1: " + s1.getSobremesa()+ " " + s1.getPrecoSobremesa());
		System.out.println("Sobremesa 2:" + s2.getSobremesa()+ " " + s2.getPrecoSobremesa());
		System.out.println("Sobremesa 3:" + s3.getSobremesa()+ " " + s3.getPrecoSobremesa());
		
		System.out.println("____________________________");
		System.out.println("Qual a sobremesa escolhida?");
		cli1.setNome(entrada.next());
		
		System.out.println("----------PAGAMENTO----------");
		cli1.setNome(entrada.next());
		System.out.println("Quais foram os itens comprados?");
		cli1.setNome(entrada.next());
		System.out.println("----------TOTAL DA COMPRA----------");
		System.out.println("......55,00$.......confirma?");
		cli1.setNome(entrada.next());
		System.out.println("Qual a forma de pagamento");
		cli1.setNome(entrada.next());
		System.out.println("PAGANDO.....");
		System.out.println("----------PAGO cliente 1 ----------");
		
		System.out.println("____________________________________");
		System.out.println("Nome cli2:");
	    cli2.setNome(entrada.next());
		System.out.println("numero da mesa:");
		cli2.setMesa(entrada.nextDouble()); 
		System.out.println("telefone:");
		cli2.setTelefone(entrada.nextInt());
		
		
		System.out.println("Gostaria de ver o cardapio de pratos?  (sim ou nao)");
		cli2.setNome(entrada.next());
		

		
		System.out.println("Prato 1: " + p1.getPratos()+ " " + p1.getPrecoPratos());
		System.out.println("Prato 2:" + p2.getPratos()+ " " + p2.getPrecoPratos());
		System.out.println("Prato 3:" + p3.getPratos()+ " " + p3.getPrecoPratos());
		System.out.println("Prato 4:" + p4.getPratos()+ " " + p4.getPrecoPratos());
		System.out.println("Prato 5:" + p5.getPratos()+ " " + p5.getPrecoPratos());
		
		
		System.out.println("__________________");
		System.out.println("Qual o prato escolhido?");
		cli2.setNome(entrada.next());
		System.out.println("__________________");
		
		
		System.out.println("gostaria de ver as bebidas?  (sim ou nao)");
		cli2.setNome(entrada.next());
		
		
		
		System.out.println("Bebida 1: " + b1.getBebidas()+ " " + b1.getPrecoBebidas());
		System.out.println("Bebida 2:" + b2.getBebidas()+ " " + b2.getPrecoBebidas());
		System.out.println("Bebida 3:" + b3.getBebidas()+ " " + b3.getPrecoBebidas());
		
		
		System.out.println("__________________________");
		System.out.println("Qual o bebida escolhida?");
		cli2.setNome(entrada.next());
		
		System.out.println("__________________");
		System.out.println("gostaria de ver as sobremesas? (sim ou nao)");
		cli2.setNome(entrada.next());
		
		
		
		System.out.println("Sobremesa 1: " + s1.getSobremesa()+ " " + s1.getPrecoSobremesa());
		System.out.println("Sobremesa 2:" + s2.getSobremesa()+ " " + s2.getPrecoSobremesa());
		System.out.println("Sobremesa 3:" + s3.getSobremesa()+ " " + s3.getPrecoSobremesa());
		
		System.out.println("____________________________");
		System.out.println("Qual a sobremesa escolhida?");
		cli2.setNome(entrada.next());
		
		
		System.out.println("----------PAGAMENTO----------");
		cli2.setNome(entrada.next());
		System.out.println("Quais foram os itens comprados?");
		cli2.setNome(entrada.next());
		System.out.println("----------TOTAL DA COMPRA----------");
		System.out.println("......42,00$.......confirma?");
		cli2.setNome(entrada.next());
		System.out.println("Qual a forma de pagamento");
		cli2.setNome(entrada.next());
		System.out.println("PAGANDO.....");
		System.out.println("----------PAGO cliente 2 ----------");
		
		System.out.println("____________________________________");
		System.out.println("Nome cli3:");
	    cli3.setNome(entrada.next());
		System.out.println("numero da mesa:");
		cli3.setMesa(entrada.nextDouble()); 
		System.out.println("telefone:");
		cli3.setTelefone(entrada.nextInt());
		
		
		System.out.println("Gostaria de ver o cardapio de pratos?  (sim ou nao)");
		cli3.setNome(entrada.next());
		

		
		System.out.println("Prato 1: " + p1.getPratos()+ " " + p1.getPrecoPratos());
		System.out.println("Prato 2:" + p2.getPratos()+ " " + p2.getPrecoPratos());
		System.out.println("Prato 3:" + p3.getPratos()+ " " + p3.getPrecoPratos());
		System.out.println("Prato 4:" + p4.getPratos()+ " " + p4.getPrecoPratos());
		System.out.println("Prato 5:" + p5.getPratos()+ " " + p5.getPrecoPratos());
		
		
		System.out.println("__________________");
		System.out.println("Qual o prato escolhido?");
		cli3.setNome(entrada.next());
		System.out.println("__________________");
		
		
		System.out.println("gostaria de ver as bebidas?  (sim ou nao)");
		cli3.setNome(entrada.next());
		
		
		
		System.out.println("Bebida 1: " + b1.getBebidas()+ " " + b1.getPrecoBebidas());
		System.out.println("Bebida 2:" + b2.getBebidas()+ " " + b2.getPrecoBebidas());
		System.out.println("Bebida 3:" + b3.getBebidas()+ " " + b3.getPrecoBebidas());
		
		
		System.out.println("__________________________");
		System.out.println("Qual o bebida escolhida?");
		cli3.setNome(entrada.next());
		
		System.out.println("__________________");
		System.out.println("gostaria de ver as sobremesas?  (sim ou nao)");
		cli3.setNome(entrada.next());
		
		
		
		System.out.println("Sobremesa 1: " + s1.getSobremesa()+ " " + s1.getPrecoSobremesa());
		System.out.println("Sobremesa 2:" + s2.getSobremesa()+ " " + s2.getPrecoSobremesa());
		System.out.println("Sobremesa 3:" + s3.getSobremesa()+ " " + s3.getPrecoSobremesa());
		
		System.out.println("____________________________");
		System.out.println("Qual a sobremesa escolhida?");
		cli3.setNome(entrada.next());
		
		System.out.println("----------PAGAMENTO----------");
		cli3.setNome(entrada.next());
		System.out.println("Quais foram os itens comprados?");
		cli3.setNome(entrada.next());
		System.out.println("----------TOTAL DA COMPRA----------");
		System.out.println("......39,00$.......confirma?");
		cli3.setNome(entrada.next());
		System.out.println("Qual a forma de pagamento");
		cli3.setNome(entrada.next());
		System.out.println("PAGANDO.....");
		System.out.println("----------PAGO cliente 3 ----------");
		
		List<Cliente2> lista_cliente = new ArrayList<Cliente2>();
		lista_cliente.add(cli1);
		lista_cliente.add(cli2);
		lista_cliente.add(cli3);
		for(Cliente2 olho : lista_cliente) {
			System.out.println("info dos clientes: " + olho.getNome() + " " + olho.getTelefone());
		}
	}

}
