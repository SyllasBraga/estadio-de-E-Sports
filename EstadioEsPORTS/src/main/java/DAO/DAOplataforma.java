package DAO;

import Modelo.Plataforma;
import Dados.Dados;
import java.util.List;

public class DAOplataforma {
    public List<Plataforma> getLista(){
        return Dados.ListaPLATAFORMAS;
    }
    public void Create (Plataforma obj){
        if(obj.getCod_plataforma()== 0){
            int codigo = Dados.ListaPLATAFORMAS.size() +1;
            obj.setCod_plataforma(codigo);
            Dados.ListaPLATAFORMAS.add(obj);
        }  
    }
    public void remove(Plataforma obj){
        Dados.ListaPLATAFORMAS.remove(obj);
    }
}
