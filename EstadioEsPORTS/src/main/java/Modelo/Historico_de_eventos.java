package Modelo;
public class Historico_de_eventos {
    private int cod_histo;
    private Evento cod_evt;
    private Equipe equipe_vcdr;

    public int getCod_histo() {
        return cod_histo;
    }

    public void setCod_histo(int cod_histo) {
        this.cod_histo = cod_histo;
    }

    public Evento getCod_evt() {
        return cod_evt;
    }

    public void setCod_evt(Evento cod_evt) {
        this.cod_evt = cod_evt;
    }

    public Equipe getEquipe_vcdr() {
        return equipe_vcdr;
    }

    public void setEquipe_vcdr(Equipe equipe_vcdr) {
        this.equipe_vcdr = equipe_vcdr;
    }
}
