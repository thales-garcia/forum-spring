package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Resposta;

import java.time.LocalDateTime;

public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriação;
    private String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriação = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(LocalDateTime dataCriação) {
        this.dataCriação = dataCriação;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
