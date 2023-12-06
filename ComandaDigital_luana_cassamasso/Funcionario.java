package ComandaDigital_luana_cassamasso;

public class Funcionario {
	
	private String nome;
	private String funcao;
	
	public Funcionario() {
		
	}
     public Funcionario(String nome, String funcao) {
		this.funcao = funcao;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	

}
