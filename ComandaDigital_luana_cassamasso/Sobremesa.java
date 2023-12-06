package ComandaDigital_luana_cassamasso;

public class Sobremesa extends Produto {
	
	public String tipoSobremesa;
	public double precoSobremesa;
	
	public Sobremesa() {
		super();
	}
     public Sobremesa (String sobremesa, double precoSobremesa) {
    	super();
		this.tipoSobremesa = sobremesa;
		this.precoSobremesa = precoSobremesa;
	}
     public String getSobremesa() {
 		return tipoSobremesa;
 	}

 	public void setSobremesa(String sobremesa) {
 		this.tipoSobremesa = sobremesa;
 	}

 	public double getPrecoSobremesa() {
 		return precoSobremesa;
 	}

 	public void setPrecoSobremesa(double precoSobremesa) {
 		this.precoSobremesa = precoSobremesa;
 	}

}
