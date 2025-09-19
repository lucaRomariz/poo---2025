
public class Computador {

	private Processador processador;
	private MemoriaRam memoriaram;
	
	public Computador(Processador p, MemoriaRam m) {
		this.memoriaram = m;
		this.processador = p;
	}
	
	public void exibirDetalhes() {
		System.out.println("Detalhes do processador:");
		System.out.println("marca do processador: " + this.processador.getMarca());
		System.out.println("frequencia do processador: " + this.processador.getFrequencia());
		System.out.println("~".repeat(80));
		System.out.println("Detalhes da memória Ram");
		System.out.println("capacidade Memória Ram: " + this.memoriaram.getCapacidade());
		System.out.println("tipo de Memória Ram: " + this.memoriaram.getTipo());
	}
	
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public MemoriaRam getMemoriaram() {
		return memoriaram;
	}
	public void setMemoriaram(MemoriaRam memoriaram) {
		this.memoriaram = memoriaram;
	}
	

	
}
