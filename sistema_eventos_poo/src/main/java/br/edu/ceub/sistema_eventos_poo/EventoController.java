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
@RequestMapping("/api/evento")
public class EventoController {
	
	@Autowired
	EventoRepository eventorepository;
	
	@GetMapping
	public List<Evento> listarevento(){
		return eventorepository.findAll();
	}
	
	@PostMapping
	public Evento criarEvento(@RequestBody Evento evento) {
		return eventorepository.save(evento);
	}

	@DeleteMapping("/{id}")
	public void deletarEvento(@PathVariable Integer id) {
		eventorepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Evento atualizarEvento(@PathVariable Integer id, @RequestBody Evento novoevento) {
		Optional<Evento>  optionalEvento = eventorepository.findById(id);
		if(optionalEvento.isPresent()) {
			Evento evento = optionalEvento.get();
			evento.setNome(novoevento.getNome());
			evento.setDatahorario(novoevento.getDatahorario());
			evento.setInscricoes(novoevento.getInscricoes());
			evento.setLocal(novoevento.getLocal());
			return eventorepository.save(evento);
		}
		return null;
	}
	
}
