/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.fachada;

import br.com.fbd.sisaudiencia.business.BusinessTipoDeAcao;
import br.com.fbd.sisaudiencia.business.BusinessVara;
import br.com.fbd.sisaudiencia.business.IBusinessTipoDeAcao;
import br.com.fbd.sisaudiencia.business.IBusinessVara;
import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class Fachada implements IFachada{
    
    // Crie uma variavel de instancia para cada model utilizado.
    private IBusinessVara iBusinessVara;
    private IBusinessTipoDeAcao iBusinessTipoDeAcao;
    
    // O padrão de projeto de fachada é o singleton.
    private static Fachada instance;

    private Fachada() {
        this.iBusinessVara = new BusinessVara();
        this.iBusinessTipoDeAcao = new BusinessTipoDeAcao();
    }
    
    public static Fachada getInstance(){
        if(instance == null){
            instance = new Fachada();
        }
        return instance;
    }

    @Override
    public boolean cadastrarVara(Vara vara) throws VaraException {
        // Note que aqui só chamamo o método que implementa a regra de negocio.
        // Que por tabela chamama o método que acessa o dao do objeto para
        // salvá-lo no BD.
        return iBusinessVara.cadastrarVara(vara);
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

    @Override
    public boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException {
        return iBusinessTipoDeAcao.cadastrarTipoDeAcao(tipoDeAcao);
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
