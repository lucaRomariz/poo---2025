
public class Material {

	public String titulo;
	public String dataPublicacao;
	public String autor;
	
	public String emprestar() {
		return "Foi emprestado!";
	}
	
	public void devolver() {
		System.out.println("Foi devolvido!");
	}
	
}
