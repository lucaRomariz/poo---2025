package prova;

public class Pessoa {

	private String nome;
	private String CPF;
	private String DataNascimento;
	
	public void calcularIdade(int idade) {
		System.out.println(idade + "essa é sua idade");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
}
