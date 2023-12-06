package Atividades_luana_cassamasso;

public class Brinquedo2 {
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	public int peso;
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
		
		
		
		//metodos especiais 
		public void exibirInfo() {
        System.out.println("brinquedo:" + nome);
        System.out.println("altura minima"+ alturaMinima);
        System.out.println("capacidade maxima:"+ capacidadeMaxima );
        
		}
	}
}
