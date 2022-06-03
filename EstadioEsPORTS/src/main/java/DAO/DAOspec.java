package DAO;

import Modelo.Espectador;
import Dados.Dados;
import java.util.List;

public class DAOspec {
    public List<Espectador> getLista(){
        return Dados.ListaSPECS;
    }
    public void Create (Espectador obj){
        if(obj.getCod_spec()== 0){
            int codigo = Dados.ListaSPECS.size() +1;
            obj.setCod_spec(codigo);
            Dados.ListaSPECS.add(obj);
        }  
    }
    public void remove(Espectador obj){
        Dados.ListaSPECS.remove(obj);
    }
}
