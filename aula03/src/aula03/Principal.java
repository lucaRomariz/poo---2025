package aula03;

public class Principal {

	public static void main(String[] args) {
		
		PF pf1 = new PF();
		pf1.cpf = "00000000000";
		pf1.dataNascimento = "20/04/2000";
		pf1.nome = "Arthur Neiva";
		pf1.telefone = "999999999";
		pf1.endereco = "Esquina";
		
		System.out.println("Sua casa é na " + pf1.endereco);
		
	}
	
}
