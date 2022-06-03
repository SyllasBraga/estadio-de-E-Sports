package DAO;

import Modelo.Equipe;
import Dados.Dados;
import java.util.List;

public class DAOeqp {
    public List<Equipe> getLista(){
        return Dados.ListaEquipes;
    }
    public void Create (Equipe obj){
        if(obj.getCod_equipe()== 0){
            int codigo = Dados.ListaEquipes.size() +1;
            obj.setCod_equipe(codigo);
            Dados.ListaEquipes.add(obj);
        }  
    }
    public void remove(Equipe obj){
        Dados.ListaEquipes.remove(obj);
    }
}
