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
public class Advogado extends PessoaFisica{
    
    
    private Integer id_registroOab;

    public Advogado(String cpf, String nome, Integer id_registroOab) {
        super(cpf, nome);
        this.id_registroOab = id_registroOab;
    }

    public Integer getId_registroOab() {
        return id_registroOab;
    }

    public void setId_registroOab(Integer id_registroOab) {
        this.id_registroOab = id_registroOab;
    }

    @Override
    public String toString() {
        return super.toString() + "Advogado{" + "id_registroOab=" + id_registroOab + '}';
    }
   
}
