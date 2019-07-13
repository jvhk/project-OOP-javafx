/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Animal;
import model.Database;

/**
 *
 * @author Joao
 */
public class AnimalDAO implements IDao<Animal> {
   

    public AnimalDAO() {
    }
    

    @Override
    public void inserir(Animal obj) {
        Database.dados.getAnimais().add(obj);
    }

    @Override
    public boolean deletar(Animal obj) {
        return Database.dados.getAnimais().remove(obj);
    }
    
    public boolean deletar(String nome){
        ArrayList<Animal> animal = Database.dados.getAnimais();
        
        int pos = -1;
        for (int i = 0; i < animal.size(); i++) {
            Animal an = animal.get(i);
            if(an.getNome().equals(nome)){
                pos = i;
            }
        }
        
        if(pos >= 0){
            animal.remove(pos);
            return true;
        }
        
        return false;
    }
    

    @Override
    public void update(Animal obj) {
    }
    
}
