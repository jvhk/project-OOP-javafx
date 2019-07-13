/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Database;
import model.Servico;

/**
 *
 * @author Joao
 */
public class ServicoDAO implements IDao<Servico> {

    @Override
    public void inserir(Servico obj) {
        Database.dados.getServicos().add(obj);
    }

    @Override
    public boolean deletar(Servico obj) {
        return Database.dados.getServicos().remove(obj);
    }
    
    public boolean deletar(int codigo){
        ArrayList<Servico> servico = Database.dados.getServicos();
        
        int pos = -1;
        for (int i = 0; i < servico.size(); i++) {
            Servico serv = servico.get(i);
            if(serv.getCodigo() == (codigo)){
                pos = i;
            }
        }
        
        if(pos >= 0){
            servico.remove(pos);
            return true;
        }
        
        return false;
    }

    @Override
    public void update(Servico obj) {
        
    }
    
}
