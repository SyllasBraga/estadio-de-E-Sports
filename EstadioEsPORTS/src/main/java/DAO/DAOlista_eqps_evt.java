package DAO;

import Modelo.Lista_de_EQPS_do_EVT;
import Dados.Dados;
import java.util.List;

public class DAOlista_eqps_evt {
    public List<Lista_de_EQPS_do_EVT> getLista(){
        return Dados.ListaLE;
    }
    public void Create (Lista_de_EQPS_do_EVT obj){
        if(obj.getCod_lista()== 0){
            int codigo = Dados.ListaLE.size() +1;
            obj.setCod_lista(codigo);
            Dados.ListaLE.add(obj);
        }  
    }
    public void remove(Lista_de_EQPS_do_EVT obj){
        Dados.ListaLE.remove(obj);
    }
}
