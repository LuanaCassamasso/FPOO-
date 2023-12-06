package AdoçaoPet_luana_cassamasso;

public class Peixe extends animal{
	public Peixe() {
		super();
	}
	public Peixe(String especie,int idade, float peso, String nome, char sexo ) {
		super.setEspecie(especie);
		super.setIdade(idade);
		super.setNome(nome);
		super.setPeso(peso);
		super.setSexo(sexo);
		
		
	}
}
