/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.sql_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristovao
 */
public class SqlConnection {
    public static final String NOME_BD_CONNECTION_POSTGRES = "POSTGRES";
    private static Connection conexao = null;
    
    /**
     * Conexão com o BD deve ter padrão de projeto singleton!
     * Devemos ter uma exceção para cada usuário logado, pois isso ajuda no
     * gerenciamento de seção.
     */
    private SqlConnection(){
        
    }
    
    public static Connection getConnectionInstance(){
        try {
            if(conexao == null || conexao.isClosed()){
                conexao = DriverManager.getConnection(SQLUtil.URL_POSTGRES,
                        SQLUtil.USUARIO_POSTGRES, SQLUtil.SENHA_POSTGRES);            }
        } catch (Exception e) {
            Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return conexao;
    }
}
