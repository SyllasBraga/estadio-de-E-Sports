package DAO;

import Modelo.Administrador;
import Dados.Dados;
import java.util.List;

public class DAOadm {
    public List<Administrador> getLista(){
        return Dados.ListaADM;
    }
    public void Create (Administrador obj){
        if(obj.getCod_adm() == 0){
            int codigo = Dados.ListaADM.size() +1;
            obj.setCod_adm(codigo);
            Dados.ListaADM.add(obj);
        }  
    }
    public void remove(Administrador obj){
        Dados.ListaADM.remove(obj);
    }
}
