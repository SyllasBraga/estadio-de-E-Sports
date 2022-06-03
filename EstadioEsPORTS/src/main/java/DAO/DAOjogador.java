package DAO;

import Modelo.Jogador;
import Dados.Dados;
import java.util.List;

public class DAOjogador {
    public List<Jogador> getLista(){
        return Dados.ListaJOGADORES;
    }
    public void Create (Jogador obj){
        if(obj.getCod_jogador()== 0){
            int codigo = Dados.ListaJOGADORES.size() +1;
            obj.setCod_jogador(codigo);
            Dados.ListaJOGADORES.add(obj);
        }  
    }
    public void remove(Jogador obj){
        Dados.ListaJOGADORES.remove(obj);
    }
}
