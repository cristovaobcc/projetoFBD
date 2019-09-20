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
    
    public static class SalaAudiencia{
        private static String NOME_TABELA = "salas_de_audiencias";
        private static String COL_NUMERO = "numero_sala";
        private static String COL_NOME = "nome_sala";
        
        public static String CREATE_TABLE = 
                "CREATE TABLE " + NOME_TABELA +
                "( id serial primary key, "+
                COL_NUMERO + " int, " + 
                COL_NOME + " varchar(255));";
        
        public static String INSERT_ALL = 
                "INSERT INTO " + NOME_TABELA +
                "(" + COL_NUMERO + ", "+
                COL_NOME + ") values (?, ?);";
                
        
    }
    
    public static class Estado{
        // TODO: ver com Heldon como inserir a consulta.
        // Será que posso aproveita daqui? 
        // https://www.ricardoarrigoni.com/cidades-brasil-lista-de-cidades-brasileiras-em-sql/
        private static String NOME_TABELA = "estados";
        private static String COL_NOME = "nome";
        private static String COL_UF = "UF";
        
        public static String CREATE_TABLE = 
                "CREATE TABLE " + NOME_TABELA +
                "( id serial primary key, "+
                COL_NOME + " varchar(255), "+
                COL_UF + " varchar(2));";
        
        public static String INSERT_ALL = 
                "INSERT INTO " + NOME_TABELA +
                "(" + COL_NOME +", " +
                COL_UF + ") values "
                + "('Acre', 'AC'), " +
                    "('Alagoas', 'AL'), " +
                    "('Amazonas', 'AM'), " +
                    "('Amapá', 'AP'), " +
                    "('Bahia', 'BA'), " +
                    "('Ceará', 'CE'), " +
                    "('Distrito Federal', 'DF'), " +
                    "('Espírito Santo', 'ES'), " +
                    "('Goiás', 'GO'), " +
                    "('Maranhão', 'MA'), " +
                    "('Minas Gerais', 'MG'), " +
                    "('Mato Grosso do Sul', 'MS'), " +
                    "('Mato Grosso', 'MT'), " +
                    "('Pará', 'PA'), " +
                    "('Paraíba', 'PB'), " +
                    "('Pernambuco', 'PE'), " +
                    "('Piauí', 'PI'), " +
                    "('Paraná', 'PR'), " +
                    "('Rio de Janeiro', 'RJ'), " +
                    "('Rio Grande do Norte', 'RN'), " +
                    "('Rondônia', 'RO'), " +
                    "('Roraima', 'RR'), " +
                    "('Rio Grande do Sul', 'RS'), " +
                    "('Santa Catarina', 'SC'), " +
                    "('Sergipe', 'SE'), " +
                    "('São Paulo', 'SP'), " +
                    "('Tocantins', 'TO');";
        
    }
    
}
