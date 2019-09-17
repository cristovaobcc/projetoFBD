/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

/**
 *  Classe que representa o tipo de ação do processo.
 * @author cristovao
 */
public class TipoDeAcao {
    private Integer id;
    private String Nome;

    public TipoDeAcao(String Nome) {
        this.Nome = Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }
    
    
}
