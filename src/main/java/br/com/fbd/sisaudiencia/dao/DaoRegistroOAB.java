/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.RegistroOAB;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author cristovao
 */
// TODO: implementar os métodos de interface.
public class DaoRegistroOAB implements IDaoRegistroOab {
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;
    
    @Override
    public boolean adicionarRegistroOab(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean recuperarRegistroOab(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistroOAB atualizarRegistroOAB(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistroOAB removerRegistroOAB(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
