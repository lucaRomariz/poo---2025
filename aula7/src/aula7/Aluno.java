package aula7;

public class Aluno {

	private String nome;
	private String ra;
	private Endereco endereco;
	
	public Aluno() {
		
	}
	
	public Aluno(String n, Endereco e1) {
		this.nome = n;
		this.endereco = e1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
