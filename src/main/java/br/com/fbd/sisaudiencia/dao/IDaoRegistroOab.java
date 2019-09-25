/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.RegistroOAB;

/**
 *
 * @author cristovao
 */
public interface IDaoRegistroOab {
    
    boolean adicionarRegistroOab(RegistroOAB r);
    boolean recuperarRegistroOab(RegistroOAB r);
    RegistroOAB atualizarRegistroOAB(RegistroOAB r);
    RegistroOAB removerRegistroOAB(int id);
    
}
