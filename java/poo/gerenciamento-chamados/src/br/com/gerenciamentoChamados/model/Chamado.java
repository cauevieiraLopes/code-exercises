package br.com.gerenciamentoChamados.model;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Chamado {
    private int ID;
    private String titulo, descricao, dataSolicitacao, dataFinalizacao;
    StatusChamado status;

    public Chamado(String titulo, String descricao, int ID) {
        this.ID = ID;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = StatusChamado.ABERTO;

        OffsetDateTime agora = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");

        this.dataSolicitacao = agora.format(formatter);
    }

    public int getID() {
        return ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public String getData() {
        return dataSolicitacao;
    }

    public void setDataFinalizacao(String dataFinalizacao) { this.dataFinalizacao = dataFinalizacao; }

    public String getDataFinalizacao() { return dataFinalizacao; }

    public void setStatus() { this.status = StatusChamado.FINALIZADO; }

    public String getTitulo() {
        return titulo;
    }
}
