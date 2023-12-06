package AdoçaoPet_luana_cassamasso;

public class Coelho extends animal{
	public Coelho() {
		super();
	}
	public Coelho(String especie,int idade, float peso, String nome, char sexo ) {
		super.setEspecie(especie);
		super.setIdade(idade);
		super.setNome(nome);
		super.setPeso(peso);
		super.setSexo(sexo);
		
		
	}
}
