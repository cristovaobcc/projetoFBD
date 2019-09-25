/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

import java.util.ArrayList;

/**
 *
 * @author cristovao
 */
public class Estado {
    //  TODO: ver como será feito o carregamento dos municipios para um Estado.
    private Integer id;
    private String nome;
    private String uf;
    private ArrayList<Municipio> municipios;

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
        municipios = new ArrayList<>();
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

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }
            
    public void setUf(String uf) {
        this.uf = uf;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }
                    
}
