package atividade02;

public class Cachorro extends Animal {

	private String raca;
	
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Latido! (AU)");
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "ração";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
