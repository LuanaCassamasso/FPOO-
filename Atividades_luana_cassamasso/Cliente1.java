package Atividades_luana_cassamasso;

public class Cliente1 {

	private String nome;
	private String sobrenome;
	private String email;
	
	public Cliente1(){
	
	}
	
	public Cliente1(String nome, String sobrenome, String email) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
