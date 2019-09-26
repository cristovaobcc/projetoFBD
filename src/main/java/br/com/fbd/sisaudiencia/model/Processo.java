/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

import java.util.Arrays;

/**
 * Classe que representa um processo.
 * @author cristovao
 */
public class Processo {
    
    private Integer id;
    // TODO: testar se a igualdade funciona de forma correta com o
    // atributo numero.
    private String[] numero;
    private Integer idAutor;

    public Processo(Integer idAutor) {
        this.numero = new String[21];
        this.idAutor = idAutor;
        
    }

    public Integer getId() {
        return id;
    }

    public String[] getNumero() {
        return numero;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumero(String[] numero) {
        this.numero = numero;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "Processo{" + "id=" + id + ", numero=" + Arrays.toString(numero) + 
                ", idAutor=" + idAutor + '}';
    }
      
    
}
