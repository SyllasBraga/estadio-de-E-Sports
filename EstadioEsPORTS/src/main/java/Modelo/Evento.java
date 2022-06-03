package Modelo;

import java.sql.Timestamp;

public class Evento {
    private int cod_evt;
    private String nome_evt;
    private Timestamp data_inicio;
    private double premiacao;
    private boolean exclusivo_arena;
    private Administrador cod_adm;
    private Jogo cod_jogo;

    public int getCod_evt() {
        return cod_evt;
    }

    public void setCod_evt(int cod_evt) {
        this.cod_evt = cod_evt;
    }

    public String getNome_evt() {
        return nome_evt;
    }

    public void setNome_evt(String nome_evt) {
        this.nome_evt = nome_evt;
    }

    public Timestamp getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Timestamp data_inicio) {
        this.data_inicio = data_inicio;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }

    public boolean isExclusivo_arena() {
        return exclusivo_arena;
    }

    public void setExclusivo_arena(boolean exclusivo_arena) {
        this.exclusivo_arena = exclusivo_arena;
    }

    public Administrador getCod_adm() {
        return cod_adm;
    }

    public void setCod_adm(Administrador cod_adm) {
        this.cod_adm = cod_adm;
    }

    public Jogo getCod_jogo() {
        return cod_jogo;
    }

    public void setCod_jogo(Jogo cod_jogo) {
        this.cod_jogo = cod_jogo;
    }
}
