package prova;

public class Paciente extends Pessoa {

	private int idPaciente;
	private String Convenio;
	private String historicoMedico;
	
	public void agendarConsulta() {
		
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getConvenio() {
		return Convenio;
	}

	public void setConvenio(String convenio) {
		Convenio = convenio;
	}

	public String getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}	
	
}
