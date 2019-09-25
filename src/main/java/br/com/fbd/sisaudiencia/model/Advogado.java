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
public class Advogado {
    
    private Integer id;
    private String cpf;
    private String nome;
    private Integer id_registroOab;

    public Advogado(String cpf, String nome, Integer id_registroOab) {
        this.cpf = cpf;
        this.nome = nome;
        this.id_registroOab = id_registroOab;
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId_registroOab() {
        return id_registroOab;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_registroOab(Integer id_registroOab) {
        this.id_registroOab = id_registroOab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + 
                ", id_registroOab=" + id_registroOab + '}';
    }
       
    
}
