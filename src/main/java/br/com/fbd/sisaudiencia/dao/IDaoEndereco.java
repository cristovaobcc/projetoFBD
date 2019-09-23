/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Endereco;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IDaoEndereco {
    
    boolean cadastrarEndereco(Endereco endereco); // Create
    Endereco buscarEndereco(int id); // Recover
    Endereco atualizarEndereco(int id); // UpDate
    boolean removerEndereco(int id);
    List<Endereco> getEnderecos();
    
}
