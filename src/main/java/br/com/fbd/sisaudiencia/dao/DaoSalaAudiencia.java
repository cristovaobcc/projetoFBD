/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.SalaAudiencia;
import br.com.fbd.sisaudiencia.sql_util.SQLUtil;
import br.com.fbd.sisaudiencia.sql_util.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import org.postgresql.util.PSQLException;

/**
 *
 * @author cristovao
 */
public class DaoSalaAudiencia implements IDaoSalaAudiencia {
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;

    @Override
    public boolean cadastrarSalaAudiencia(SalaAudiencia salaAudiencia) {
        try {
             conexaoConnection = SqlConnection.getConnectionInstance();
             preparedStatement = conexaoConnection.prepareStatement(SQLUtil.SalaAudiencia.INSERT_ALL);
             preparedStatement.setInt(1, salaAudiencia.getNumero());
             preparedStatement.setString(2, salaAudiencia.getNome());
             
             return this.preparedStatement.execute();
            
        } catch (Exception e) {
            if (e instanceof PSQLException) {
                String st = e.getMessage();
                String[] msgFatiada = st.split(" ");
                for (String string : msgFatiada) {
                    if (string.contains("salas_de_audiencias")) {
                        try {
                            preparedStatement = conexaoConnection.
                                    prepareStatement(SQLUtil.SalaAudiencia.CREATE_TABLE);
                            preparedStatement.execute();
                            return this.cadastrarSalaAudiencia(salaAudiencia);
                        } catch (Exception ex) {
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
    public boolean removerSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaAudiencia atualizarSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalaAudiencia buscarSalaAudiencia(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SalaAudiencia> getSalasAudiencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
