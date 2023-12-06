package Aula_2108;

public class Aluno {
//atributos
	private String curso;
	private float nota;
	private float nota1;
	//metodo
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	//metodos especiais 
	public float media;
	public void calcularMedia() {
		media = (nota + nota1) / 2 ;
			
		}
	public void SituacaoFinal() {
		if(media < 7 ) {
			System.out.println("REPROVADO!!!!");
		}else {
			System.out.println("APROVADO!!!!");
		}
	}
}
