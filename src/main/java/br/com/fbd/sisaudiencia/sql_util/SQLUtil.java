/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.sql_util;

import java.sql.PreparedStatement;

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
        // Lista de estados fornecido por: 
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
    
    public static class Municipio{
        private static String NOME_TABELA = "municipios";
        private static String COL_NOME = "nome";
        private static String COL_ID_ESTADO_FK = "id_estado"; // FK: Foreign Key
        
        public static String CREATE_TABLE = 
                "CREATE TABLE " + NOME_TABELA +
                "( id serial primary key, "+
                COL_NOME + " varchar(255), "
                + COL_ID_ESTADO_FK + " int));";
      
        // TODO: implementar ao método para ler do arquivo municipios.txt e 
        // inserir os dados de municipios no BD.
        public static boolean insertAll(PreparedStatement preparedStatement){
            return false;
        }

    }
    
    public static class Endereco{
        private static String NOME_TABELA = "enderecos";
        private static String COL_RUA = "rua";
        private static String COL_NUMERO = "numero";
        private static String COL_COMPLEMENTO = "complemento";
        private static String COL_BAIRRO = "bairro";
        private static String COL_CEP = "cep";
        private static String COL_DISTANCIA_VARA = "distancia_vara";
        private static String COL_ID_MUNICIPIO = "id_municipio"; // FK!
        private static String COL_ID_ESTADO = "id_estado";
        
        public static String CREATE_TABLE = 
                "CREATE TABLE " + NOME_TABELA +
                "( id serial primary key, " +
                COL_RUA + " varchar(255), " +
                COL_NUMERO + " int, " + 
                COL_COMPLEMENTO + " varchar(255), " +
                COL_BAIRRO + " varchar(225), " +
                COL_CEP + " varchar(9), " +
                COL_DISTANCIA_VARA + " float8, " + 
                COL_ID_MUNICIPIO + " varchar(255)," +
                COL_ID_ESTADO + " varchar(255);";
        
        /*
         public static String INSERT_ALL =
                "INSERT INTO " + NOME_TABELA +
                "(" + COL_NOME +") values (?)";
        */
        
        public static String INSERT_INTO = 
                "INSERT INTO " + NOME_TABELA +
                "("+COL_RUA+", " +COL_NUMERO+", " +
                COL_COMPLEMENTO +", " + COL_BAIRRO +", " +
                COL_CEP +", " + COL_DISTANCIA_VARA +", " +
                COL_ID_MUNICIPIO +", " + COL_ID_ESTADO +
                ") values (?,?,?,?,?,?,?,?)";
                
                
    }
        
        
}
