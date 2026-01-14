package br.edu.ceub.sistema_eventos_poo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idevento;
    private String nome;
    private LocalDateTime datahorario;
    private String inscricoes;

    @ManyToOne
    @JoinColumn(name = "local_idlocal")
    private Local local;

    public Integer getIdevento() {
        return idevento;
    }

    public void setIdevento (Integer idevento) {
        this.idevento = idevento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDatahorario() {
        return datahorario;
    }

    public void setDatahorario(LocalDateTime datahorario) {
        this.datahorario = datahorario;
    }

    public String getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(String inscricoes) {
        this.inscricoes = inscricoes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
