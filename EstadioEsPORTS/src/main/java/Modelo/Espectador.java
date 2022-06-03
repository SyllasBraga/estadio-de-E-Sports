package Modelo;
public class Espectador {
    private int cod_spec;
    private String nome;
    private int idade;
    private String CPF;

    public int getCod_spec() {
        return cod_spec;
    }

    public void setCod_spec(int cod_spec) {
        this.cod_spec = cod_spec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
