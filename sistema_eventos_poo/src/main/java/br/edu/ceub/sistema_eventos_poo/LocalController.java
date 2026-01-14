package br.edu.ceub.sistema_eventos_poo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/local")
public class LocalController {

	@Autowired
	LocalRepository localrepository;
	
	@GetMapping
	public List<Local> listarLocal(){
		return localrepository.findAll();
	}
	
	@PostMapping
	public Local criarLocal(@RequestBody Local local) {
		return localrepository.save(local);
	}
	
	@DeleteMapping("/{id}")
	public void deletarLocal(@PathVariable Integer id) {
		localrepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Local atualizarLocal(@PathVariable Integer id, @RequestBody Local novolocal) {
		Optional<Local>  optionalLocal = localrepository.findById(id);
		if(optionalLocal.isPresent()) {
			Local local = optionalLocal.get();
			local.setNome(novolocal.getNome());
			local.setCep(novolocal.getCep());
			local.setCapacidade(novolocal.getCapacidade());
			return localrepository.save(local);
		}
		return null;
	}
	
	
	
}
