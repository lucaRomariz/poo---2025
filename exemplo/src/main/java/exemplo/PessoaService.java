package exemplo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> listarPessoas(){
		return pessoaRepository.findAll();
	}
	
	
}
