/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.Processo;

/**
 *
 * @author cristovao
 */
// TODO: observar se os parametros inseridos por ora serão suficientes.
// pois pode haver alteraçoes em somente um turno de audiencias.
public class BusinessAudiencia implements IBusinessProcesso{

    @Override
    public boolean adicionarProcesso(Processo p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Processo recuperarProcesso(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Processo atualizarProcesso(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerProcesso(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
