package Modelo;

import java.sql.Timestamp;

public class Lista_ingressos {
    private int cod_lista;
    private Timestamp data;
    private Espectador cod_spec;
    private Double ValorTotal;

    public int getCod_lista() {
        return cod_lista;
    }

    public void setCod_lista(int cod_lista) {
        this.cod_lista = cod_lista;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Espectador getCod_spec() {
        return cod_spec;
    }

    public void setCod_spec(Espectador cod_spec) {
        this.cod_spec = cod_spec;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
}
