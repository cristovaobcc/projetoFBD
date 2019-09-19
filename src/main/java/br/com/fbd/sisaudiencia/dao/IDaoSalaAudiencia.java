/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.SalaAudiencia;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IDaoSalaAudiencia {
    boolean cadastrarSalaAudiencia(SalaAudiencia salaAudiencia);
    boolean removerSalaAudiencia(Integer id);
    SalaAudiencia atualizarSalaAudiencia(Integer id);
    SalaAudiencia buscarSalaAudiencia(Integer id);
    List<SalaAudiencia> getSalasAudiencia();
}
