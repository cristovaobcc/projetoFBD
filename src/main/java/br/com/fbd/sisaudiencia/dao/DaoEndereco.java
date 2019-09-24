/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Endereco;
import br.com.fbd.sisaudiencia.sql_util.SQLUtil;
import br.com.fbd.sisaudiencia.sql_util.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author cristovao
 */
public class DaoEndereco implements IDaoEndereco {
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;

    @Override
    public boolean cadastrarEndereco(Endereco endereco) {
        try {
            conexaoConnection = SqlConnection.getConnectionInstance();
            preparedStatement = conexaoConnection.prepareStatement(
                SQLUtil.Endereco.INSERT_INTO);
            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setInt(2, endereco.getNumero());
            preparedStatement.setString(3, endereco.getComplemento());
            preparedStatement.setString(4, endereco.getBairro());
            preparedStatement.setInt(5, endereco.getIdMunicipio());
            preparedStatement.setInt( 6, endereco.getIdEstado());
            preparedStatement.setString(7, endereco.getCEP());
            preparedStatement.setFloat(8, 
                    endereco.getDistanciaDaVara());
            
            return this.preparedStatement.execute();

        } catch (Exception e) {
            //TODO: tratar a exceção aqui. Caso a tabela não exista, criá-la
            // aqui dentro.
            return false;
        }
    }
    
    // TODO: implementar
    @Override
    public Endereco buscarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // TODO: implementar
    @Override
    public Endereco atualizarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO: implementar
    @Override
    public boolean removerEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO: implementar
    @Override
    public List<Endereco> getEnderecos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
            
}
