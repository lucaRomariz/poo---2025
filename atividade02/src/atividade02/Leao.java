package atividade02;

public class Leao extends Animal {

	private double tamanhoJuba;
	
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Rugido!");
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "Carne";
	}

	public double getTamanhoJuba() {
		return tamanhoJuba;
	}

	public void setTamanhoJuba(double tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}

	
	
}
