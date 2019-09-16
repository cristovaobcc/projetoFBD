/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.vara.dao;

import br.com.fbd.vara.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IDaoVara {
    
    boolean cadastrarVara(Vara vara);
    boolean removerVara(Integer id);
    Vara atualizar(Integer id);
    Vara buscarVara(Integer id);
    List<Vara> getVaras();
    
}
