
public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("Jonis Rubens em Ação");
		l1.setAutor("Leandrão");
		l1.setAnoPublicacao(2025);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("Biblioteca Murilo");
		b1.setLivro(l1);
		
		System.out.println( b1.getNome() + " tem o livro "  + b1.getLivro().getTitulo()   );
		System.out.println( "-".repeat(80) );
		System.out.println(  "O autor é: " + l1.getAutor() + " e foi publicado em: " + l1.getAnoPublicacao()  );
		
		
	}
	
}
