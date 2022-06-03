package Modelo;
public class Ingresso {
    private int cod_ingresso;
    private double valor;
    private Evento cod_evento;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Evento getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(Evento cod_evento) {
        this.cod_evento = cod_evento;
    }

    public int getCod_ingresso() {
        return cod_ingresso;
    }

    public void setCod_ingresso(int cod_ingresso) {
        this.cod_ingresso = cod_ingresso;
    }
}
