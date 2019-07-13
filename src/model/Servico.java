/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Joao
 */
public class Servico implements Comparable<Servico> {
    private String tipoServico; //venda,tosa,banho..
    private String descricaoServico;    //produto vendido,tipo da tosa,banho completo,banho com shampoo especial...
    private double precoServico;    //preco do servico memo
    private String profissionalReponsavel;
    private int codigo;
    
    public Servico(String tipoServico, String descricaoServico, double precoServico, String profissionalReponsavel, int codigo) {
        this.tipoServico = tipoServico;
        this.descricaoServico = descricaoServico;
        this.precoServico = precoServico;
        this.profissionalReponsavel = profissionalReponsavel;
        this.codigo = codigo;
    }


    public String getProfissionalReponsavel() {
        return profissionalReponsavel;
    }

    public void setProfissionalReponsavel(String profissionalReponsavel) {
        this.profissionalReponsavel = profissionalReponsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public boolean equals(Object o) {
        Servico serv = (Servico)o;
        if(this.codigo == serv.getCodigo()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Servico t) {
         if(this.codigo > t.getCodigo()){
            return -1;
        }
        if(this.codigo < t.getCodigo()){
            return 1;
        }
        return 0;
    }
    
    

    
    
    
}
