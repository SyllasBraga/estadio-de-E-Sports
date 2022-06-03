package DAO;

import Modelo.Lista_ingressos;
import Dados.Dados;
import java.util.List;

public class DAOli {
    public List<Lista_ingressos> getLista(){
        return Dados.ListaLI;
    }
    public void Create (Lista_ingressos obj){
        if(obj.getCod_lista()== 0){
            int codigo = Dados.ListaLI.size() +1;
            obj.setCod_lista(codigo);
            Dados.ListaLI.add(obj);
        }  
    }
    public void remove(Lista_ingressos obj){
        Dados.ListaLI.remove(obj);
    }
}
