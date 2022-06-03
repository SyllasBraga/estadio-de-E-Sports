package DAO;

import Modelo.Ingresso;
import Dados.Dados;
import java.util.List;

public class DAOingresso {
        public List<Ingresso> getLista(){
        return Dados.ListaINGRESSOS;
    }
    public void Create (Ingresso obj){
        if(obj.getCod_ingresso()== 0){
            int codigo = Dados.ListaINGRESSOS.size() +1;
            obj.setCod_ingresso(codigo);
            Dados.ListaINGRESSOS.add(obj);
        }  
    }
    public void remove(Ingresso obj){
        Dados.ListaINGRESSOS.remove(obj);
    }
}
