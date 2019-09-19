/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Vara;
import br.com.fbd.sisaudiencia.sql_util.SQLUtil;
import br.com.fbd.sisaudiencia.sql_util.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.PSQLException;

/**
 *
 * @author cristovao
 */
public class DaoVara implements IDaoVara {
    
    private Connection conexaoConnection;
    private PreparedStatement preparedStatement;
    
    @Override
    public boolean cadastrarVara(Vara vara) {
        try {
            // estabelece a conecao com BD:
            conexaoConnection = SqlConnection.getConnectionInstance();
            // Prepara a declaração postgres para inserir o objeto do 
            // parametro no BD:
            preparedStatement = conexaoConnection.prepareStatement(SQLUtil.Vara.INSERT_ALL);
            /*
            "INSERT INTO " + NOME_TABELA +
                " (" + COL_NUMERO + "," +
                       COL_NOME + "," + 
                       COL_ENDERECO + 
                ") values (?, ?, ?)";
            */
            preparedStatement.setInt(1, vara.getNumero());
            preparedStatement.setString(2, vara.getNome());
            preparedStatement.setString(3, vara.getEndereco());
            
            return this.preparedStatement.execute();
            
        } catch (Exception e) {
            if (e instanceof PSQLException) {
                String st = e.getMessage();
                String[] mensagemFatiada = st.split(" ");
                // TODO: substituir esse for por uma regex!
                for (String string : mensagemFatiada) {
                    if (string.contains("varas")) {
                        try {
                            preparedStatement = conexaoConnection.prepareStatement(SQLUtil.Vara.CREATE_TABLE);
                            preparedStatement.execute();
                            return this.cadastrarVara(vara);
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
