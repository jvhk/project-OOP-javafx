/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Joao
 */
public interface IDao<T> {
    
    public void inserir(T obj);
    
    public boolean deletar(T obj);
        
    public void update(T obj);
    
   
       
    
}
