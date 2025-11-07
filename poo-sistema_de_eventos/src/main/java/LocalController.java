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
	LocalRepository localRepository;
	
	@GetMapping
	public List<Local>listarLocais(){
		return localRepository.findAll();
	}
	
	@PostMapping
	public Local criarLocal(@RequestBody Local local) {
		return localRepository.save(local);
	}
	
	@DeleteMapping("/{id}")
	public void deletarLocal(@PathVariable Long id) {
		localRepository.deleteById(id);
		
	}
	
	@PutMapping("/{id}")
	public Local atualizarLocal(@PathVariable Long id, @RequestBody Local novoLocal) {
		Optional<Local> optionalLocal = localRepository.findById(id);
		if (optionalLocal.isPresent()) {
			Local local = optionalLocal.get();
			local.setNome(novoLocal.getNome());
			local.setEndereco(novoLocal.getEndereco());
			local.setEndereco(novoLocal.getEndereco());
		}
		return null;
	}
	
}
