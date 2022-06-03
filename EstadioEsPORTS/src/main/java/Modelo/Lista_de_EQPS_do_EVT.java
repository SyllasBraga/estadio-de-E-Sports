package Modelo;
public class Lista_de_EQPS_do_EVT {
    private int cod_lista;
    private Evento cod_evt;
    private Equipe cod_equipe;

    public Evento getCod_evt() {
        return cod_evt;
    }

    public void setCod_evt(Evento cod_evt) {
        this.cod_evt = cod_evt;
    }

    public Equipe getCod_equipe() {
        return cod_equipe;
    }

    public void setCod_equipe(Equipe cod_equipe) {
        this.cod_equipe = cod_equipe;
    }

    public int getCod_lista() {
        return cod_lista;
    }

    public void setCod_lista(int cod_lista) {
        this.cod_lista = cod_lista;
    }
}
