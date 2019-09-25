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
    private String numero; // Coloquei String, pois assim posso abarcar o DV com letras
    private boolean suspensa; // 
    private Integer idEstado; //#FK
     

    public RegistroOAB(Integer idEstado, String Numero) {
        this.idEstado = idEstado;
        this.numero = Numero;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public String getNumero() {
        return numero;
    }

    public boolean isSuspensa() {
        return suspensa;
    }
    
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public void setSuspensa(boolean suspensa) {
        this.suspensa = suspensa;
    }
    
}
