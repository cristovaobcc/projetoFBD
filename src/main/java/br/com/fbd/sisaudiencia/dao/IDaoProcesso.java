/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Processo;

/**
 *
 * @author cristovao
 */
public interface IDaoProcesso {
    
    boolean adicionarProcesso(Processo p);
    Processo recuperarProcesso(String numero);
    Processo atualizarProcesso(String numero);
    boolean removerProcesso(String numero);    
    
}
