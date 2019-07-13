/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Catalano.IO.Serialization;
import dao.AnimalDAO;
import dao.ClienteDAO;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao
 */
public class Dados implements Serializable{
    private ArrayList <Cliente> clientes = new ArrayList();
    private ArrayList <Servico> servicos = new ArrayList();
    private ArrayList <Animal> animais = new ArrayList();
    
    private final String pathname;

    public Dados(String pathname) {
        this.pathname = pathname;
    }

    public void Load(){
        Dados db = (Dados)Serialization.Deserialize(pathname);
        this.animais = db.animais;
        this.clientes = db.clientes;
        this.servicos = db.servicos;
    }
    
    public void Save(){
        Serialization.Serialize(this,pathname);
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public ArrayList<Animal> getAnimais() {
        return (ArrayList<Animal>) animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }    
    
    public static String input(String title){
        return JOptionPane.showInputDialog(title);
    }
    
    
//    //Cadastrar cliente
//    public void cadastrar(Cliente cli){
//        clientes.add(cli);
//    }
//    
//    //Cadastrar Servico
//    public void cadastrar(Servico serv){
//        servicos.add(serv);
//    }   
//    
//    //Cadastrar Animal
//    public void cadastrar(Animal animal){
//        animais.add(animal);
//    }   
//    
//    //Remover cliente
//    public void remover(Cliente cli){
//        clientes.remove(cli);
//    }   
//    
//    //Remover animal
//    public void remover(Animal ani){
//        animais.remove(ani);
//    }   
//    
//    //Remover serviço
//    public void remover(Servico serv){
//        servicos.remove(serv);
//    }   
    
    //Query do cliente
    public Cliente queryCliente(int cpf){
        for (Cliente cliente : clientes) {
            if(cliente.getCpf()==cpf){
                return cliente;            
            }
        }       return null;
    }
    //Query do servico
    public Servico queryServico(int codigo){
        for (Servico serv : servicos) {
            if(serv.getCodigo() == codigo){
                return serv;            
            }
        }       return null;
    }
    
    //Query do animal
    public Animal queryAnimal(String nome){
        for (Animal animal : animais) {
            if(animal.getNome().equals(nome)){
                return animal;            
            }
        }       return null;
    }

    
}