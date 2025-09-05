
public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.titulo = "A descoberta do neiva";
		l1.autor = "Neiva";
		l1.numPaginas = 128;
		
		Tese t1 = new Tese();
		t1.titulo = "A descoberta do JV";
		t1.autor = "João Vitor";
		t1.cursoOrigem = "ADS";
		
		Revista r1 = new Revista();
		r1.edicao = "VEJA! 2024";
		r1.dataPublicacao = "12/12/2012";
		
		System.out.println(l1.titulo + " " + l1.emprestar());
		
	}

}
