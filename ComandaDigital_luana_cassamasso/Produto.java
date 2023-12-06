package ComandaDigital_luana_cassamasso;

public class Produto {

	private String nome;
	private double preco;
	private String categoria;
	
	public Produto() {
		
	}
     public Produto(String nome, double preco,String categoria) {
		this.categoria = categoria;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
