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
@RequestMapping("/api/participante")
public class ParticipanteController {

    @Autowired
    ParticipanteRepository participanterepository;

    @GetMapping
    public List<Participante> listarParticipante() {
        return participanterepository.findAll();
    }

    @PostMapping
    public Participante criarParticipante(@RequestBody Participante participante) {
        return participanterepository.save(participante);
    }

    @DeleteMapping("/{id}")
    public void deletarParticipante(@PathVariable Integer id) {
        participanterepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Participante atualizarParticipante(
            @PathVariable Integer id,
            @RequestBody Participante novoparticipante) {

        Optional<Participante> optionalParticipante = participanterepository.findById(id);

        if (optionalParticipante.isPresent()) {
            Participante participante = optionalParticipante.get();
            participante.setNome(novoparticipante.getNome());
            participante.setCpf(novoparticipante.getCpf());
            participante.setIdade(novoparticipante.getIdade());
            participante.setEvento(novoparticipante.getEvento());

            return participanterepository.save(participante);
        }

        return null;
    }
}

