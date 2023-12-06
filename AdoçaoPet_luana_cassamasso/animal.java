package AdoçaoPet_luana_cassamasso;

public class animal {

	private String especie;
    private int idade;
    private float peso;
    private String nome;
    private char sexo;
    
    public animal() {
    	
    }
    public animal(String especie, int idade, float peso, String nome, char sexo) {
    this.especie = especie;
    this.idade = idade;
    this.nome = nome;
    this.peso = peso;
    this.sexo = sexo;
    }
	
	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void getExibirInfo() {
		System.out.println();
	}
}
