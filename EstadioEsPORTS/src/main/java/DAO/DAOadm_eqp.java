package DAO;

import Modelo.ADM_de_equipe;
import Dados.Dados;
import java.util.List;

public class DAOadm_eqp {
    public List<ADM_de_equipe> getLista(){
        return Dados.ListaADM_eqp;
    }
    public void Create (ADM_de_equipe obj){
        if(obj.getCod_adm_eqp()== 0){
            int codigo = Dados.ListaADM_eqp.size() +1;
            obj.setCod_adm_eqp(codigo);
            Dados.ListaADM_eqp.add(obj);
        }  
    }
    public void remove(ADM_de_equipe obj){
        Dados.ListaADM_eqp.remove(obj);
    }
}
