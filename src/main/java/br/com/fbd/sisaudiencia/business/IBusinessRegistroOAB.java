/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.RegistroOAB;

/**
 *
 * @author cristovao
 */
public interface IBusinessRegistroOAB  {
    
    boolean adicionarRegistroOab(RegistroOAB r);
    RegistroOAB recuperarRegistroOab(String numero);
    RegistroOAB atualizarRegistroOAB(String numero);
    boolean removerRegistroOAB(String numero);
}
