/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import br.com.fbd.sisaudiencia.sql_util.SQLUtil;
import br.com.fbd.sisaudiencia.sql_util.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.PSQLException;

/**
 *
 * @author cristovao
 */
public class DaoTipoDeAcao implements IDaoTipoDeAcao{
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;

    @Override
    public boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) {
        try {
            conexaoConnection = SqlConnection.getConnectionInstance();
            preparedStatement = conexaoConnection.prepareStatement(SQLUtil.TipoDeAcao.INSERT_ALL);
            preparedStatement.setString(1,tipoDeAcao.getNome());
            return preparedStatement.execute();
        } catch (Exception e) {
            if (e instanceof PSQLException) {
                String st = e.getMessage();
                String[] msgFatiada = st.split(" ");
                // TODO: substituir esse for por uma regex!
                for (String string : msgFatiada) {
                    if(string.contains("tipos_de_acao")){
                        try {
                            preparedStatement = conexaoConnection.prepareStatement(
                                    SQLUtil.TipoDeAcao.CREATE_TABLE);
                            preparedStatement.execute();
                            return this.cadastrarTipoDeAcao(tipoDeAcao);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
            e.printStackTrace();
            return false;
        }
            
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
