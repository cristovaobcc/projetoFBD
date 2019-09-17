/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.dao.DaoVara;
import br.com.fbd.sisaudiencia.dao.IDaoVara;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class BusinessVara implements IBusinessVara{
    
    private IDaoVara iDaoVara;

    public BusinessVara() {
        this.iDaoVara = new DaoVara();
    }
    
    
    /**
     * Verifica se a vara passada no parametro atende aos requisitos 
     * necessários para cadastrá-la no sistema.
     * @param vara Vara
     * @return boolean  true, se atendeu aos parametros, cadastra-se.
     * false, caso contrario.
     * @throws VaraException 
     */
    @Override
    public boolean cadastrarVara(Vara vara) throws VaraException {
        if (vara.getNome().split(" ").length <= 1) {
            throw new VaraException("Nome da vara "
                    + "deve conter pelo menos 2 nomes");
        }
        if (vara.getNumero() <= 0) {
            throw new VaraException("O numero da vara deve ser >= 1");
        }
        if (vara.getId() == null){
            // Após passar pela validação, chamamos o método que salva os
            // dados no BD.
            return this.iDaoVara.cadastrarVara(vara);
        }
        return false;
    }

    @Override
    public boolean removerVara(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vara atualizar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vara buscarVara(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vara> getVaras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
