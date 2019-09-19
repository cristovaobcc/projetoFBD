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
public class SalaAudiencia {
    
    private Integer id;
    private Integer numero;
    private String nome;

    public SalaAudiencia(Integer numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
            
    
}
