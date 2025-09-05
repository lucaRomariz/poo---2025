package atividade02;

public class Gato extends Animal {
	
	private String cor;

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Miau!");
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "Ração de gato";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
