package aula04;

public class Revista {
	
	private String titulo;
	private String autor;
	public String editora;

	public String getTitulo() {
		return this.titulo.toUpperCase();
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
