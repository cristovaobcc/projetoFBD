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
public class Municipio {
    
    private Integer id;
    private Integer id_estado;
    private String nome;

    public Municipio(Integer id_estado, String nome) {
        this.id_estado = id_estado;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public Integer getId_estado() {
        return id_estado;
    }

    public String getNome() {
        return nome;
    }

    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
