/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.fachada;

import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IFachada {
    // Métodos relativos ao model Vara
    boolean cadastrarVara(Vara vara) throws VaraException;
    boolean removerVara(Integer id);
    Vara atualizar(Integer id);
    Vara buscarVara(Integer id);
    List<Vara> getVaras();
    
    // Métodos relativos ao model TipoDeAcao
    boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException;
    boolean removerTipoDeAcao(int id);
    TipoDeAcao buscarTipoDeAcao(int id);
    boolean editarTipoDeAcao(int id);
    
    // Métodos relativos a outros models devem ser postos daqui para baixo.
    // Separe-os por model.
}
