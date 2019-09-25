/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Estado;
import br.com.fbd.sisaudiencia.model.Municipio;
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
public class DaoEstado implements IDaoEstado{
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;

    @Override
    public boolean carregarEstados() {
        conexaoConnection = SqlConnection.getConnectionInstance();
        try {
            preparedStatement = conexaoConnection.prepareStatement(SQLUtil.Estado.INSERT_ALL);
            return preparedStatement.execute();
        } catch (Exception e) {
            if (e instanceof PSQLException) {
                String st = e.getMessage();
                String[] msgFatiada = st.split(" ");
                for (String string : msgFatiada) {
                    if (string.contains("estados")) {
                        try {
                            preparedStatement = conexaoConnection.
                                    prepareStatement(SQLUtil.Estado.CREATE_TABLE);
                            preparedStatement.execute();
                            return this.carregarEstados();
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
    public Estado getEstado(Integer id) {
        // TODO: aqui provavelmente haverá uma consulta SQL para resgatar o Estado
        // selecionado na UI.
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estado> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> getMunicipios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
