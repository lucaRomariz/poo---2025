package aula02;

public class Principal {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.marca = "Honda";
		c1.modelo = "Civic";
		c1.preco = 120000;
		c1.potencia = 184;
	
		System.out.println(c1.modelo);
		c1.acelerar();
		
		
	}
	
}
