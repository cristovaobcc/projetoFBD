/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoEstado;
import br.com.fbd.sisaudiencia.dao.IDaoEstado;
import br.com.fbd.sisaudiencia.model.Estado;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class BusinessEstado implements IBusinessEstado{
    
    private IDaoEstado iDaoEstado;

    public BusinessEstado() {
        this.iDaoEstado = new DaoEstado();
    }
    
    public boolean carregarEstados(){
        return iDaoEstado.carregarEstados();
    }
    
    @Override
    public Estado getEstado(Integer id) {
        // TODO: Pensar em como fazer a implementação
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estado> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
