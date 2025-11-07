package prova;

public class Principal {
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
        p1.setNome("Jonis Rubens");
        p1.setCPF("123.456.789-00");
        p1.setDataNascimento("2000-05-10");
        p1.setIdPaciente(1);
        p1.setConvenio("Unimed");
        p1.setHistoricoMedico("Sem alergias conhecidas");
        
        Profissional P1 = new Profissional();
        
        P1.setNome("Dra. Ana Souza");
        P1.setCPF("987.654.321-00");
        P1.setDataNascimento("1985-03-22");
        P1.setIdProfissional(101);
        P1.setEspecialidade("Cardiologia");
        P1.setRegistroConselho("CRM-SP 12345");
        
        Tratamento tratamento = new Tratamento();
        tratamento.setIdTratamento(5001);
        tratamento.setDataInicio("2025-10-17");
        tratamento.setStatus("Em andamento");
        tratamento.setPaciente(p1);
        tratamento.setProfissional(P1);
        
        p1.calcularIdade(23);
		
	}
	
}
