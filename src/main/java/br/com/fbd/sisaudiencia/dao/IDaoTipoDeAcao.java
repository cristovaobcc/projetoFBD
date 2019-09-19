package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa os serviços que têm que ser implementados pelo DaoTipoDeAcao.
 * Nota: pode ser que os usuários não precisem utilizar todas essas
 * funcionalidades na UI.
 * @author cristovao
 */
public interface IDaoTipoDeAcao {
    boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao);
    boolean removerTipoDeAcao(int id);
    TipoDeAcao buscarTipoDeAcao(int id);
    boolean editarTipoDeAcao(int id);
    List<TipoDeAcao> getTipoDeAcao();
}
