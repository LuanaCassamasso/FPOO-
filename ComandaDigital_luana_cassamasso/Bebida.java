package ComandaDigital_luana_cassamasso;

public class Bebida extends Produto{

	public String tipoBebidas;
	public double precoBebidas;
	
	public Bebida() {
		super();
	}
     public Bebida (String bebidas, double precoBebidas) {
    	 super();
		this.tipoBebidas = bebidas;
		this.precoBebidas = precoBebidas;
	}
     public String getBebidas() {
 		return tipoBebidas;
 	}

 	public void setBebidas(String bebidas) {
 		this.tipoBebidas = bebidas;
 	}

 	public double getPrecoBebidas() {
 		return precoBebidas;
 	}

 	public void setPrecoBebidas(double precoBebidas) {
 		this.precoBebidas = precoBebidas;
 	}
	
}
