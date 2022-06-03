package DAO;

import Modelo.Evento;
import Dados.Dados;
import java.util.List;

public class DAOevt {
    public List<Evento> getLista(){
        return Dados.ListaEVTS;
    }
    public void Create (Evento obj){
        if(obj.getCod_evt()== 0){
            int codigo = Dados.ListaEVTS.size() +1;
            obj.setCod_evt(codigo);
            Dados.ListaEVTS.add(obj);
        }  
    }
    public void remove(Evento obj){
        Dados.ListaEVTS.remove(obj);
    }
}
