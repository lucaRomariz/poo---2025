package br.edu.ceub.sistema_eventos_poo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idparticipante;

    private String nome;
    private String cpf;
    private String idade;

    @ManyToOne
    @JoinColumn(name = "evento_idevento")
    private Evento evento;

	public Integer getIdparticipante() {
		return idparticipante;
	}

	public void setIdparticipante(Integer idparticipante) {
		this.idparticipante = idparticipante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

    
}