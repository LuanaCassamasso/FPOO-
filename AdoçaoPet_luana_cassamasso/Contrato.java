package AdoçaoPet_luana_cassamasso;

public class Contrato {
	
	private int numeroContrato;
	
	public Contrato() {
		
	}
     public Contrato( int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public void getAssineOContrato() {
		System.out.println("assine o contrato (nome completo)");
	}
}
