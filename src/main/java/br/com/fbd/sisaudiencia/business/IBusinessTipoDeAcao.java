/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;

/**
 *
 * @author cristovao
 */

public interface IBusinessTipoDeAcao {
    boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException;
    boolean removerTipoDeAcao(int id);
    TipoDeAcao buscarTipoDeAcao(int id);
    boolean editarTipoDeAcao(int id);
}
