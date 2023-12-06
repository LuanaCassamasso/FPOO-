package Atividades_luana_cassamasso;

public class VasoDecorado extends Vaso{

	private String decoracao;
	
	VasoDecorado() {
		System.out.println("o vaso está sendo fabricado");
	}
	
	public VasoDecorado (String decoracao) {
		this.decoracao = decoracao;
	}
	//metodos
	public String getDecoracao() {
		  return decoracao; 
	}
		public void setDecoracao(String decoracao) {
			this.decoracao = decoracao;
		}
		
		public void exibir() {
			System.out.println(super.getCor());
			System.out.println(super.getMaterial());
			System.out.println(super.getTamanho());
			System.out.println(this.getDecoracao());
		}
}
