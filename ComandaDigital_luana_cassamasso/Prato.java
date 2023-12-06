package ComandaDigital_luana_cassamasso;

public class Prato extends Produto{

	public String tipoPratos;
	public double precoPratos;
	
	public Prato() {
		super();
	}

     public Prato(String pratos, double precoPratos) {
    	super();
		this.tipoPratos= pratos;
		this.precoPratos = precoPratos;
	}
     public String getPratos() {
 		return tipoPratos;
 	}

 	public void setPratos(String pratos) {
 		this.tipoPratos = pratos;
 	}

 	public double getPrecoPratos() {
 		return precoPratos;
 	}

 	public void setPrecoPratos(double precoPratos) {
 		this.precoPratos = precoPratos;
 	}
	
 	
	
	
	
}
