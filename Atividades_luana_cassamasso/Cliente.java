package Atividades_luana_cassamasso;

public class Cliente {

	//atributo
	public double cpf;
	public String nome;
	public int telefone;
	public int idade;
	public float altura;
	public float peso;
	

	//met
		public void calcularIMC(float peso , float altura) {
			float resultado = 0f;
			resultado = peso / (altura * altura);
			if (resultado < 185) {                                      
				System.out.println("magreza");
			}else if (resultado > 18.5 && resultado < 20.9) {
				System.out.println("normal");
			}else if (resultado > 21 && resultado < 29.9) {
				System.out.println("sobrepeso");
				
				
		}
	}
	
		//metodo2
		
}

