package Modelo;
public class Administrador {
    private int cod_adm;
    private String nome_ADM;
    private int idade;
    private double salario;
    
    public int getCod_adm() {
        return cod_adm;
    }

    public void setCod_adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }

    public String getNome_ADM() {
        return nome_ADM;
    }

    public void setNome_ADM(String nome_ADM) {
        this.nome_ADM = nome_ADM;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
