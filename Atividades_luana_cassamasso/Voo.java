package Atividades_luana_cassamasso;

import java.time.LocalDate;

public class Voo {

	private String numeroVoo;
	private  String origem;
	private String destino;
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	
	public Voo() {
		
	}
	
	public Voo(String numeroVoo, String origem,String destino,double preco,LocalDate dataIda, LocalDate dataVolta) {
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getNumeroVoo() {
		return numeroVoo;
}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getOrigem() {
		return origem;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDestino() {
		return destino;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataIda() {
		return dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	
  //public void mostrarDetalhes
	
}
