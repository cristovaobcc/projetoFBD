/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

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
public class DaoMunicipio implements IDaoMunicipio {

    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;

    @Override
    public boolean carregarMunicipios() {
        try {
            conexaoConnection = SqlConnection.getConnectionInstance();
            
            return SQLUtil.Municipio.insertAll(preparedStatement);
        } catch (Exception e) {
            if (e instanceof PSQLException) {
                String st = e.getMessage();
                String[] msgFatiada = st.split(" ");
                for (String string : msgFatiada) {
                    if (string.contains("municipios")) {
                        try {
                            preparedStatement = conexaoConnection.
                                    prepareStatement(SQLUtil.Estado.CREATE_TABLE);
                            preparedStatement.execute();
                            return this.carregarMunicipios();
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
    public Municipio getMunicipio(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> getAll(Integer idEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
