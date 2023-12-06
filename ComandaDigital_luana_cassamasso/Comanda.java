
]package ComandaDigital_luana_cassamasso;

public class Comanda {

	private String itensComprados;
    private double precoTotal;
    private String formaDePagamento;
    
    public Comanda() {
    	
    }
	public Comanda(String itensComprados,double precoTotal,String formaDePagamento ) {
		this.itensComprados = itensComprados;
		this.precoTotal = precoTotal;
		this.formaDePagamento = formaDePagamento;
	}
    
	public String getItensComprados() {
		return itensComprados;
	}

	public void setItensComprados(String itensComprados) {
		this.itensComprados = itensComprados;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public void getExibirInfo() {
		System.out.println("itens comprados" + this.itensComprados);
		System.out.println("preco total" + this.precoTotal);
		System.out.println("forma de pagamento" + this.formaDePagamento);
}
}
