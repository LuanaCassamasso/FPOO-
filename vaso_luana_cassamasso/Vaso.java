package Atividades_luana_cassamasso;

public class Vaso {
//atributos 
	private String cor;
	private double tamanho;
	private String material;
	
	//met.construtor
	Vaso() {
		System.out.println("Qual é o seu vaso??");
	}
	
	public Vaso(String cor, double tamanho, String material ) {
			this.cor = cor;
			this.tamanho = tamanho;
			this.material = material;
	}
	
	//metodos 
	public String getCor() {
	  return cor; 
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		  return tamanho; 
		}
    public void setTamanho(double tamanho) {
      this.tamanho = tamanho;
		}

      public String getMaterial() {
	  return material; 
	}
	 public void setMaterial(String material) {
		this.material = material;
	}
	 public void exibir() {
			System.out.println(this.getCor() + "  " + this.getTamanho() +"   " +this.getMaterial());
		}
}
