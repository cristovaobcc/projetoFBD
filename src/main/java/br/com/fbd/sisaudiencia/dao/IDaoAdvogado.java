/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Advogado;

/**
 *
 * @author cristovao
 */
public interface IDaoAdvogado {
    
    boolean adicionarAdvogado(Advogado a);
    Advogado recupergarAdvogado(String nome);
    Advogado atualizarAdvogado(String nome);
    boolean removerAdvogado(String cpf);
    
}
