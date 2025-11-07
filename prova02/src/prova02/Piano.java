package prova02;

public class Piano extends Instrumento {

	private String nome;

	@Override
	public void tocar() {
		System.out.println("Som de piano");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
