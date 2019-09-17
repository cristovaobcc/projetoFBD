/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.fachada;

import br.com.fbd.sisaudiencia.business.BusinessVara;
import br.com.fbd.sisaudiencia.business.IBusinessVara;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class Fachada implements IFachada{
    
    // Crie uma variavel de instancia para cada model utilizado.
    private IBusinessVara iBusinessVara;
    
    // O padrão de projeto de fachada é o singleton.
    private static Fachada instance;

    private Fachada() {
        this.iBusinessVara = new BusinessVara();
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

        
}
