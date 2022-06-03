package Modelo;
public class Itens_da_lista {
    private int itens_lista;
    private Lista_ingressos cod_lista;
    private Ingresso cod_ingresso;
    private int qtd;

    public Lista_ingressos getCod_lista() {
        return cod_lista;
    }

    public void setCod_lista(Lista_ingressos cod_lista) {
        this.cod_lista = cod_lista;
    }

    public Ingresso getCod_ingresso() {
        return cod_ingresso;
    }

    public void setCod_ingresso(Ingresso cod_ingresso) {
        this.cod_ingresso = cod_ingresso;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getItens_lista() {
        return itens_lista;
    }

    public void setItens_lista(int itens_lista) {
        this.itens_lista = itens_lista;
    }
}
