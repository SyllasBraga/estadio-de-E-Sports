package DAO;

import Modelo.Jogo;
import Dados.Dados;
import java.util.List;

public class DAOjogo {
    public List<Jogo> getLista(){
        return Dados.ListaJOGOS;
    }
    public void Create (Jogo obj){
        if(obj.getCod_jogo()== 0){
            int codigo = Dados.ListaJOGOS.size() +1;
            obj.setCod_jogo(codigo);
            Dados.ListaJOGOS.add(obj);
        }  
    }
    public void remove(Jogo obj){
        Dados.ListaJOGOS.remove(obj);
    }
}
