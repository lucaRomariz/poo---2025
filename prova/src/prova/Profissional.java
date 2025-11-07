package prova;

public class Profissional extends Pessoa {

	private int idProfissional;
	private String especialidade;
	private String RegistroConselho;
	
	public void realizarAtendimento() {
		
	}

	public int getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(int idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getRegistroConselho() {
		return RegistroConselho;
	}

	public void setRegistroConselho(String registroConselho) {
		RegistroConselho = registroConselho;
	}
	
	
}
