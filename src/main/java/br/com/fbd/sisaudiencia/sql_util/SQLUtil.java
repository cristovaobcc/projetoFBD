/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.sql_util;

/**
 *
 * @author cristovao
 */
public class SQLUtil {
    
    public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/sisAudienciaBD";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "postgres";
    
    /*
    private Integer id;
    private Integer numero;
    private String nome;
    private String endereco;
    */
    public static class Vara{
        private static String NOME_TABELA = "varas";
        private static String COL_NUMERO = "numero";
        private static String COL_NOME = "nome";
        private static String COL_ENDERECO = "endereco";
        
        public static String INSERT_ALL = 
                "INSERT INTO " + NOME_TABELA +
                " (" + COL_NUMERO + "," +
                       COL_NOME + "," + 
                       COL_ENDERECO + 
                ") values (?, ?, ?)";
                
        public static String CREATE_TABLE = 
                "CREATE TABLE "+ NOME_TABELA +
                "( id serial primary key, " +
                COL_NUMERO + " integer," +
                COL_NOME + " varchar(255)," +
                COL_ENDERECO + " varchar(255));";
                
                
    }
    
    
    public static class TipoDeAcao{
        
        private static String NOME_TABELA = "tipos_de_acao";
        private static String COL_NOME = "tipo_de_acao";
        
        
        public static String CREATE_TABLE = 
                "CREATE TABLE " + NOME_TABELA +
                "( id serial primary key, "+
                COL_NOME + " varchar(255));";
        
        public static String INSERT_ALL =
                "INSERT INTO " + NOME_TABELA +
                "(" + COL_NOME +") values (?)";
        
    }
        
    
}
