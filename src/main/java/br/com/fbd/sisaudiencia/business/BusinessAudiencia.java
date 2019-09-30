/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.Audiencia;
import br.com.fbd.sisaudiencia.model.Processo;
import java.time.LocalDate;

/**
 *
 * @author cristovao
 */
// TODO: observar se os parametros inseridos por ora serão suficientes.
// pois pode haver alteraçoes em somente um turno de audiencias.
public class BusinessAudiencia implements IBusinessAudiencia{

    @Override
    public boolean adicionarAudiencia(Audiencia a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Audiencia recuperarAudiencia(LocalDate localDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Audiencia atualizarAudiencia(LocalDate localDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerAudiencia(LocalDate localDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    
}
