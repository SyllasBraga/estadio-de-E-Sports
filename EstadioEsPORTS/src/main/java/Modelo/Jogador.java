package Modelo;
public class Jogador {
    private int cod_jogador;
    private int idade;
    private Equipe cod_eqp;
    private String CPF;

    public int getCod_jogador() {
        return cod_jogador;
    }

    public void setCod_jogador(int cod_jogador) {
        this.cod_jogador = cod_jogador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Equipe getCod_eqp() {
        return cod_eqp;
    }

    public void setCod_eqp(Equipe cod_eqp) {
        this.cod_eqp = cod_eqp;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
