/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoTipoDeAcao;
import br.com.fbd.sisaudiencia.dao.IDaoTipoDeAcao;
import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;
import br.com.fbd.sisaudiencia.model.TipoDeAcao;

/**
 * Classe que representa as regras de negócios que envolvem a validação do Tipo
 * de Ação dos processos.
 * @author cristovao
 */
public class BusinessTipoDeAcao implements IBusinessTipoDeAcao{
    
    private IDaoTipoDeAcao iDaoTipoDeAcao;

    public BusinessTipoDeAcao() {
        this.iDaoTipoDeAcao = new DaoTipoDeAcao();
    }
    
        
    /**
     * Método responsável por cadastrar o tipo de ação.
     * @param tipoDeAcao
     * @return
     * @throws TipoDeAcaoException 
     */
    @Override
    public boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException {
        if(tipoDeAcao.getNome().split(" ").length <= 1){
            throw new TipoDeAcaoException(("Nome da ação deve conter pelo menos "
                    + "2 nomes. Ex: Aposentadoria Urbana"));
        }
        if (tipoDeAcao.getId() == null) {
            return this.iDaoTipoDeAcao.cadastrarTipoDeAcao(tipoDeAcao);
        }
        return false;
    }

    @Override
    public boolean removerTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoDeAcao buscarTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
