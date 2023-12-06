package ComandaDigital_luana_cassamasso;

public class Cliente2 {

	private String nome;
	private double mesa;
	private int telefone;
	
	public 	Cliente2() {
		
	}
    public 	Cliente2(String nome, double mesa, int telefone) {
    	this.nome = nome;
    	this.mesa = mesa;
    	this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMesa() {
		return mesa;
	}

	public void setMesa(double mesa) {
		this.mesa = mesa;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void getExibirInfo() {
		System.out.println("nome" + this.nome);
		System.out.println("numero da mesa" + this.mesa);
		System.out.println("telefone" + this.telefone);
	}
}
