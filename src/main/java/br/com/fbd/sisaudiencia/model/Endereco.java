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
public class Endereco {
    
    private Integer id;
    private String rua;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String CEP;
    private float distanciaDaVara;
    private Integer idMunicipio;
    private Integer idEstado;

    public Endereco(String rua, Integer numero, String complemento, 
            String bairro, String CEP, float distanciaDaVara, 
            Integer idMunicipio, Integer idEstado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.CEP = CEP;
        this.distanciaDaVara = distanciaDaVara;
        this.idMunicipio = idMunicipio;
        this.idEstado = idEstado;
    }

    public Integer getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public float getDistanciaDaVara() {
        return distanciaDaVara;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setDistanciaDaVara(float distanciaDaVara) {
        this.distanciaDaVara = distanciaDaVara;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
    
}
