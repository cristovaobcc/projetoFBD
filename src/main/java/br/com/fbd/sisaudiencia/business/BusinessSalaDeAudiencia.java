/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoSalaAudiencia;
import br.com.fbd.sisaudiencia.dao.IDaoSalaAudiencia;
import br.com.fbd.sisaudiencia.excecoes.SalaDeAudienciaException;
import br.com.fbd.sisaudiencia.model.SalaAudiencia;
import java.util.List;


/**
 * Classe que valida as regras de negócio de sala de audiências.
 * @author cristovao
 */
public class BusinessSalaDeAudiencia implements IBusinessSalaDeAudiencia {
    
    private IDaoSalaAudiencia iDaoSalaAudiencia;

    public BusinessSalaDeAudiencia() {
        this.iDaoSalaAudiencia = new DaoSalaAudiencia();
    }
    
    
    @Override
    public boolean cadastrarSalaAudiencia(SalaAudiencia salaAudiencia)
            throws SalaDeAudienciaException {
            
        if (salaAudiencia.getNumero() <= 0) {
            throw new SalaDeAudienciaException("O numero da sala não pode ser "
                    + "menor ou igual a 0(zero)");
        }
        
        if (salaAudiencia.getNome().isEmpty()){
            
            throw new SalaDeAudienciaException("O nome da sala não pode ser"
                    + "vazio");
        }
        
        if (salaAudiencia.getNome().length() <= 4){
            throw new SalaDeAudienciaException("O nome da sala deve ter 5 "
                    + "ou mais caracteres");
        }
        
        return iDaoSalaAudiencia.cadastrarSalaAudiencia(salaAudiencia);
    }

    

    @Override
    public boolean removerSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaAudiencia atualizarSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaAudiencia buscarSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SalaAudiencia> getSalasAudiencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
