/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoEndereco;
import br.com.fbd.sisaudiencia.dao.IDaoEndereco;
import br.com.fbd.sisaudiencia.model.Endereco;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class BusinessEndereco implements IBusinessEndereco{
    
    IDaoEndereco iDaoEndereco;

    public BusinessEndereco() {
        this.iDaoEndereco = new DaoEndereco();
    }
    
    
    // TODO: implementar 
    @Override
    public boolean cadastrarEndereco(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // TODO: implementar 
    @Override
    public Endereco buscarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // TODO: implementar 
    @Override
    public Endereco atualizarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // TODO: implementar 
    @Override
    public List<Endereco> getEnderecos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
