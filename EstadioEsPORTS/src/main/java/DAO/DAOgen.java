package DAO;

import Modelo.Genero;
import Dados.Dados;
import java.util.List;

public class DAOgen {
    public List<Genero> getLista(){
        return Dados.ListaGENEROS;
    }
    public void Create (Genero obj){
        if(obj.getCod_gen()== 0){
            int codigo = Dados.ListaGENEROS.size() +1;
            obj.setCod_gen(codigo);
            Dados.ListaGENEROS.add(obj);
        }  
    }
    public void remove(Genero obj){
        Dados.ListaGENEROS.remove(obj);
    }
}
