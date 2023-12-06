package Atividades_luana_cassamasso;

public class Brinquedo {
//atributos 
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	public int peso;
	
	//metodo const
	public Brinquedo() {
	}
	 public Brinquedo(String nome, double alturaMinima, int capacidadeMaxima) {
		 this.nome = nome;
		 this.alturaMinima = alturaMinima;
		 this.capacidadeMaxima = capacidadeMaxima;
	 }
	
	//metodo1
	public double getalturaMinima() {
		return alturaMinima;
	}
    public int getCapacidadeMaxima() {
    	return capacidadeMaxima;
    }
	//metodo2
    public double setAlturaMinima(double a) {
        return this.alturaMinima = a;
      }
      public int setCapacidadeMaxima(int c) {
      	return this.capacidadeMaxima = c;
      }
	
	
	//metodos 3
	public void exibirInfo() {
		System.out.println("Nome:" + nome + "altura:" + alturaMinima + "capacidade:" + capacidadeMaxima);
	}
}
