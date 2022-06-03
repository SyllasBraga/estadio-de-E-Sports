package DAO;

import Modelo.Itens_da_lista;
import Dados.Dados;
import java.util.List;

public class DAOil {
    public List<Itens_da_lista> getLista(){
        return Dados.ListaIL;
    }
    public void Create (Itens_da_lista obj){
        if(obj.getItens_lista()== 0){
            int codigo = Dados.ListaIL.size() +1;
            obj.setItens_lista(codigo);
            Dados.ListaIL.add(obj);
        }  
    }
    public void remove(Itens_da_lista obj){
        Dados.ListaIL.remove(obj);
    }
}
