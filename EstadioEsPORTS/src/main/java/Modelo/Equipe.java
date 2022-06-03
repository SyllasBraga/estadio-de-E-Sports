package Modelo;

import java.sql.Timestamp;

public class Equipe {
    private int cod_equipe;
    private Timestamp data_criacao;
    private ADM_de_equipe cod_adm_eqp;
    private Jogo cod_jogo;
    private String nome_eqp;

    public int getCod_equipe() {
        return cod_equipe;
    }

    public void setCod_equipe(int cod_equipe) {
        this.cod_equipe = cod_equipe;
    }

    public Timestamp getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Timestamp data_criacao) {
        this.data_criacao = data_criacao;
    }

    public ADM_de_equipe getCod_adm_eqp() {
        return cod_adm_eqp;
    }

    public void setCod_adm_eqp(ADM_de_equipe cod_adm_eqp) {
        this.cod_adm_eqp = cod_adm_eqp;
    }

    public Jogo getCod_jogo() {
        return cod_jogo;
    }

    public void setCod_jogo(Jogo cod_jogo) {
        this.cod_jogo = cod_jogo;
    }

    public String getNome_eqp() {
        return nome_eqp;
    }

    public void setNome_eqp(String nome_eqp) {
        this.nome_eqp = nome_eqp;
    }
}
