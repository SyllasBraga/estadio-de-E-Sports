package Modelo;
public class Jogo {
    private int cod_jogo;
    private Administrador cod_adm;
    private Plataforma cod_plataforma;
    private Genero cod_genero;
    private String nome_jogo;

    public int getCod_jogo() {
        return cod_jogo;
    }

    public void setCod_jogo(int cod_jogo) {
        this.cod_jogo = cod_jogo;
    }

    public Administrador getCod_adm() {
        return cod_adm;
    }

    public void setCod_adm(Administrador cod_adm) {
        this.cod_adm = cod_adm;
    }

    public Plataforma getCod_plataforma() {
        return cod_plataforma;
    }

    public void setCod_plataforma(Plataforma cod_plataforma) {
        this.cod_plataforma = cod_plataforma;
    }

    public Genero getCod_genero() {
        return cod_genero;
    }

    public void setCod_genero(Genero cod_genero) {
        this.cod_genero = cod_genero;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }
}
