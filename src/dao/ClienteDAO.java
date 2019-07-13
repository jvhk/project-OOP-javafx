/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Cliente;
import model.Database;



/**
 *
 * @author Joao
 */
public class ClienteDAO implements IDao<Cliente> {    
    
    public ClienteDAO() {}   


    @Override
    public void inserir(Cliente obj) {
        Database.dados.getClientes().add(obj);
    }

    @Override
    public boolean deletar(Cliente obj) {
        return Database.dados.getClientes().remove(obj);
    }
    
    public boolean deletar(int cpf){
        ArrayList<Cliente> cliente = Database.dados.getClientes();
        
        int pos = -1;
        for (int i = 0; i < cliente.size(); i++) {
            Cliente cli = cliente.get(i);
            if(cli.getCpf()== (cpf)){
                pos = i;
            }
        }
        
        if(pos >= 0){
            cliente.remove(pos);
            return true;
        }
        
        return false;
    }    
    

    @Override
    public void update(Cliente obj) {
//        ArrayList<Cliente> clientes = Database.dados.getClientes();
//        for (int i = 0; i < clientes.size(); i++) {
//            if(clientes.get(i).getCpf() == obj.getCpf()){
//                clientes.set(i, obj);
//            }
//        }
    }
    
}
