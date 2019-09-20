/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

/**
 *
 * @author cristovao
 */
public class Estado {
    
    private Integer id;
    private String nome;
    private String uf;

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }
            
}
