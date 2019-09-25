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
public abstract class PessoaFisica {
    
    private Integer id;
    private String CPF;
    private String nome;

    public PessoaFisica(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "id=" + id + ", CPF=" + CPF + 
                ", nome=" + nome + '}';
    }
   
}
