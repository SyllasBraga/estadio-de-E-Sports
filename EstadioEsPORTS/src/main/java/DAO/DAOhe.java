package DAO;

import Modelo.Historico_de_eventos;
import Dados.Dados;
import java.util.List;

public class DAOhe {
    public List<Historico_de_eventos> getLista(){
        return Dados.ListaHE;
    }
    public void Create (Historico_de_eventos obj){
        if(obj.getCod_histo()== 0){
            int codigo = Dados.ListaHE.size() +1;
            obj.setCod_histo(codigo);
            Dados.ListaHE.add(obj);
        }  
    }
    public void remove(Historico_de_eventos obj){
        Dados.ListaHE.remove(obj);
    }
}
