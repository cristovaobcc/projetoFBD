/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.Audiencia;
import java.time.LocalDate;

/**
 *
 * @author cristovao
 */
// TODO: observar se os parametros inseridos por ora serão suficientes.
// pois pode haver alteraçoes em somente um turno de audiencias.
public interface IBusinessAudiencia {
    
    boolean adicionarAudiencia(Audiencia a);
    Audiencia recuperarAudiencia(LocalDate localDate);
    Audiencia atualizarAudiencia(LocalDate localDate);
    boolean removerAudiencia(LocalDate localDate);
    
}
