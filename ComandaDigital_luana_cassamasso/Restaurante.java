package ComandaDigital_luana_cassamasso;

public class Restaurante {
	
	public String nome;
	public String endereco;
	public String itens;
	public Cliente2 cliente2;
	
	
	public Restaurante() {
		
	}
	public Restaurante(String nome, String endereco, String itens) {
		this.nome = nome;
		this.endereco = endereco;
		this.itens = itens;
	}
 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
    }
	public String getItens() {
		return itens;
	}
	public void setItens(String itens) {
		this.itens = itens;
	}
	
	
	
	
	
	
	
	
	
	}
