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
public class RegistroOAB {
    
    private Integer id;
    private Integer Numero;
    private boolean suspensa; // 
    private Integer idEstado; //#FK
     

    public RegistroOAB(Integer idEstado, Integer Numero) {
        this.idEstado = idEstado;
        this.Numero = Numero;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }
    
    
    
}
