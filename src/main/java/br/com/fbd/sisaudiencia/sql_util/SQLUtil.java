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
        
        public static String INSERT_ALL = 
                "INSERT INTO " + NOME_TABELA +
                "(" + COL_NOME + ", " +
                COL_ID_ESTADO_FK + ") values " +
                "('Afonso Cláudio', 8), " +
                "('Água Doce do Norte', 8), " +
                "('Águia Branca', 8), " +
                "('Alegre', 8), " +
                "('Alfredo Chaves', 8), " +
                "('Alto Rio Novo', 8), " +
                "('Anchieta', 8), " +
                "('Apiacá', 8), " +
                "('Aracruz', 8), " +
                "('Atilio Vivacqua', 8), " +
                "('Baixo Guandu', 8), " +
                "('Barra de São Francisco', 8), " +
                "('Boa Esperança', 8), " +
                "('Bom Jesus do Norte', 8), " +
                "('Brejetuba', 8), " +
                "('Cachoeiro de Itapemirim', 8), " +
                "('Cariacica', 8), " +
                "('Castelo', 8), " +
                "('Colatina', 8), " +
                "('Conceição da Barra', 8), " +
                "('Conceição do Castelo', 8), " +
                "('Divino de São Lourenço', 8), " +
                "('Domingos Martins', 8), " +
                "('Dores do Rio Preto', 8), " +
                "('Ecoporanga', 8), " +
                "('Fundão', 8), " +
                "('Governador Lindenberg', 8), " +
                "('Guaçuí', 8), " +
                "('Guarapari', 8), " +
                "('Ibatiba', 8), " +
                "('Ibiraçu', 8), " +
                "('Ibitirama', 8), " +
                "('Iconha', 8), " +
                "('Irupi', 8), " +
                "('Itaguaçu', 8), " +
                "('Itapemirim', 8), " +
                "('Itarana', 8), " +
                "('Iúna', 8), " +
                "('Jaguaré', 8), " +
                "('Jerônimo Monteiro', 8), " +
                "('João Neiva', 8), " +
                "('Laranja da Terra', 8), " +
                "('Linhares', 8), " +
                "('Mantenópolis', 8), " +
                "('Marataízes', 8), " +
                "('Marechal Floriano', 8), " +
                "('Marilândia', 8), " +
                "('Mimoso do Sul', 8), " +
                "('Montanha', 8), " +
                "('Mucurici', 8), " +
                "('Muniz Freire', 8), " +
                "('Muqui', 8), " +
                "('Nova Venécia', 8), " +
                "('Pancas', 8), " +
                "('Pedro Canário', 8), " +
                "('Pinheiros', 8), " +
                "('Piúma', 8), " +
                "('Ponto Belo', 8), " +
                "('Presidente Kennedy', 8), " +
                "('Rio Bananal', 8), " +
                "('Rio Novo do Sul', 8), " +
                "('Santa Leopoldina', 8), " +
                "('Santa Maria de Jetibá', 8), " +
                "('Santa Teresa', 8), " +
                "('São Domingos do Norte', 8), " +
                "('São Gabriel da Palha', 8), " +
                "('São José do Calçado', 8), " +
                "('São Mateus', 8), " +
                "('São Roque do Canaã', 8), " +
                "('Serra', 8), " +
                "('Sooretama', 8), " +
                "('Vargem Alta', 8), " +
                "('Venda Nova do Imigrante', 8), " +
                "('Viana', 8), " +
                "('Vila Pavão', 8), " +
                "('Vila Valério', 8), " +
                "('Vila Velha', 8), " +
                "('Vitória', 8), " +
                "('Acrelândia', 1), " +
                "('Assis Brasil', 1), " +
                "('Brasiléia', 1), " +
                "('Bujari', 1), " +
                "('Capixaba', 1), " +
                "('Cruzeiro do Sul', 1), " +
                "('Epitaciolândia', 1), " +
                "('Feijó', 1), " +
                "('Jordão', 1), " +
                "('Mâncio Lima', 1), " +
                "('Manoel Urbano', 1), " +
                "('Marechal Thaumaturgo', 1), " +
                "('Plácido de Castro', 1), " +
                "('Porto Acre', 1), " +
                "('Porto Walter', 1), " +
                "('Rio Branco', 1), " +
                "('Rodrigues Alves', 1), " +
                "('Santa Rosa do Purus', 1), " +
                "('Sena Madureira', 1), " +
                "('Senador Guiomard', 1), " +
                "('Tarauacá', 1), " +
                "('Xapuri', 1), " +
                "('Água Branca', 2), " +
                "('Anadia', 2), " +
                "('Arapiraca', 2), " +
                "('Atalaia', 2), " +
                "('Barra de Santo Antônio', 2), " +
                "('Barra de São Miguel', 2), " +
                "('Batalha', 2), " +
                "('Belém', 2), " +
                "('Belo Monte', 2), " +
                "('Boca da Mata', 2), " +
                "('Branquinha', 2), " +
                "('Cacimbinhas', 2), " +
                "('Cajueiro', 2), " +
                "('Campestre', 2), " +
                "('Campo Alegre', 2), " +
                "('Campo Grande', 2), " +
                "('Canapi', 2), " +
                "('Capela', 2), " +
                "('Carneiros', 2), " +
                "('Chã Preta', 2), " +
                "('Coité do Nóia', 2), " +
                "('Colônia Leopoldina', 2), " +
                "('Coqueiro Seco', 2), " +
                "('Coruripe', 2), " +
                "('Craíbas', 2), " +
                "('Delmiro Gouveia', 2), " +
                "('Dois Riachos', 2), " +
                "('Estrela de Alagoas', 2), " +
                "('Feira Grande', 2), " +
                "('Feliz Deserto', 2), " +
                "('Flexeiras', 2), " +
                "('Girau do Ponciano', 2), " +
                "('Ibateguara', 2), " +
                "('Igaci', 2), " +
                "('Igreja Nova', 2), " +
                "('Inhapi', 2), " +
                "('Jacaré dos Homens', 2), " +
                "('Jacuípe', 2), " +
                "('Japaratinga', 2), " +
                "('Jaramataia', 2), " +
                "('Jequiá da Praia', 2), " +
                "('Joaquim Gomes', 2), " +
                "('Jundiá', 2), " +
                "('Junqueiro', 2), " +
                "('Lagoa da Canoa', 2), " +
                "('Limoeiro de Anadia', 2), " +
                "('Maceió', 2), " +
                "('Major Isidoro', 2), " +
                "('Mar Vermelho', 2), " +
                "('Maragogi', 2), " +
                "('Maravilha', 2), " +
                "('Marechal Deodoro', 2), " +
                "('Maribondo', 2), " +
                "('Mata Grande', 2), " +
                "('Matriz de Camaragibe', 2), " +
                "('Messias', 2), " +
                "('Minador do Negrão', 2), " +
                "('Monteirópolis', 2), " +
                "('Murici', 2), " +
                "('Novo Lino', 2), " +
                "('Olho d`Água das Flores', 2), " +
                "('Olho d`Água do Casado', 2), " +
                "('Olho d`Água Grande', 2), " +
                "('Olivença', 2), " +
                "('Ouro Branco', 2), " +
                "('Palestina', 2), " +
                "('Palmeira dos Índios', 2), " +
                "('Pão de Açúcar', 2), " +
                "('Pariconha', 2), " +
                "('Paripueira', 2), " +
                "('Passo de Camaragibe', 2), " +
                "('Paulo Jacinto', 2), " +
                "('Penedo', 2), " +
                "('Piaçabuçu', 2), " +
                "('Pilar', 2), " +
                "('Pindoba', 2), " +
                "('Piranhas', 2), " +
                "('Poço das Trincheiras', 2), " +
                "('Porto Calvo', 2), " +
                "('Porto de Pedras', 2), " +
                "('Porto Real do Colégio', 2), " +
                "('Quebrangulo', 2), " +
                "('Rio Largo', 2), " +
                "('Roteiro', 2), " +
                "('Santa Luzia do Norte', 2), " +
                "('Santana do Ipanema', 2), " +
                "('Santana do Mundaú', 2), " +
                "('São Brás', 2), " +
                "('São José da Laje', 2), " +
                "('São José da Tapera', 2), " +
                "('São Luís do Quitunde', 2), " +
                "('São Miguel dos Campos', 2), " +
                "('São Miguel dos Milagres', 2), " +
                "('São Sebastião', 2), " +
                "('Satuba', 2), " +
                "('Senador Rui Palmeira', 2), " +
                "('Tanque d`Arca', 2), " +
                "('Taquarana', 2), " +
                "('Teotônio Vilela', 2), " +
                "('Traipu', 2), " +
                "('União dos Palmares', 2), " +
                "('Viçosa', 2), " +
                "('Amapá', 4), " +
                "('Calçoene', 4), " +
                "('Cutias', 4), " +
                "('Ferreira Gomes', 4), " +
                "('Itaubal', 4), " +
                "('Laranjal do Jari', 4), " +
                "('Macapá', 4), " +
                "('Mazagão', 4), " +
                "('Oiapoque', 4), " +
                "('Pedra Branca do Amaparí', 4), " +
                "('Porto Grande', 4), " +
                "('Pracuúba', 4), " +
                "('Santana', 4), " +
                "('Serra do Navio', 4), " +
                "('Tartarugalzinho', 4), " +
                "('Vitória do Jari', 4), " +
                "('Alvarães', 3), " +
                "('Amaturá', 3), " +
                "('Anamã', 3), " +
                "('Anori', 3), " +
                "('Apuí', 3), " +
                "('Atalaia do Norte', 3), " +
                "('Autazes', 3), " +
                "('Barcelos', 3), " +
                "('Barreirinha', 3), " +
                "('Benjamin Constant', 3), " +
                "('Beruri', 3), " +
                "('Boa Vista do Ramos', 3), " +
                "('Boca do Acre', 3), " +
                "('Borba', 3), " +
                "('Caapiranga', 3), " +
                "('Canutama', 3), " +
                "('Carauari', 3), " +
                "('Careiro', 3), " +
                "('Careiro da Várzea', 3), " +
                "('Coari', 3), " +
                "('Codajás', 3), " +
                "('Eirunepé', 3), " +
                "('Envira', 3), " +
                "('Fonte Boa', 3), " +
                "('Guajará', 3), " +
                "('Humaitá', 3), " +
                "('Ipixuna', 3), " +
                "('Iranduba', 3), " +
                "('Itacoatiara', 3), " +
                "('Itamarati', 3), " +
                "('Itapiranga', 3), " +
                "('Japurá', 3), " +
                "('Juruá', 3), " +
                "('Jutaí', 3), " +
                "('Lábrea', 3), " +
                "('Manacapuru', 3), " +
                "('Manaquiri', 3), " +
                "('Manaus', 3), " +
                "('Manicoré', 3), " +
                "('Maraã', 3), " +
                "('Maués', 3), " +
                "('Nhamundá', 3), " +
                "('Nova Olinda do Norte', 3), " +
                "('Novo Airão', 3), " +
                "('Novo Aripuanã', 3), " +
                "('Parintins', 3), " +
                "('Pauini', 3), " +
                "('Presidente Figueiredo', 3), " +
                "('Rio Preto da Eva', 3), " +
                "('Santa Isabel do Rio Negro', 3), " +
                "('Santo Antônio do Içá', 3), " +
                "('São Gabriel da Cachoeira', 3), " +
                "('São Paulo de Olivença', 3), " +
                "('São Sebastião do Uatumã', 3), " +
                "('Silves', 3), " +
                "('Tabatinga', 3), " +
                "('Tapauá', 3), " +
                "('Tefé', 3), " +
                "('Tonantins', 3), " +
                "('Uarini', 3), " +
                "('Urucará', 3), " +
                "('Urucurituba', 3), " +
                "('Abaíra', 5), " +
                "('Abaré', 5), " +
                "('Acajutiba', 5), " +
                "('Adustina', 5), " +
                "('Água Fria', 5), " +
                "('Aiquara', 5), " +
                "('Alagoinhas', 5), " +
                "('Alcobaça', 5), " +
                "('Almadina', 5), " +
                "('Amargosa', 5), " +
                "('Amélia Rodrigues', 5), " +
                "('América Dourada', 5), " +
                "('Anagé', 5), " +
                "('Andaraí', 5), " +
                "('Andorinha', 5), " +
                "('Angical', 5), " +
                "('Anguera', 5), " +
                "('Antas', 5), " +
                "('Antônio Cardoso', 5), " +
                "('Antônio Gonçalves', 5), " +
                "('Aporá', 5), " +
                "('Apuarema', 5), " +
                "('Araças', 5), " +
                "('Aracatu', 5), " +
                "('Araci', 5), " +
                "('Aramari', 5), " +
                "('Arataca', 5), " +
                "('Aratuípe', 5), " +
                "('Aurelino Leal', 5), " +
                "('Baianópolis', 5), " +
                "('Baixa Grande', 5), " +
                "('Banzaê', 5), " +
                "('Barra', 5), " +
                "('Barra da Estiva', 5), " +
                "('Barra do Choça', 5), " +
                "('Barra do Mendes', 5), " +
                "('Barra do Rocha', 5), " +
                "('Barreiras', 5), " +
                "('Barro Alto', 5), " +
                "('Barro Preto (antigo Gov. Lomanto Jr.)', 5), " +
                "('Barrocas', 5), " +
                "('Belmonte', 5), " +
                "('Belo Campo', 5), " +
                "('Biritinga', 5), " +
                "('Boa Nova', 5), " +
                "('Boa Vista do Tupim', 5), " +
                "('Bom Jesus da Lapa', 5), " +
                "('Bom Jesus da Serra', 5), " +
                "('Boninal', 5), " +
                "('Bonito', 5), " +
                "('Boquira', 5), " +
                "('Botuporã', 5), " +
                "('Brejões', 5), " +
                "('Brejolândia', 5), " +
                "('Brotas de Macaúbas', 5), " +
                "('Brumado', 5), " +
                "('Buerarema', 5), " +
                "('Buritirama', 5), " +
                "('Caatiba', 5), " +
                "('Cabaceiras do Paraguaçu', 5), " +
                "('Cachoeira', 5), " +
                "('Caculé', 5), " +
                "('Caém', 5), " +
                "('Caetanos', 5), " +
                "('Caetité', 5), " +
                "('Cafarnaum', 5), " +
                "('Cairu', 5), " +
                "('Caldeirão Grande', 5), " +
                "('Camacan', 5), " +
                "('Camaçari', 5), " +
                "('Camamu', 5), " +
                "('Campo Alegre de Lourdes', 5), " +
                "('Campo Formoso', 5), " +
                "('Canápolis', 5), " +
                "('Canarana', 5), " +
                "('Canavieiras', 5), " +
                "('Candeal', 5), " +
                "('Candeias', 5), " +
                "('Candiba', 5), " +
                "('Cândido Sales', 5), " +
                "('Cansanção', 5), " +
                "('Canudos', 5), " +
                "('Capela do Alto Alegre', 5), " +
                "('Capim Grosso', 5), " +
                "('Caraíbas', 5), " +
                "('Caravelas', 5), " +
                "('Cardeal da Silva', 5), " +
                "('Carinhanha', 5), " +
                "('Casa Nova', 5), " +
                "('Castro Alves', 5), " +
                "('Catolândia', 5), " +
                "('Catu', 5), " +
                "('Caturama', 5), " +
                "('Central', 5), " +
                "('Chorrochó', 5), " +
                "('Cícero Dantas', 5), " +
                "('Cipó', 5), " +
                "('Coaraci', 5), " +
                "('Cocos', 5), " +
                "('Conceição da Feira', 5), " +
                "('Conceição do Almeida', 5), " +
                "('Conceição do Coité', 5), " +
                "('Conceição do Jacuípe', 5), " +
                "('Conde', 5), " +
                "('Condeúba', 5), " +
                "('Contendas do Sincorá', 5), " +
                "('Coração de Maria', 5), " +
                "('Cordeiros', 5), " +
                "('Coribe', 5), " +
                "('Coronel João Sá', 5), " +
                "('Correntina', 5), " +
                "('Cotegipe', 5), " +
                "('Cravolândia', 5), " +
                "('Crisópolis', 5), " +
                "('Cristópolis', 5), " +
                "('Cruz das Almas', 5), " +
                "('Curaçá', 5), " +
                "('Dário Meira', 5), " +
                "('Dias d`Ávila', 5), " +
                "('Dom Basílio', 5), " +
                "('Dom Macedo Costa', 5), " +
                "('Elísio Medrado', 5), " +
                "('Encruzilhada', 5), " +
                "('Entre Rios', 5), " +
                "('Érico Cardoso', 5), " +
                "('Esplanada', 5), " +
                "('Euclides da Cunha', 5), " +
                "('Eunápolis', 5), " +
                "('Fátima', 5), " +
                "('Feira da Mata', 5), " +
                "('Feira de Santana', 5), " +
                "('Filadélfia', 5), " +
                "('Firmino Alves', 5), " +
                "('Floresta Azul', 5), " +
                "('Formosa do Rio Preto', 5), " +
                "('Gandu', 5), " +
                "('Gavião', 5), " +
                "('Gentio do Ouro', 5), " +
                "('Glória', 5), " +
                "('Gongogi', 5), " +
                "('Governador Mangabeira', 5), " +
                "('Guajeru', 5), " +
                "('Guanambi', 5), " +
                "('Guaratinga', 5), " +
                "('Heliópolis', 5), " +
                "('Iaçu', 5), " +
                "('Ibiassucê', 5), " +
                "('Ibicaraí', 5), " +
                "('Ibicoara', 5), " +
                "('Ibicuí', 5), " +
                "('Ibipeba', 5), " +
                "('Ibipitanga', 5), " +
                "('Ibiquera', 5), " +
                "('Ibirapitanga', 5), " +
                "('Ibirapuã', 5), " +
                "('Ibirataia', 5), " +
                "('Ibitiara', 5), " +
                "('Ibititá', 5), " +
                "('Ibotirama', 5), " +
                "('Ichu', 5), " +
                "('Igaporã', 5), " +
                "('Igrapiúna', 5), " +
                "('Iguaí', 5), " +
                "('Ilhéus', 5), " +
                "('Inhambupe', 5), " +
                "('Ipecaetá', 5), " +
                "('Ipiaú', 5), " +
                "('Ipirá', 5), " +
                "('Ipupiara', 5), " +
                "('Irajuba', 5), " +
                "('Iramaia', 5), " +
                "('Iraquara', 5), " +
                "('Irará', 5), " +
                "('Irecê', 5), " +
                "('Itabela', 5), " +
                "('Itaberaba', 5), " +
                "('Itabuna', 5), " +
                "('Itacaré', 5), " +
                "('Itaeté', 5), " +
                "('Itagi', 5), " +
                "('Itagibá', 5), " +
                "('Itagimirim', 5), " +
                "('Itaguaçu da Bahia', 5), " +
                "('Itaju do Colônia', 5), " +
                "('Itajuípe', 5), " +
                "('Itamaraju', 5), " +
                "('Itamari', 5), " +
                "('Itambé', 5), " +
                "('Itanagra', 5), " +
                "('Itanhém', 5), " +
                "('Itaparica', 5), " +
                "('Itapé', 5), " +
                "('Itapebi', 5), " +
                "('Itapetinga', 5), " +
                "('Itapicuru', 5), " +
                "('Itapitanga', 5), " +
                "('Itaquara', 5), " +
                "('Itarantim', 5), " +
                "('Itatim', 5), " +
                "('Itiruçu', 5), " +
                "('Itiúba', 5), " +
                "('Itororó', 5), " +
                "('Ituaçu', 5), " +
                "('Ituberá', 5), " +
                "('Iuiú', 5), " +
                "('Jaborandi', 5), " +
                "('Jacaraci', 5), " +
                "('Jacobina', 5), " +
                "('Jaguaquara', 5), " +
                "('Jaguarari', 5), " +
                "('Jaguaripe', 5), " +
                "('Jandaíra', 5), " +
                "('Jequié', 5), " +
                "('Jeremoabo', 5), " +
                "('Jiquiriçá', 5), " +
                "('Jitaúna', 5), " +
                "('João Dourado', 5), " +
                "('Juazeiro', 5), " +
                "('Jucuruçu', 5), " +
                "('Jussara', 5), " +
                "('Jussari', 5), " +
                "('Jussiape', 5), " +
                "('Lafaiete Coutinho', 5), " +
                "('Lagoa Real', 5), " +
                "('Laje', 5), " +
                "('Lajedão', 5), " +
                "('Lajedinho', 5), " +
                "('Lajedo do Tabocal', 5), " +
                "('Lamarão', 5), " +
                "('Lapão', 5), " +
                "('Lauro de Freitas', 5), " +
                "('Lençóis', 5), " +
                "('Licínio de Almeida', 5), " +
                "('Livramento de Nossa Senhora', 5), " +
                "('Luís Eduardo Magalhães', 5), " +
                "('Macajuba', 5), " +
                "('Macarani', 5), " +
                "('Macaúbas', 5), " +
                "('Macururé', 5), " +
                "('Madre de Deus', 5), " +
                "('Maetinga', 5), " +
                "('Maiquinique', 5), " +
                "('Mairi', 5), " +
                "('Malhada', 5), " +
                "('Malhada de Pedras', 5), " +
                "('Manoel Vitorino', 5), " +
                "('Mansidão', 5), " +
                "('Maracás', 5), " +
                "('Maragogipe', 5), " +
                "('Maraú', 5), " +
                "('Marcionílio Souza', 5), " +
                "('Mascote', 5), " +
                "('Mata de São João', 5), " +
                "('Matina', 5), " +
                "('Medeiros Neto', 5), " +
                "('Miguel Calmon', 5), " +
                "('Milagres', 5), " +
                "('Mirangaba', 5), " +
                "('Mirante', 5), " +
                "('Monte Santo', 5), " +
                "('Morpará', 5), " +
                "('Morro do Chapéu', 5), " +
                "('Mortugaba', 5), " +
                "('Mucugê', 5), " +
                "('Mucuri', 5), " +
                "('Mulungu do Morro', 5), " +
                "('Mundo Novo', 5), " +
                "('Muniz Ferreira', 5), " +
                "('Muquém de São Francisco', 5), " +
                "('Muritiba', 5), " +
                "('Mutuípe', 5), " +
                "('Nazaré', 5), " +
                "('Nilo Peçanha', 5), " +
                "('Nordestina', 5), " +
                "('Nova Canaã', 5), " +
                "('Nova Fátima', 5), " +
                "('Nova Ibiá', 5), " +
                "('Nova Itarana', 5), " +
                "('Nova Redenção', 5), " +
                "('Nova Soure', 5), " +
                "('Nova Viçosa', 5), " +
                "('Novo Horizonte', 5), " +
                "('Novo Triunfo', 5), " +
                "('Olindina', 5), " +
                "('Oliveira dos Brejinhos', 5), " +
                "('Ouriçangas', 5), " +
                "('Ourolândia', 5), " +
                "('Palmas de Monte Alto', 5), " +
                "('Palmeiras', 5), " +
                "('Paramirim', 5), " +
                "('Paratinga', 5), " +
                "('Paripiranga', 5), " +
                "('Pau Brasil', 5), " +
                "('Paulo Afonso', 5), " +
                "('Pé de Serra', 5), " +
                "('Pedrão', 5), " +
                "('Pedro Alexandre', 5), " +
                "('Piatã', 5), " +
                "('Pilão Arcado', 5), " +
                "('Pindaí', 5), " +
                "('Pindobaçu', 5), " +
                "('Pintadas', 5), " +
                "('Piraí do Norte', 5), " +
                "('Piripá', 5), " +
                "('Piritiba', 5), " +
                "('Planaltino', 5), " +
                "('Planalto', 5), " +
                "('Poções', 5), " +
                "('Pojuca', 5), " +
                "('Ponto Novo', 5), " +
                "('Porto Seguro', 5), " +
                "('Potiraguá', 5), " +
                "('Prado', 5), " +
                "('Presidente Dutra', 5), " +
                "('Presidente Jânio Quadros', 5), " +
                "('Presidente Tancredo Neves', 5), " +
                "('Queimadas', 5), " +
                "('Quijingue', 5), " +
                "('Quixabeira', 5), " +
                "('Rafael Jambeiro', 5), " +
                "('Remanso', 5), " +
                "('Retirolândia', 5), " +
                "('Riachão das Neves', 5), " +
                "('Riachão do Jacuípe', 5), " +
                "('Riacho de Santana', 5), " +
                "('Ribeira do Amparo', 5), " +
                "('Ribeira do Pombal', 5), " +
                "('Ribeirão do Largo', 5), " +
                "('Rio de Contas', 5), " +
                "('Rio do Antônio', 5), " +
                "('Rio do Pires', 5), " +
                "('Rio Real', 5), " +
                "('Rodelas', 5), " +
                "('Ruy Barbosa', 5), " +
                "('Salinas da Margarida', 5), " +
                "('Salvador', 5), " +
                "('Santa Bárbara', 5), " +
                "('Santa Brígida', 5), " +
                "('Santa Cruz Cabrália', 5), " +
                "('Santa Cruz da Vitória', 5), " +
                "('Santa Inês', 5), " +
                "('Santa Luzia', 5), " +
                "('Santa Maria da Vitória', 5), " +
                "('Santa Rita de Cássia', 5), " +
                "('Santa Teresinha', 5), " +
                "('Santaluz', 5), " +
                "('Santana', 5), " +
                "('Santanópolis', 5), " +
                "('Santo Amaro', 5), " +
                "('Santo Antônio de Jesus', 5), " +
                "('Santo Estêvão', 5), " +
                "('São Desidério', 5), " +
                "('São Domingos', 5), " +
                "('São Felipe', 5), " +
                "('São Félix', 5), " +
                "('São Félix do Coribe', 5), " +
                "('São Francisco do Conde', 5), " +
                "('São Gabriel', 5), " +
                "('São Gonçalo dos Campos', 5), " +
                "('São José da Vitória', 5), " +
                "('São José do Jacuípe', 5), " +
                "('São Miguel das Matas', 5), " +
                "('São Sebastião do Passé', 5), " +
                "('Sapeaçu', 5), " +
                "('Sátiro Dias', 5), " +
                "('Saubara', 5), " +
                "('Saúde', 5), " +
                "('Seabra', 5), " +
                "('Sebastião Laranjeiras', 5), " +
                "('Senhor do Bonfim', 5), " +
                "('Sento Sé', 5), " +
                "('Serra do Ramalho', 5), " +
                "('Serra Dourada', 5), " +
                "('Serra Preta', 5), " +
                "('Serrinha', 5), " +
                "('Serrolândia', 5), " +
                "('Simões Filho', 5), " +
                "('Sítio do Mato', 5), " +
                "('Sítio do Quinto', 5), " +
                "('Sobradinho', 5), " +
                "('Souto Soares', 5), " +
                "('Tabocas do Brejo Velho', 5), " +
                "('Tanhaçu', 5), " +
                "('Tanque Novo', 5), " +
                "('Tanquinho', 5), " +
                "('Taperoá', 5), " +
                "('Tapiramutá', 5), " +
                "('Teixeira de Freitas', 5), " +
                "('Teodoro Sampaio', 5), " +
                "('Teofilândia', 5), " +
                "('Teolândia', 5), " +
                "('Terra Nova', 5), " +
                "('Tremedal', 5), " +
                "('Tucano', 5), " +
                "('Uauá', 5), " +
                "('Ubaíra', 5), " +
                "('Ubaitaba', 5), " +
                "('Ubatã', 5), " +
                "('Uibaí', 5), " +
                "('Umburanas', 5), " +
                "('Una', 5), " +
                "('Urandi', 5), " +
                "('Uruçuca', 5), " +
                "('Utinga', 5), " +
                "('Valença', 5), " +
                "('Valente', 5), " +
                "('Várzea da Roça', 5), " +
                "('Várzea do Poço', 5), " +
                "('Várzea Nova', 5), " +
                "('Varzedo', 5), " +
                "('Vera Cruz', 5), " +
                "('Vereda', 5), " +
                "('Vitória da Conquista', 5), " +
                "('Wagner', 5), " +
                "('Wanderley', 5), " +
                "('Wenceslau Guimarães', 5), " +
                "('Xique-Xique', 5), " +
                "('Abaiara', 6), " +
                "('Acarape', 6), " +
                "('Acaraú', 6), " +
                "('Acopiara', 6), " +
                "('Aiuaba', 6), " +
                "('Alcântaras', 6), " +
                "('Altaneira', 6), " +
                "('Alto Santo', 6), " +
                "('Amontada', 6), " +
                "('Antonina do Norte', 6), " +
                "('Apuiarés', 6), " +
                "('Aquiraz', 6), " +
                "('Aracati', 6), " +
                "('Aracoiaba', 6), " +
                "('Ararendá', 6), " +
                "('Araripe', 6), " +
                "('Aratuba', 6), " +
                "('Arneiroz', 6), " +
                "('Assaré', 6), " +
                "('Aurora', 6), " +
                "('Baixio', 6), " +
                "('Banabuiú', 6), " +
                "('Barbalha', 6), " +
                "('Barreira', 6), " +
                "('Barro', 6), " +
                "('Barroquinha', 6), " +
                "('Baturité', 6), " +
                "('Beberibe', 6), " +
                "('Bela Cruz', 6), " +
                "('Boa Viagem', 6), " +
                "('Brejo Santo', 6), " +
                "('Camocim', 6), " +
                "('Campos Sales', 6), " +
                "('Canindé', 6), " +
                "('Capistrano', 6), " +
                "('Caridade', 6), " +
                "('Cariré', 6), " +
                "('Caririaçu', 6), " +
                "('Cariús', 6), " +
                "('Carnaubal', 6), " +
                "('Cascavel', 6), " +
                "('Catarina', 6), " +
                "('Catunda', 6), " +
                "('Caucaia', 6), " +
                "('Cedro', 6), " +
                "('Chaval', 6), " +
                "('Choró', 6), " +
                "('Chorozinho', 6), " +
                "('Coreaú', 6), " +
                "('Crateús', 6), " +
                "('Crato', 6), " +
                "('Croatá', 6), " +
                "('Cruz', 6), " +
                "('Deputado Irapuan Pinheiro', 6), " +
                "('Ererê', 6), " +
                "('Eusébio', 6), " +
                "('Farias Brito', 6), " +
                "('Forquilha', 6), " +
                "('Fortaleza', 6), " +
                "('Fortim', 6), " +
                "('Frecheirinha', 6), " +
                "('General Sampaio', 6), " +
                "('Graça', 6), " +
                "('Granja', 6), " +
                "('Granjeiro', 6), " +
                "('Groaíras', 6), " +
                "('Guaiúba', 6), " +
                "('Guaraciaba do Norte', 6), " +
                "('Guaramiranga', 6), " +
                "('Hidrolândia', 6), " +
                "('Horizonte', 6), " +
                "('Ibaretama', 6), " +
                "('Ibiapina', 6), " +
                "('Ibicuitinga', 6), " +
                "('Icapuí', 6), " +
                "('Icó', 6), " +
                "('Iguatu', 6), " +
                "('Independência', 6), " +
                "('Ipaporanga', 6), " +
                "('Ipaumirim', 6), " +
                "('Ipu', 6), " +
                "('Ipueiras', 6), " +
                "('Iracema', 6), " +
                "('Irauçuba', 6), " +
                "('Itaiçaba', 6), " +
                "('Itaitinga', 6), " +
                "('Itapagé', 6), " +
                "('Itapipoca', 6), " +
                "('Itapiúna', 6), " +
                "('Itarema', 6), " +
                "('Itatira', 6), " +
                "('Jaguaretama', 6), " +
                "('Jaguaribara', 6), " +
                "('Jaguaribe', 6), " +
                "('Jaguaruana', 6), " +
                "('Jardim', 6), " +
                "('Jati', 6), " +
                "('Jijoca de Jericoacoara', 6), " +
                "('Juazeiro do Norte', 6), " +
                "('Jucás', 6), " +
                "('Lavras da Mangabeira', 6), " +
                "('Limoeiro do Norte', 6), " +
                "('Madalena', 6), " +
                "('Maracanaú', 6), " +
                "('Maranguape', 6), " +
                "('Marco', 6), " +
                "('Martinópole', 6), " +
                "('Massapê', 6), " +
                "('Mauriti', 6), " +
                "('Meruoca', 6), " +
                "('Milagres', 6), " +
                "('Milhã', 6), " +
                "('Miraíma', 6), " +
                "('Missão Velha', 6), " +
                "('Mombaça', 6), " +
                "('Monsenhor Tabosa', 6), " +
                "('Morada Nova', 6), " +
                "('Moraújo', 6), " +
                "('Morrinhos', 6), " +
                "('Mucambo', 6), " +
                "('Mulungu', 6), " +
                "('Nova Olinda', 6), " +
                "('Nova Russas', 6), " +
                "('Novo Oriente', 6), " +
                "('Ocara', 6), " +
                "('Orós', 6), " +
                "('Pacajus', 6), " +
                "('Pacatuba', 6), " +
                "('Pacoti', 6), " +
                "('Pacujá', 6), " +
                "('Palhano', 6), " +
                "('Palmácia', 6), " +
                "('Paracuru', 6), " +
                "('Paraipaba', 6), " +
                "('Parambu', 6), " +
                "('Paramoti', 6), " +
                "('Pedra Branca', 6), " +
                "('Penaforte', 6), " +
                "('Pentecoste', 6), " +
                "('Pereiro', 6), " +
                "('Pindoretama', 6), " +
                "('Piquet Carneiro', 6), " +
                "('Pires Ferreira', 6), " +
                "('Poranga', 6), " +
                "('Porteiras', 6), " +
                "('Potengi', 6), " +
                "('Potiretama', 6), " +
                "('Quiterianópolis', 6), " +
                "('Quixadá', 6), " +
                "('Quixelô', 6), " +
                "('Quixeramobim', 6), " +
                "('Quixeré', 6), " +
                "('Redenção', 6), " +
                "('Reriutaba', 6), " +
                "('Russas', 6), " +
                "('Saboeiro', 6), " +
                "('Salitre', 6), " +
                "('Santa Quitéria', 6), " +
                "('Santana do Acaraú', 6), " +
                "('Santana do Cariri', 6), " +
                "('São Benedito', 6), " +
                "('São Gonçalo do Amarante', 6), " +
                "('São João do Jaguaribe', 6), " +
                "('São Luís do Curu', 6), " +
                "('Senador Pompeu', 6), " +
                "('Senador Sá', 6), " +
                "('Sobral', 6), " +
                "('Solonópole', 6), " +
                "('Tabuleiro do Norte', 6), " +
                "('Tamboril', 6), " +
                "('Tarrafas', 6), " +
                "('Tauá', 6), " +
                "('Tejuçuoca', 6), " +
                "('Tianguá', 6), " +
                "('Trairi', 6), " +
                "('Tururu', 6), " +
                "('Ubajara', 6), " +
                "('Umari', 6), " +
                "('Umirim', 6), " +
                "('Uruburetama', 6), " +
                "('Uruoca', 6), " +
                "('Varjota', 6), " +
                "('Várzea Alegre', 6), " +
                "('Viçosa do Ceará', 6), " +
                "('Brasília', 7), " +
                "('Abadia de Goiás', 9), " +
                "('Abadiânia', 9), " +
                "('Acreúna', 9), " +
                "('Adelândia', 9), " +
                "('Água Fria de Goiás', 9), " +
                "('Água Limpa', 9), " +
                "('Águas Lindas de Goiás', 9), " +
                "('Alexânia', 9), " +
                "('Aloândia', 9), " +
                "('Alto Horizonte', 9), " +
                "('Alto Paraíso de Goiás', 9), " +
                "('Alvorada do Norte', 9), " +
                "('Amaralina', 9), " +
                "('Americano do Brasil', 9), " +
                "('Amorinópolis', 9), " +
                "('Anápolis', 9), " +
                "('Anhanguera', 9), " +
                "('Anicuns', 9), " +
                "('Aparecida de Goiânia', 9), " +
                "('Aparecida do Rio Doce', 9), " +
                "('Aporé', 9), " +
                "('Araçu', 9), " +
                "('Aragarças', 9), " +
                "('Aragoiânia', 9), " +
                "('Araguapaz', 9), " +
                "('Arenópolis', 9), " +
                "('Aruanã', 9), " +
                "('Aurilândia', 9), " +
                "('Avelinópolis', 9), " +
                "('Baliza', 9), " +
                "('Barro Alto', 9), " +
                "('Bela Vista de Goiás', 9), " +
                "('Bom Jardim de Goiás', 9), " +
                "('Bom Jesus de Goiás', 9), " +
                "('Bonfinópolis', 9), " +
                "('Bonópolis', 9), " +
                "('Brazabrantes', 9), " +
                "('Britânia', 9), " +
                "('Buriti Alegre', 9), " +
                "('Buriti de Goiás', 9), " +
                "('Buritinópolis', 9), " +
                "('Cabeceiras', 9), " +
                "('Cachoeira Alta', 9), " +
                "('Cachoeira de Goiás', 9), " +
                "('Cachoeira Dourada', 9), " +
                "('Caçu', 9), " +
                "('Caiapônia', 9), " +
                "('Caldas Novas', 9), " +
                "('Caldazinha', 9), " +
                "('Campestre de Goiás', 9), " +
                "('Campinaçu', 9), " +
                "('Campinorte', 9), " +
                "('Campo Alegre de Goiás', 9), " +
                "('Campo Limpo de Goiás', 9), " +
                "('Campos Belos', 9), " +
                "('Campos Verdes', 9), " +
                "('Carmo do Rio Verde', 9), " +
                "('Castelândia', 9), " +
                "('Catalão', 9), " +
                "('Caturaí', 9), " +
                "('Cavalcante', 9), " +
                "('Ceres', 9), " +
                "('Cezarina', 9), " +
                "('Chapadão do Céu', 9), " +
                "('Cidade Ocidental', 9), " +
                "('Cocalzinho de Goiás', 9), " +
                "('Colinas do Sul', 9), " +
                "('Córrego do Ouro', 9), " +
                "('Corumbá de Goiás', 9), " +
                "('Corumbaíba', 9), " +
                "('Cristalina', 9), " +
                "('Cristianópolis', 9), " +
                "('Crixás', 9), " +
                "('Cromínia', 9), " +
                "('Cumari', 9), " +
                "('Damianópolis', 9), " +
                "('Damolândia', 9), " +
                "('Davinópolis', 9), " +
                "('Diorama', 9), " +
                "('Divinópolis de Goiás', 9), " +
                "('Doverlândia', 9), " +
                "('Edealina', 9), " +
                "('Edéia', 9), " +
                "('Estrela do Norte', 9), " +
                "('Faina', 9), " +
                "('Fazenda Nova', 9), " +
                "('Firminópolis', 9), " +
                "('Flores de Goiás', 9), " +
                "('Formosa', 9), " +
                "('Formoso', 9), " +
                "('Gameleira de Goiás', 9), " +
                "('Goianápolis', 9), " +
                "('Goiandira', 9), " +
                "('Goianésia', 9), " +
                "('Goiânia', 9), " +
                "('Goianira', 9), " +
                "('Goiás', 9), " +
                "('Goiatuba', 9), " +
                "('Gouvelândia', 9), " +
                "('Guapó', 9), " +
                "('Guaraíta', 9), " +
                "('Guarani de Goiás', 9), " +
                "('Guarinos', 9), " +
                "('Heitoraí', 9), " +
                "('Hidrolândia', 9), " +
                "('Hidrolina', 9), " +
                "('Iaciara', 9), " +
                "('Inaciolândia', 9), " +
                "('Indiara', 9), " +
                "('Inhumas', 9), " +
                "('Ipameri', 9), " +
                "('Ipiranga de Goiás', 9), " +
                "('Iporá', 9), " +
                "('Israelândia', 9), " +
                "('Itaberaí', 9), " +
                "('Itaguari', 9), " +
                "('Itaguaru', 9), " +
                "('Itajá', 9), " +
                "('Itapaci', 9), " +
                "('Itapirapuã', 9), " +
                "('Itapuranga', 9), " +
                "('Itarumã', 9), " +
                "('Itauçu', 9), " +
                "('Itumbiara', 9), " +
                "('Ivolândia', 9), " +
                "('Jandaia', 9), " +
                "('Jaraguá', 9), " +
                "('Jataí', 9), " +
                "('Jaupaci', 9), " +
                "('Jesúpolis', 9), " +
                "('Joviânia', 9), " +
                "('Jussara', 9), " +
                "('Lagoa Santa', 9), " +
                "('Leopoldo de Bulhões', 9), " +
                "('Luziânia', 9), " +
                "('Mairipotaba', 9), " +
                "('Mambaí', 9), " +
                "('Mara Rosa', 9), " +
                "('Marzagão', 9), " +
                "('Matrinchã', 9), " +
                "('Maurilândia', 9), " +
                "('Mimoso de Goiás', 9), " +
                "('Minaçu', 9), " +
                "('Mineiros', 9), " +
                "('Moiporá', 9), " +
                "('Monte Alegre de Goiás', 9), " +
                "('Montes Claros de Goiás', 9), " +
                "('Montividiu', 9), " +
                "('Montividiu do Norte', 9), " +
                "('Morrinhos', 9), " +
                "('Morro Agudo de Goiás', 9), " +
                "('Mossâmedes', 9), " +
                "('Mozarlândia', 9), " +
                "('Mundo Novo', 9), " +
                "('Mutunópolis', 9), " +
                "('Nazário', 9), " +
                "('Nerópolis', 9), " +
                "('Niquelândia', 9), " +
                "('Nova América', 9), " +
                "('Nova Aurora', 9), " +
                "('Nova Crixás', 9), " +
                "('Nova Glória', 9), " +
                "('Nova Iguaçu de Goiás', 9), " +
                "('Nova Roma', 9), " +
                "('Nova Veneza', 9), " +
                "('Novo Brasil', 9), " +
                "('Novo Gama', 9), " +
                "('Novo Planalto', 9), " +
                "('Orizona', 9), " +
                "('Ouro Verde de Goiás', 9), " +
                "('Ouvidor', 9), " +
                "('Padre Bernardo', 9), " +
                "('Palestina de Goiás', 9), " +
                "('Palmeiras de Goiás', 9), " +
                "('Palmelo', 9), " +
                "('Palminópolis', 9), " +
                "('Panamá', 9), " +
                "('Paranaiguara', 9), " +
                "('Paraúna', 9), " +
                "('Perolândia', 9), " +
                "('Petrolina de Goiás', 9), " +
                "('Pilar de Goiás', 9), " +
                "('Piracanjuba', 9), " +
                "('Piranhas', 9), " +
                "('Pirenópolis', 9), " +
                "('Pires do Rio', 9), " +
                "('Planaltina', 9), " +
                "('Pontalina', 9), " +
                "('Porangatu', 9), " +
                "('Porteirão', 9), " +
                "('Portelândia', 9), " +
                "('Posse', 9), " +
                "('Professor Jamil', 9), " +
                "('Quirinópolis', 9), " +
                "('Rialma', 9), " +
                "('Rianápolis', 9), " +
                "('Rio Quente', 9), " +
                "('Rio Verde', 9), " +
                "('Rubiataba', 9), " +
                "('Sanclerlândia', 9), " +
                "('Santa Bárbara de Goiás', 9), " +
                "('Santa Cruz de Goiás', 9), " +
                "('Santa Fé de Goiás', 9), " +
                "('Santa Helena de Goiás', 9), " +
                "('Santa Isabel', 9), " +
                "('Santa Rita do Araguaia', 9), " +
                "('Santa Rita do Novo Destino', 9), " +
                "('Santa Rosa de Goiás', 9), " +
                "('Santa Tereza de Goiás', 9), " +
                "('Santa Terezinha de Goiás', 9), " +
                "('Santo Antônio da Barra', 9), " +
                "('Santo Antônio de Goiás', 9), " +
                "('Santo Antônio do Descoberto', 9), " +
                "('São Domingos', 9), " +
                "('São Francisco de Goiás', 9), " +
                "('São João d`Aliança', 9), " +
                "('São João da Paraúna', 9), " +
                "('São Luís de Montes Belos', 9), " +
                "('São Luíz do Norte', 9), " +
                "('São Miguel do Araguaia', 9), " +
                "('São Miguel do Passa Quatro', 9), " +
                "('São Patrício', 9), " +
                "('São Simão', 9), " +
                "('Senador Canedo', 9), " +
                "('Serranópolis', 9), " +
                "('Silvânia', 9), " +
                "('Simolândia', 9), " +
                "('Sítio d`Abadia', 9), " +
                "('Taquaral de Goiás', 9), " +
                "('Teresina de Goiás', 9), " +
                "('Terezópolis de Goiás', 9), " +
                "('Três Ranchos', 9), " +
                "('Trindade', 9), " +
                "('Trombas', 9), " +
                "('Turvânia', 9), " +
                "('Turvelândia', 9), " +
                "('Uirapuru', 9), " +
                "('Uruaçu', 9), " +
                "('Uruana', 9), " +
                "('Urutaí', 9), " +
                "('Valparaíso de Goiás', 9), " +
                "('Varjão', 9), " +
                "('Vianópolis', 9), " +
                "('Vicentinópolis', 9), " +
                "('Vila Boa', 9), " +
                "('Vila Propício', 9), " +
                "('Açailândia', 10), " +
                "('Afonso Cunha', 10), " +
                "('Água Doce do Maranhão', 10), " +
                "('Alcântara', 10), " +
                "('Aldeias Altas', 10), " +
                "('Altamira do Maranhão', 10), " +
                "('Alto Alegre do Maranhão', 10), " +
                "('Alto Alegre do Pindaré', 10), " +
                "('Alto Parnaíba', 10), " +
                "('Amapá do Maranhão', 10), " +
                "('Amarante do Maranhão', 10), " +
                "('Anajatuba', 10), " +
                "('Anapurus', 10), " +
                "('Apicum-Açu', 10), " +
                "('Araguanã', 10), " +
                "('Araioses', 10), " +
                "('Arame', 10), " +
                "('Arari', 10), " +
                "('Axixá', 10), " +
                "('Bacabal', 10), " +
                "('Bacabeira', 10), " +
                "('Bacuri', 10), " +
                "('Bacurituba', 10), " +
                "('Balsas', 10), " +
                "('Barão de Grajaú', 10), " +
                "('Barra do Corda', 10), " +
                "('Barreirinhas', 10), " +
                "('Bela Vista do Maranhão', 10), " +
                "('Belágua', 10), " +
                "('Benedito Leite', 10), " +
                "('Bequimão', 10), " +
                "('Bernardo do Mearim', 10), " +
                "('Boa Vista do Gurupi', 10), " +
                "('Bom Jardim', 10), " +
                "('Bom Jesus das Selvas', 10), " +
                "('Bom Lugar', 10), " +
                "('Brejo', 10), " +
                "('Brejo de Areia', 10), " +
                "('Buriti', 10), " +
                "('Buriti Bravo', 10), " +
                "('Buriticupu', 10), " +
                "('Buritirana', 10), " +
                "('Cachoeira Grande', 10), " +
                "('Cajapió', 10), " +
                "('Cajari', 10), " +
                "('Campestre do Maranhão', 10), " +
                "('Cândido Mendes', 10), " +
                "('Cantanhede', 10), " +
                "('Capinzal do Norte', 10), " +
                "('Carolina', 10), " +
                "('Carutapera', 10), " +
                "('Caxias', 10), " +
                "('Cedral', 10), " +
                "('Central do Maranhão', 10), " +
                "('Centro do Guilherme', 10), " +
                "('Centro Novo do Maranhão', 10), " +
                "('Chapadinha', 10), " +
                "('Cidelândia', 10), " +
                "('Codó', 10), " +
                "('Coelho Neto', 10), " +
                "('Colinas', 10), " +
                "('Conceição do Lago-Açu', 10), " +
                "('Coroatá', 10), " +
                "('Cururupu', 10), " +
                "('Davinópolis', 10), " +
                "('Dom Pedro', 10), " +
                "('Duque Bacelar', 10), " +
                "('Esperantinópolis', 10), " +
                "('Estreito', 10), " +
                "('Feira Nova do Maranhão', 10), " +
                "('Fernando Falcão', 10), " +
                "('Formosa da Serra Negra', 10), " +
                "('Fortaleza dos Nogueiras', 10), " +
                "('Fortuna', 10), " +
                "('Godofredo Viana', 10), " +
                "('Gonçalves Dias', 10), " +
                "('Governador Archer', 10), " +
                "('Governador Edison Lobão', 10), " +
                "('Governador Eugênio Barros', 10), " +
                "('Governador Luiz Rocha', 10), " +
                "('Governador Newton Bello', 10), " +
                "('Governador Nunes Freire', 10), " +
                "('Graça Aranha', 10), " +
                "('Grajaú', 10), " +
                "('Guimarães', 10), " +
                "('Humberto de Campos', 10), " +
                "('Icatu', 10), " +
                "('Igarapé do Meio', 10), " +
                "('Igarapé Grande', 10), " +
                "('Imperatriz', 10), " +
                "('Itaipava do Grajaú', 10), " +
                "('Itapecuru Mirim', 10), " +
                "('Itinga do Maranhão', 10), " +
                "('Jatobá', 10), " +
                "('Jenipapo dos Vieiras', 10), " +
                "('João Lisboa', 10), " +
                "('Joselândia', 10), " +
                "('Junco do Maranhão', 10), " +
                "('Lago da Pedra', 10), " +
                "('Lago do Junco', 10), " +
                "('Lago dos Rodrigues', 10), " +
                "('Lago Verde', 10), " +
                "('Lagoa do Mato', 10), " +
                "('Lagoa Grande do Maranhão', 10), " +
                "('Lajeado Novo', 10), " +
                "('Lima Campos', 10), " +
                "('Loreto', 10), " +
                "('Luís Domingues', 10), " +
                "('Magalhães de Almeida', 10), " +
                "('Maracaçumé', 10), " +
                "('Marajá do Sena', 10), " +
                "('Maranhãozinho', 10), " +
                "('Mata Roma', 10), " +
                "('Matinha', 10), " +
                "('Matões', 10), " +
                "('Matões do Norte', 10), " +
                "('Milagres do Maranhão', 10), " +
                "('Mirador', 10), " +
                "('Miranda do Norte', 10), " +
                "('Mirinzal', 10), " +
                "('Monção', 10), " +
                "('Montes Altos', 10), " +
                "('Morros', 10), " +
                "('Nina Rodrigues', 10), " +
                "('Nova Colinas', 10), " +
                "('Nova Iorque', 10), " +
                "('Nova Olinda do Maranhão', 10), " +
                "('Olho d`Água das Cunhãs', 10), " +
                "('Olinda Nova do Maranhão', 10), " +
                "('Paço do Lumiar', 10), " +
                "('Palmeirândia', 10), " +
                "('Paraibano', 10), " +
                "('Parnarama', 10), " +
                "('Passagem Franca', 10), " +
                "('Pastos Bons', 10), " +
                "('Paulino Neves', 10), " +
                "('Paulo Ramos', 10), " +
                "('Pedreiras', 10), " +
                "('Pedro do Rosário', 10), " +
                "('Penalva', 10), " +
                "('Peri Mirim', 10), " +
                "('Peritoró', 10), " +
                "('Pindaré-Mirim', 10), " +
                "('Pinheiro', 10), " +
                "('Pio XII', 10), " +
                "('Pirapemas', 10), " +
                "('Poção de Pedras', 10), " +
                "('Porto Franco', 10), " +
                "('Porto Rico do Maranhão', 10), " +
                "('Presidente Dutra', 10), " +
                "('Presidente Juscelino', 10), " +
                "('Presidente Médici', 10), " +
                "('Presidente Sarney', 10), " +
                "('Presidente Vargas', 10), " +
                "('Primeira Cruz', 10), " +
                "('Raposa', 10), " +
                "('Riachão', 10), " +
                "('Ribamar Fiquene', 10), " +
                "('Rosário', 10), " +
                "('Sambaíba', 10), " +
                "('Santa Filomena do Maranhão', 10), " +
                "('Santa Helena', 10), " +
                "('Santa Inês', 10), " +
                "('Santa Luzia', 10), " +
                "('Santa Luzia do Paruá', 10), " +
                "('Santa Quitéria do Maranhão', 10), " +
                "('Santa Rita', 10), " +
                "('Santana do Maranhão', 10), " +
                "('Santo Amaro do Maranhão', 10), " +
                "('Santo Antônio dos Lopes', 10), " +
                "('São Benedito do Rio Preto', 10), " +
                "('São Bento', 10), " +
                "('São Bernardo', 10), " +
                "('São Domingos do Azeitão', 10), " +
                "('São Domingos do Maranhão', 10), " +
                "('São Félix de Balsas', 10), " +
                "('São Francisco do Brejão', 10), " +
                "('São Francisco do Maranhão', 10), " +
                "('São João Batista', 10), " +
                "('São João do Carú', 10), " +
                "('São João do Paraíso', 10), " +
                "('São João do Soter', 10), " +
                "('São João dos Patos', 10), " +
                "('São José de Ribamar', 10), " +
                "('São José dos Basílios', 10), " +
                "('São Luís', 10), " +
                "('São Luís Gonzaga do Maranhão', 10), " +
                "('São Mateus do Maranhão', 10), " +
                "('São Pedro da Água Branca', 10), " +
                "('São Pedro dos Crentes', 10), " +
                "('São Raimundo das Mangabeiras', 10), " +
                "('São Raimundo do Doca Bezerra', 10), " +
                "('São Roberto', 10), " +
                "('São Vicente Ferrer', 10), " +
                "('Satubinha', 10), " +
                "('Senador Alexandre Costa', 10), " +
                "('Senador La Rocque', 10), " +
                "('Serrano do Maranhão', 10), " +
                "('Sítio Novo', 10), " +
                "('Sucupira do Norte', 10), " +
                "('Sucupira do Riachão', 10), " +
                "('Tasso Fragoso', 10), " +
                "('Timbiras', 10), " +
                "('Timon', 10), " +
                "('Trizidela do Vale', 10), " +
                "('Tufilândia', 10), " +
                "('Tuntum', 10), " +
                "('Turiaçu', 10), " +
                "('Turilândia', 10), " +
                "('Tutóia', 10), " +
                "('Urbano Santos', 10), " +
                "('Vargem Grande', 10), " +
                "('Viana', 10), " +
                "('Vila Nova dos Martírios', 10), " +
                "('Vitória do Mearim', 10), " +
                "('Vitorino Freire', 10), " +
                "('Zé Doca', 10), " +
                "('Acorizal', 13), " +
                "('Água Boa', 13), " +
                "('Alta Floresta', 13), " +
                "('Alto Araguaia', 13), " +
                "('Alto Boa Vista', 13), " +
                "('Alto Garças', 13), " +
                "('Alto Paraguai', 13), " +
                "('Alto Taquari', 13), " +
                "('Apiacás', 13), " +
                "('Araguaiana', 13), " +
                "('Araguainha', 13), " +
                "('Araputanga', 13), " +
                "('Arenápolis', 13), " +
                "('Aripuanã', 13), " +
                "('Barão de Melgaço', 13), " +
                "('Barra do Bugres', 13), " +
                "('Barra do Garças', 13), " +
                "('Bom Jesus do Araguaia', 13), " +
                "('Brasnorte', 13), " +
                "('Cáceres', 13), " +
                "('Campinápolis', 13), " +
                "('Campo Novo do Parecis', 13), " +
                "('Campo Verde', 13), " +
                "('Campos de Júlio', 13), " +
                "('Canabrava do Norte', 13), " +
                "('Canarana', 13), " +
                "('Carlinda', 13), " +
                "('Castanheira', 13), " +
                "('Chapada dos Guimarães', 13), " +
                "('Cláudia', 13), " +
                "('Cocalinho', 13), " +
                "('Colíder', 13), " +
                "('Colniza', 13), " +
                "('Comodoro', 13), " +
                "('Confresa', 13), " +
                "('Conquista d`Oeste', 13), " +
                "('Cotriguaçu', 13), " +
                "('Cuiabá', 13), " +
                "('Curvelândia', 13), " +
                "('Curvelândia', 13), " +
                "('Denise', 13), " +
                "('Diamantino', 13), " +
                "('Dom Aquino', 13), " +
                "('Feliz Natal', 13), " +
                "('Figueirópolis d`Oeste', 13), " +
                "('Gaúcha do Norte', 13), " +
                "('General Carneiro', 13), " +
                "('Glória d`Oeste', 13), " +
                "('Guarantã do Norte', 13), " +
                "('Guiratinga', 13), " +
                "('Indiavaí', 13), " +
                "('Ipiranga do Norte', 13), " +
                "('Itanhangá', 13), " +
                "('Itaúba', 13), " +
                "('Itiquira', 13), " +
                "('Jaciara', 13), " +
                "('Jangada', 13), " +
                "('Jauru', 13), " +
                "('Juara', 13), " +
                "('Juína', 13), " +
                "('Juruena', 13), " +
                "('Juscimeira', 13), " +
                "('Lambari d`Oeste', 13), " +
                "('Lucas do Rio Verde', 13), " +
                "('Luciára', 13), " +
                "('Marcelândia', 13), " +
                "('Matupá', 13), " +
                "('Mirassol d`Oeste', 13), " +
                "('Nobres', 13), " +
                "('Nortelândia', 13), " +
                "('Nossa Senhora do Livramento', 13), " +
                "('Nova Bandeirantes', 13), " +
                "('Nova Brasilândia', 13), " +
                "('Nova Canaã do Norte', 13), " +
                "('Nova Guarita', 13), " +
                "('Nova Lacerda', 13), " +
                "('Nova Marilândia', 13), " +
                "('Nova Maringá', 13), " +
                "('Nova Monte verde', 13), " +
                "('Nova Mutum', 13), " +
                "('Nova Olímpia', 13), " +
                "('Nova Santa Helena', 13), " +
                "('Nova Ubiratã', 13), " +
                "('Nova Xavantina', 13), " +
                "('Novo Horizonte do Norte', 13), " +
                "('Novo Mundo', 13), " +
                "('Novo Santo Antônio', 13), " +
                "('Novo São Joaquim', 13), " +
                "('Paranaíta', 13), " +
                "('Paranatinga', 13), " +
                "('Pedra Preta', 13), " +
                "('Peixoto de Azevedo', 13), " +
                "('Planalto da Serra', 13), " +
                "('Poconé', 13), " +
                "('Pontal do Araguaia', 13), " +
                "('Ponte Branca', 13), " +
                "('Pontes e Lacerda', 13), " +
                "('Porto Alegre do Norte', 13), " +
                "('Porto dos Gaúchos', 13), " +
                "('Porto Esperidião', 13), " +
                "('Porto Estrela', 13), " +
                "('Poxoréo', 13), " +
                "('Primavera do Leste', 13), " +
                "('Querência', 13), " +
                "('Reserva do Cabaçal', 13), " +
                "('Ribeirão Cascalheira', 13), " +
                "('Ribeirãozinho', 13), " +
                "('Rio Branco', 13), " +
                "('Rondolândia', 13), " +
                "('Rondonópolis', 13), " +
                "('Rosário Oeste', 13), " +
                "('Salto do Céu', 13), " +
                "('Santa Carmem', 13), " +
                "('Santa Cruz do Xingu', 13), " +
                "('Santa Rita do Trivelato', 13), " +
                "('Santa Terezinha', 13), " +
                "('Santo Afonso', 13), " +
                "('Santo Antônio do Leste', 13), " +
                "('Santo Antônio do Leverger', 13), " +
                "('São Félix do Araguaia', 13), " +
                "('São José do Povo', 13), " +
                "('São José do Rio Claro', 13), " +
                "('São José do Xingu', 13), " +
                "('São José dos Quatro Marcos', 13), " +
                "('São Pedro da Cipa', 13), " +
                "('Sapezal', 13), " +
                "('Serra Nova Dourada', 13), " +
                "('Sinop', 13), " +
                "('Sorriso', 13), " +
                "('Tabaporã', 13), " +
                "('Tangará da Serra', 13), " +
                "('Tapurah', 13), " +
                "('Terra Nova do Norte', 13), " +
                "('Tesouro', 13), " +
                "('Torixoréu', 13), " +
                "('União do Sul', 13), " +
                "('Vale de São Domingos', 13), " +
                "('Várzea Grande', 13), " +
                "('Vera', 13), " +
                "('Vila Bela da Santíssima Trindade', 13), " +
                "('Vila Rica', 13), " +
                "('Água Clara', 12), " +
                "('Alcinópolis', 12), " +
                "('Amambaí', 12), " +
                "('Anastácio', 12), " +
                "('Anaurilândia', 12), " +
                "('Angélica', 12), " +
                "('Antônio João', 12), " +
                "('Aparecida do Taboado', 12), " +
                "('Aquidauana', 12), " +
                "('Aral Moreira', 12), " +
                "('Bandeirantes', 12), " +
                "('Bataguassu', 12), " +
                "('Bataiporã', 12), " +
                "('Bela Vista', 12), " +
                "('Bodoquena', 12), " +
                "('Bonito', 12), " +
                "('Brasilândia', 12), " +
                "('Caarapó', 12), " +
                "('Camapuã', 12), " +
                "('Campo Grande', 12), " +
                "('Caracol', 12), " +
                "('Cassilândia', 12), " +
                "('Chapadão do Sul', 12), " +
                "('Corguinho', 12), " +
                "('Coronel Sapucaia', 12), " +
                "('Corumbá', 12), " +
                "('Costa Rica', 12), " +
                "('Coxim', 12), " +
                "('Deodápolis', 12), " +
                "('Dois Irmãos do Buriti', 12), " +
                "('Douradina', 12), " +
                "('Dourados', 12), " +
                "('Eldorado', 12), " +
                "('Fátima do Sul', 12), " +
                "('Figueirão', 12), " +
                "('Glória de Dourados', 12), " +
                "('Guia Lopes da Laguna', 12), " +
                "('Iguatemi', 12), " +
                "('Inocência', 12), " +
                "('Itaporã', 12), " +
                "('Itaquiraí', 12), " +
                "('Ivinhema', 12), " +
                "('Japorã', 12), " +
                "('Jaraguari', 12), " +
                "('Jardim', 12), " +
                "('Jateí', 12), " +
                "('Juti', 12), " +
                "('Ladário', 12), " +
                "('Laguna Carapã', 12), " +
                "('Maracaju', 12), " +
                "('Miranda', 12), " +
                "('Mundo Novo', 12), " +
                "('Naviraí', 12), " +
                "('Nioaque', 12), " +
                "('Nova Alvorada do Sul', 12), " +
                "('Nova Andradina', 12), " +
                "('Novo Horizonte do Sul', 12), " +
                "('Paranaíba', 12), " +
                "('Paranhos', 12), " +
                "('Pedro Gomes', 12), " +
                "('Ponta Porã', 12), " +
                "('Porto Murtinho', 12), " +
                "('Ribas do Rio Pardo', 12), " +
                "('Rio Brilhante', 12), " +
                "('Rio Negro', 12), " +
                "('Rio Verde de Mato Grosso', 12), " +
                "('Rochedo', 12), " +
                "('Santa Rita do Pardo', 12), " +
                "('São Gabriel do Oeste', 12), " +
                "('Selvíria', 12), " +
                "('Sete Quedas', 12), " +
                "('Sidrolândia', 12), " +
                "('Sonora', 12), " +
                "('Tacuru', 12), " +
                "('Taquarussu', 12), " +
                "('Terenos', 12), " +
                "('Três Lagoas', 12), " +
                "('Vicentina', 12), " +
                "('Abadia dos Dourados', 11), " +
                "('Abaeté', 11), " +
                "('Abre Campo', 11), " +
                "('Acaiaca', 11), " +
                "('Açucena', 11), " +
                "('Água Boa', 11), " +
                "('Água Comprida', 11), " +
                "('Aguanil', 11), " +
                "('Águas Formosas', 11), " +
                "('Águas Vermelhas', 11), " +
                "('Aimorés', 11), " +
                "('Aiuruoca', 11), " +
                "('Alagoa', 11), " +
                "('Albertina', 11), " +
                "('Além Paraíba', 11), " +
                "('Alfenas', 11), " +
                "('Alfredo Vasconcelos', 11), " +
                "('Almenara', 11), " +
                "('Alpercata', 11), " +
                "('Alpinópolis', 11), " +
                "('Alterosa', 11), " +
                "('Alto Caparaó', 11), " +
                "('Alto Jequitibá', 11), " +
                "('Alto Rio Doce', 11), " +
                "('Alvarenga', 11), " +
                "('Alvinópolis', 11), " +
                "('Alvorada de Minas', 11), " +
                "('Amparo do Serra', 11), " +
                "('Andradas', 11), " +
                "('Andrelândia', 11), " +
                "('Angelândia', 11), " +
                "('Antônio Carlos', 11), " +
                "('Antônio Dias', 11), " +
                "('Antônio Prado de Minas', 11), " +
                "('Araçaí', 11), " +
                "('Aracitaba', 11), " +
                "('Araçuaí', 11), " +
                "('Araguari', 11), " +
                "('Arantina', 11), " +
                "('Araponga', 11), " +
                "('Araporã', 11), " +
                "('Arapuá', 11), " +
                "('Araújos', 11), " +
                "('Araxá', 11), " +
                "('Arceburgo', 11), " +
                "('Arcos', 11), " +
                "('Areado', 11), " +
                "('Argirita', 11), " +
                "('Aricanduva', 11), " +
                "('Arinos', 11), " +
                "('Astolfo Dutra', 11), " +
                "('Ataléia', 11), " +
                "('Augusto de Lima', 11), " +
                "('Baependi', 11), " +
                "('Baldim', 11), " +
                "('Bambuí', 11), " +
                "('Bandeira', 11), " +
                "('Bandeira do Sul', 11), " +
                "('Barão de Cocais', 11), " +
                "('Barão de Monte Alto', 11), " +
                "('Barbacena', 11), " +
                "('Barra Longa', 11), " +
                "('Barroso', 11), " +
                "('Bela Vista de Minas', 11), " +
                "('Belmiro Braga', 11), " +
                "('Belo Horizonte', 11), " +
                "('Belo Oriente', 11), " +
                "('Belo Vale', 11), " +
                "('Berilo', 11), " +
                "('Berizal', 11), " +
                "('Bertópolis', 11), " +
                "('Betim', 11), " +
                "('Bias Fortes', 11), " +
                "('Bicas', 11), " +
                "('Biquinhas', 11), " +
                "('Boa Esperança', 11), " +
                "('Bocaina de Minas', 11), " +
                "('Bocaiúva', 11), " +
                "('Bom Despacho', 11), " +
                "('Bom Jardim de Minas', 11), " +
                "('Bom Jesus da Penha', 11), " +
                "('Bom Jesus do Amparo', 11), " +
                "('Bom Jesus do Galho', 11), " +
                "('Bom Repouso', 11), " +
                "('Bom Sucesso', 11), " +
                "('Bonfim', 11), " +
                "('Bonfinópolis de Minas', 11), " +
                "('Bonito de Minas', 11), " +
                "('Borda da Mata', 11), " +
                "('Botelhos', 11), " +
                "('Botumirim', 11), " +
                "('Brás Pires', 11), " +
                "('Brasilândia de Minas', 11), " +
                "('Brasília de Minas', 11), " +
                "('Brasópolis', 11), " +
                "('Braúnas', 11), " +
                "('Brumadinho', 11), " +
                "('Bueno Brandão', 11), " +
                "('Buenópolis', 11), " +
                "('Bugre', 11), " +
                "('Buritis', 11), " +
                "('Buritizeiro', 11), " +
                "('Cabeceira Grande', 11), " +
                "('Cabo Verde', 11), " +
                "('Cachoeira da Prata', 11), " +
                "('Cachoeira de Minas', 11), " +
                "('Cachoeira de Pajeú', 11), " +
                "('Cachoeira Dourada', 11), " +
                "('Caetanópolis', 11), " +
                "('Caeté', 11), " +
                "('Caiana', 11), " +
                "('Cajuri', 11), " +
                "('Caldas', 11), " +
                "('Camacho', 11), " +
                "('Camanducaia', 11), " +
                "('Cambuí', 11), " +
                "('Cambuquira', 11), " +
                "('Campanário', 11), " +
                "('Campanha', 11), " +
                "('Campestre', 11), " +
                "('Campina Verde', 11), " +
                "('Campo Azul', 11), " +
                "('Campo Belo', 11), " +
                "('Campo do Meio', 11), " +
                "('Campo Florido', 11), " +
                "('Campos Altos', 11), " +
                "('Campos Gerais', 11), " +
                "('Cana Verde', 11), " +
                "('Canaã', 11), " +
                "('Canápolis', 11), " +
                "('Candeias', 11), " +
                "('Cantagalo', 11), " +
                "('Caparaó', 11), " +
                "('Capela Nova', 11), " +
                "('Capelinha', 11), " +
                "('Capetinga', 11), " +
                "('Capim Branco', 11), " +
                "('Capinópolis', 11), " +
                "('Capitão Andrade', 11), " +
                "('Capitão Enéas', 11), " +
                "('Capitólio', 11), " +
                "('Caputira', 11), " +
                "('Caraí', 11), " +
                "('Caranaíba', 11), " +
                "('Carandaí', 11), " +
                "('Carangola', 11), " +
                "('Caratinga', 11), " +
                "('Carbonita', 11), " +
                "('Careaçu', 11), " +
                "('Carlos Chagas', 11), " +
                "('Carmésia', 11), " +
                "('Carmo da Cachoeira', 11), " +
                "('Carmo da Mata', 11), " +
                "('Carmo de Minas', 11), " +
                "('Carmo do Cajuru', 11), " +
                "('Carmo do Paranaíba', 11), " +
                "('Carmo do Rio Claro', 11), " +
                "('Carmópolis de Minas', 11), " +
                "('Carneirinho', 11), " +
                "('Carrancas', 11), " +
                "('Carvalhópolis', 11), " +
                "('Carvalhos', 11), " +
                "('Casa Grande', 11), " +
                "('Cascalho Rico', 11), " +
                "('Cássia', 11), " +
                "('Cataguases', 11), " +
                "('Catas Altas', 11), " +
                "('Catas Altas da Noruega', 11), " +
                "('Catuji', 11), " +
                "('Catuti', 11), " +
                "('Caxambu', 11), " +
                "('Cedro do Abaeté', 11), " +
                "('Central de Minas', 11), " +
                "('Centralina', 11), " +
                "('Chácara', 11), " +
                "('Chalé', 11), " +
                "('Chapada do Norte', 11), " +
                "('Chapada Gaúcha', 11), " +
                "('Chiador', 11), " +
                "('Cipotânea', 11), " +
                "('Claraval', 11), " +
                "('Claro dos Poções', 11), " +
                "('Cláudio', 11), " +
                "('Coimbra', 11), " +
                "('Coluna', 11), " +
                "('Comendador Gomes', 11), " +
                "('Comercinho', 11), " +
                "('Conceição da Aparecida', 11), " +
                "('Conceição da Barra de Minas', 11), " +
                "('Conceição das Alagoas', 11), " +
                "('Conceição das Pedras', 11), " +
                "('Conceição de Ipanema', 11), " +
                "('Conceição do Mato Dentro', 11), " +
                "('Conceição do Pará', 11), " +
                "('Conceição do Rio Verde', 11), " +
                "('Conceição dos Ouros', 11), " +
                "('Cônego Marinho', 11), " +
                "('Confins', 11), " +
                "('Congonhal', 11), " +
                "('Congonhas', 11), " +
                "('Congonhas do Norte', 11), " +
                "('Conquista', 11), " +
                "('Conselheiro Lafaiete', 11), " +
                "('Conselheiro Pena', 11), " +
                "('Consolação', 11), " +
                "('Contagem', 11), " +
                "('Coqueiral', 11), " +
                "('Coração de Jesus', 11), " +
                "('Cordisburgo', 11), " +
                "('Cordislândia', 11), " +
                "('Corinto', 11), " +
                "('Coroaci', 11), " +
                "('Coromandel', 11), " +
                "('Coronel Fabriciano', 11), " +
                "('Coronel Murta', 11), " +
                "('Coronel Pacheco', 11), " +
                "('Coronel Xavier Chaves', 11), " +
                "('Córrego Danta', 11), " +
                "('Córrego do Bom Jesus', 11), " +
                "('Córrego Fundo', 11), " +
                "('Córrego Novo', 11), " +
                "('Couto de Magalhães de Minas', 11), " +
                "('Crisólita', 11), " +
                "('Cristais', 11), " +
                "('Cristália', 11), " +
                "('Cristiano Otoni', 11), " +
                "('Cristina', 11), " +
                "('Crucilândia', 11), " +
                "('Cruzeiro da Fortaleza', 11), " +
                "('Cruzília', 11), " +
                "('Cuparaque', 11), " +
                "('Curral de Dentro', 11), " +
                "('Curvelo', 11), " +
                "('Datas', 11), " +
                "('Delfim Moreira', 11), " +
                "('Delfinópolis', 11), " +
                "('Delta', 11), " +
                "('Descoberto', 11), " +
                "('Desterro de Entre Rios', 11), " +
                "('Desterro do Melo', 11), " +
                "('Diamantina', 11), " +
                "('Diogo de Vasconcelos', 11), " +
                "('Dionísio', 11), " +
                "('Divinésia', 11), " +
                "('Divino', 11), " +
                "('Divino das Laranjeiras', 11), " +
                "('Divinolândia de Minas', 11), " +
                "('Divinópolis', 11), " +
                "('Divisa Alegre', 11), " +
                "('Divisa Nova', 11), " +
                "('Divisópolis', 11), " +
                "('Dom Bosco', 11), " +
                "('Dom Cavati', 11), " +
                "('Dom Joaquim', 11), " +
                "('Dom Silvério', 11), " +
                "('Dom Viçoso', 11), " +
                "('Dona Eusébia', 11), " +
                "('Dores de Campos', 11), " +
                "('Dores de Guanhães', 11), " +
                "('Dores do Indaiá', 11), " +
                "('Dores do Turvo', 11), " +
                "('Doresópolis', 11), " +
                "('Douradoquara', 11), " +
                "('Durandé', 11), " +
                "('Elói Mendes', 11), " +
                "('Engenheiro Caldas', 11), " +
                "('Engenheiro Navarro', 11), " +
                "('Entre Folhas', 11), " +
                "('Entre Rios de Minas', 11), " +
                "('Ervália', 11), " +
                "('Esmeraldas', 11), " +
                "('Espera Feliz', 11), " +
                "('Espinosa', 11), " +
                "('Espírito Santo do Dourado', 11), " +
                "('Estiva', 11), " +
                "('Estrela Dalva', 11), " +
                "('Estrela do Indaiá', 11), " +
                "('Estrela do Sul', 11), " +
                "('Eugenópolis', 11), " +
                "('Ewbank da Câmara', 11), " +
                "('Extrema', 11), " +
                "('Fama', 11), " +
                "('Faria Lemos', 11), " +
                "('Felício dos Santos', 11), " +
                "('Felisburgo', 11), " +
                "('Felixlândia', 11), " +
                "('Fernandes Tourinho', 11), " +
                "('Ferros', 11), " +
                "('Fervedouro', 11), " +
                "('Florestal', 11), " +
                "('Formiga', 11), " +
                "('Formoso', 11), " +
                "('Fortaleza de Minas', 11), " +
                "('Fortuna de Minas', 11), " +
                "('Francisco Badaró', 11), " +
                "('Francisco Dumont', 11), " +
                "('Francisco Sá', 11), " +
                "('Franciscópolis', 11), " +
                "('Frei Gaspar', 11), " +
                "('Frei Inocêncio', 11), " +
                "('Frei Lagonegro', 11), " +
                "('Fronteira', 11), " +
                "('Fronteira dos Vales', 11), " +
                "('Fruta de Leite', 11), " +
                "('Frutal', 11), " +
                "('Funilândia', 11), " +
                "('Galiléia', 11), " +
                "('Gameleiras', 11), " +
                "('Glaucilândia', 11), " +
                "('Goiabeira', 11), " +
                "('Goianá', 11), " +
                "('Gonçalves', 11), " +
                "('Gonzaga', 11), " +
                "('Gouveia', 11), " +
                "('Governador Valadares', 11), " +
                "('Grão Mogol', 11), " +
                "('Grupiara', 11), " +
                "('Guanhães', 11), " +
                "('Guapé', 11), " +
                "('Guaraciaba', 11), " +
                "('Guaraciama', 11), " +
                "('Guaranésia', 11), " +
                "('Guarani', 11), " +
                "('Guarará', 11), " +
                "('Guarda-Mor', 11), " +
                "('Guaxupé', 11), " +
                "('Guidoval', 11), " +
                "('Guimarânia', 11), " +
                "('Guiricema', 11), " +
                "('Gurinhatã', 11), " +
                "('Heliodora', 11), " +
                "('Iapu', 11), " +
                "('Ibertioga', 11), " +
                "('Ibiá', 11), " +
                "('Ibiaí', 11), " +
                "('Ibiracatu', 11), " +
                "('Ibiraci', 11), " +
                "('Ibirité', 11), " +
                "('Ibitiúra de Minas', 11), " +
                "('Ibituruna', 11), " +
                "('Icaraí de Minas', 11), " +
                "('Igarapé', 11), " +
                "('Igaratinga', 11), " +
                "('Iguatama', 11), " +
                "('Ijaci', 11), " +
                "('Ilicínea', 11), " +
                "('Imbé de Minas', 11), " +
                "('Inconfidentes', 11), " +
                "('Indaiabira', 11), " +
                "('Indianópolis', 11), " +
                "('Ingaí', 11), " +
                "('Inhapim', 11), " +
                "('Inhaúma', 11), " +
                "('Inimutaba', 11), " +
                "('Ipaba', 11), " +
                "('Ipanema', 11), " +
                "('Ipatinga', 11), " +
                "('Ipiaçu', 11), " +
                "('Ipuiúna', 11), " +
                "('Iraí de Minas', 11), " +
                "('Itabira', 11), " +
                "('Itabirinha de Mantena', 11), " +
                "('Itabirito', 11), " +
                "('Itacambira', 11), " +
                "('Itacarambi', 11), " +
                "('Itaguara', 11), " +
                "('Itaipé', 11), " +
                "('Itajubá', 11), " +
                "('Itamarandiba', 11), " +
                "('Itamarati de Minas', 11), " +
                "('Itambacuri', 11), " +
                "('Itambé do Mato Dentro', 11), " +
                "('Itamogi', 11), " +
                "('Itamonte', 11), " +
                "('Itanhandu', 11), " +
                "('Itanhomi', 11), " +
                "('Itaobim', 11), " +
                "('Itapagipe', 11), " +
                "('Itapecerica', 11), " +
                "('Itapeva', 11), " +
                "('Itatiaiuçu', 11), " +
                "('Itaú de Minas', 11), " +
                "('Itaúna', 11), " +
                "('Itaverava', 11), " +
                "('Itinga', 11), " +
                "('Itueta', 11), " +
                "('Ituiutaba', 11), " +
                "('Itumirim', 11), " +
                "('Iturama', 11), " +
                "('Itutinga', 11), " +
                "('Jaboticatubas', 11), " +
                "('Jacinto', 11), " +
                "('Jacuí', 11), " +
                "('Jacutinga', 11), " +
                "('Jaguaraçu', 11), " +
                "('Jaíba', 11), " +
                "('Jampruca', 11), " +
                "('Janaúba', 11), " +
                "('Januária', 11), " +
                "('Japaraíba', 11), " +
                "('Japonvar', 11), " +
                "('Jeceaba', 11), " +
                "('Jenipapo de Minas', 11), " +
                "('Jequeri', 11), " +
                "('Jequitaí', 11), " +
                "('Jequitibá', 11), " +
                "('Jequitinhonha', 11), " +
                "('Jesuânia', 11), " +
                "('Joaíma', 11), " +
                "('Joanésia', 11), " +
                "('João Monlevade', 11), " +
                "('João Pinheiro', 11), " +
                "('Joaquim Felício', 11), " +
                "('Jordânia', 11), " +
                "('José Gonçalves de Minas', 11), " +
                "('José Raydan', 11), " +
                "('Josenópolis', 11), " +
                "('Juatuba', 11), " +
                "('Juiz de Fora', 11), " +
                "('Juramento', 11), " +
                "('Juruaia', 11), " +
                "('Juvenília', 11), " +
                "('Ladainha', 11), " +
                "('Lagamar', 11), " +
                "('Lagoa da Prata', 11), " +
                "('Lagoa dos Patos', 11), " +
                "('Lagoa Dourada', 11), " +
                "('Lagoa Formosa', 11), " +
                "('Lagoa Grande', 11), " +
                "('Lagoa Santa', 11), " +
                "('Lajinha', 11), " +
                "('Lambari', 11), " +
                "('Lamim', 11), " +
                "('Laranjal', 11), " +
                "('Lassance', 11), " +
                "('Lavras', 11), " +
                "('Leandro Ferreira', 11), " +
                "('Leme do Prado', 11), " +
                "('Leopoldina', 11), " +
                "('Liberdade', 11), " +
                "('Lima Duarte', 11), " +
                "('Limeira do Oeste', 11), " +
                "('Lontra', 11), " +
                "('Luisburgo', 11), " +
                "('Luislândia', 11), " +
                "('Luminárias', 11), " +
                "('Luz', 11), " +
                "('Machacalis', 11), " +
                "('Machado', 11), " +
                "('Madre de Deus de Minas', 11), " +
                "('Malacacheta', 11), " +
                "('Mamonas', 11), " +
                "('Manga', 11), " +
                "('Manhuaçu', 11), " +
                "('Manhumirim', 11), " +
                "('Mantena', 11), " +
                "('Mar de Espanha', 11), " +
                "('Maravilhas', 11), " +
                "('Maria da Fé', 11), " +
                "('Mariana', 11), " +
                "('Marilac', 11), " +
                "('Mário Campos', 11), " +
                "('Maripá de Minas', 11), " +
                "('Marliéria', 11), " +
                "('Marmelópolis', 11), " +
                "('Martinho Campos', 11), " +
                "('Martins Soares', 11), " +
                "('Mata Verde', 11), " +
                "('Materlândia', 11), " +
                "('Mateus Leme', 11), " +
                "('Mathias Lobato', 11), " +
                "('Matias Barbosa', 11), " +
                "('Matias Cardoso', 11), " +
                "('Matipó', 11), " +
                "('Mato Verde', 11), " +
                "('Matozinhos', 11), " +
                "('Matutina', 11), " +
                "('Medeiros', 11), " +
                "('Medina', 11), " +
                "('Mendes Pimentel', 11), " +
                "('Mercês', 11), " +
                "('Mesquita', 11), " +
                "('Minas Novas', 11), " +
                "('Minduri', 11), " +
                "('Mirabela', 11), " +
                "('Miradouro', 11), " +
                "('Miraí', 11), " +
                "('Miravânia', 11), " +
                "('Moeda', 11), " +
                "('Moema', 11), " +
                "('Monjolos', 11), " +
                "('Monsenhor Paulo', 11), " +
                "('Montalvânia', 11), " +
                "('Monte Alegre de Minas', 11), " +
                "('Monte Azul', 11), " +
                "('Monte Belo', 11), " +
                "('Monte Carmelo', 11), " +
                "('Monte Formoso', 11), " +
                "('Monte Santo de Minas', 11), " +
                "('Monte Sião', 11), " +
                "('Montes Claros', 11), " +
                "('Montezuma', 11), " +
                "('Morada Nova de Minas', 11), " +
                "('Morro da Garça', 11), " +
                "('Morro do Pilar', 11), " +
                "('Munhoz', 11), " +
                "('Muriaé', 11), " +
                "('Mutum', 11), " +
                "('Muzambinho', 11), " +
                "('Nacip Raydan', 11), " +
                "('Nanuque', 11), " +
                "('Naque', 11), " +
                "('Natalândia', 11), " +
                "('Natércia', 11), " +
                "('Nazareno', 11), " +
                "('Nepomuceno', 11), " +
                "('Ninheira', 11), " +
                "('Nova Belém', 11), " +
                "('Nova Era', 11), " +
                "('Nova Lima', 11), " +
                "('Nova Módica', 11), " +
                "('Nova Ponte', 11), " +
                "('Nova Porteirinha', 11), " +
                "('Nova Resende', 11), " +
                "('Nova Serrana', 11), " +
                "('Nova União', 11), " +
                "('Novo Cruzeiro', 11), " +
                "('Novo Oriente de Minas', 11), " +
                "('Novorizonte', 11), " +
                "('Olaria', 11), " +
                "('Olhos-d`Água', 11), " +
                "('Olímpio Noronha', 11), " +
                "('Oliveira', 11), " +
                "('Oliveira Fortes', 11), " +
                "('Onça de Pitangui', 11), " +
                "('Oratórios', 11), " +
                "('Orizânia', 11), " +
                "('Ouro Branco', 11), " +
                "('Ouro Fino', 11), " +
                "('Ouro Preto', 11), " +
                "('Ouro Verde de Minas', 11), " +
                "('Padre Carvalho', 11), " +
                "('Padre Paraíso', 11), " +
                "('Pai Pedro', 11), " +
                "('Paineiras', 11), " +
                "('Pains', 11), " +
                "('Paiva', 11), " +
                "('Palma', 11), " +
                "('Palmópolis', 11), " +
                "('Papagaios', 11), " +
                "('Pará de Minas', 11), " +
                "('Paracatu', 11), " +
                "('Paraguaçu', 11), " +
                "('Paraisópolis', 11), " +
                "('Paraopeba', 11), " +
                "('Passa Quatro', 11), " +
                "('Passa Tempo', 11), " +
                "('Passabém', 11), " +
                "('Passa-Vinte', 11), " +
                "('Passos', 11), " +
                "('Patis', 11), " +
                "('Patos de Minas', 11), " +
                "('Patrocínio', 11), " +
                "('Patrocínio do Muriaé', 11), " +
                "('Paula Cândido', 11), " +
                "('Paulistas', 11), " +
                "('Pavão', 11), " +
                "('Peçanha', 11), " +
                "('Pedra Azul', 11), " +
                "('Pedra Bonita', 11), " +
                "('Pedra do Anta', 11), " +
                "('Pedra do Indaiá', 11), " +
                "('Pedra Dourada', 11), " +
                "('Pedralva', 11), " +
                "('Pedras de Maria da Cruz', 11), " +
                "('Pedrinópolis', 11), " +
                "('Pedro Leopoldo', 11), " +
                "('Pedro Teixeira', 11), " +
                "('Pequeri', 11), " +
                "('Pequi', 11), " +
                "('Perdigão', 11), " +
                "('Perdizes', 11), " +
                "('Perdões', 11), " +
                "('Periquito', 11), " +
                "('Pescador', 11), " +
                "('Piau', 11), " +
                "('Piedade de Caratinga', 11), " +
                "('Piedade de Ponte Nova', 11), " +
                "('Piedade do Rio Grande', 11), " +
                "('Piedade dos Gerais', 11), " +
                "('Pimenta', 11), " +
                "('Pingo-d`Água', 11), " +
                "('Pintópolis', 11), " +
                "('Piracema', 11), " +
                "('Pirajuba', 11), " +
                "('Piranga', 11), " +
                "('Piranguçu', 11), " +
                "('Piranguinho', 11), " +
                "('Pirapetinga', 11), " +
                "('Pirapora', 11), " +
                "('Piraúba', 11), " +
                "('Pitangui', 11), " +
                "('Piumhi', 11), " +
                "('Planura', 11), " +
                "('Poço Fundo', 11), " +
                "('Poços de Caldas', 11), " +
                "('Pocrane', 11), " +
                "('Pompéu', 11), " +
                "('Ponte Nova', 11), " +
                "('Ponto Chique', 11), " +
                "('Ponto dos Volantes', 11), " +
                "('Porteirinha', 11), " +
                "('Porto Firme', 11), " +
                "('Poté', 11), " +
                "('Pouso Alegre', 11), " +
                "('Pouso Alto', 11), " +
                "('Prados', 11), " +
                "('Prata', 11), " +
                "('Pratápolis', 11), " +
                "('Pratinha', 11), " +
                "('Presidente Bernardes', 11), " +
                "('Presidente Juscelino', 11), " +
                "('Presidente Kubitschek', 11), " +
                "('Presidente Olegário', 11), " +
                "('Prudente de Morais', 11), " +
                "('Quartel Geral', 11), " +
                "('Queluzito', 11), " +
                "('Raposos', 11), " +
                "('Raul Soares', 11), " +
                "('Recreio', 11), " +
                "('Reduto', 11), " +
                "('Resende Costa', 11), " +
                "('Resplendor', 11), " +
                "('Ressaquinha', 11), " +
                "('Riachinho', 11), " +
                "('Riacho dos Machados', 11), " +
                "('Ribeirão das Neves', 11), " +
                "('Ribeirão Vermelho', 11), " +
                "('Rio Acima', 11), " +
                "('Rio Casca', 11), " +
                "('Rio do Prado', 11), " +
                "('Rio Doce', 11), " +
                "('Rio Espera', 11), " +
                "('Rio Manso', 11), " +
                "('Rio Novo', 11), " +
                "('Rio Paranaíba', 11), " +
                "('Rio Pardo de Minas', 11), " +
                "('Rio Piracicaba', 11), " +
                "('Rio Pomba', 11), " +
                "('Rio Preto', 11), " +
                "('Rio Vermelho', 11), " +
                "('Ritápolis', 11), " +
                "('Rochedo de Minas', 11), " +
                "('Rodeiro', 11), " +
                "('Romaria', 11), " +
                "('Rosário da Limeira', 11), " +
                "('Rubelita', 11), " +
                "('Rubim', 11), " +
                "('Sabará', 11), " +
                "('Sabinópolis', 11), " +
                "('Sacramento', 11), " +
                "('Salinas', 11), " +
                "('Salto da Divisa', 11), " +
                "('Santa Bárbara', 11), " +
                "('Santa Bárbara do Leste', 11), " +
                "('Santa Bárbara do Monte Verde', 11), " +
                "('Santa Bárbara do Tugúrio', 11), " +
                "('Santa Cruz de Minas', 11), " +
                "('Santa Cruz de Salinas', 11), " +
                "('Santa Cruz do Escalvado', 11), " +
                "('Santa Efigênia de Minas', 11), " +
                "('Santa Fé de Minas', 11), " +
                "('Santa Helena de Minas', 11), " +
                "('Santa Juliana', 11), " +
                "('Santa Luzia', 11), " +
                "('Santa Margarida', 11), " +
                "('Santa Maria de Itabira', 11), " +
                "('Santa Maria do Salto', 11), " +
                "('Santa Maria do Suaçuí', 11), " +
                "('Santa Rita de Caldas', 11), " +
                "('Santa Rita de Ibitipoca', 11), " +
                "('Santa Rita de Jacutinga', 11), " +
                "('Santa Rita de Minas', 11), " +
                "('Santa Rita do Itueto', 11), " +
                "('Santa Rita do Sapucaí', 11), " +
                "('Santa Rosa da Serra', 11), " +
                "('Santa Vitória', 11), " +
                "('Santana da Vargem', 11), " +
                "('Santana de Cataguases', 11), " +
                "('Santana de Pirapama', 11), " +
                "('Santana do Deserto', 11), " +
                "('Santana do Garambéu', 11), " +
                "('Santana do Jacaré', 11), " +
                "('Santana do Manhuaçu', 11), " +
                "('Santana do Paraíso', 11), " +
                "('Santana do Riacho', 11), " +
                "('Santana dos Montes', 11), " +
                "('Santo Antônio do Amparo', 11), " +
                "('Santo Antônio do Aventureiro', 11), " +
                "('Santo Antônio do Grama', 11), " +
                "('Santo Antônio do Itambé', 11), " +
                "('Santo Antônio do Jacinto', 11), " +
                "('Santo Antônio do Monte', 11), " +
                "('Santo Antônio do Retiro', 11), " +
                "('Santo Antônio do Rio Abaixo', 11), " +
                "('Santo Hipólito', 11), " +
                "('Santos Dumont', 11), " +
                "('São Bento Abade', 11), " +
                "('São Brás do Suaçuí', 11), " +
                "('São Domingos das Dores', 11), " +
                "('São Domingos do Prata', 11), " +
                "('São Félix de Minas', 11), " +
                "('São Francisco', 11), " +
                "('São Francisco de Paula', 11), " +
                "('São Francisco de Sales', 11), " +
                "('São Francisco do Glória', 11), " +
                "('São Geraldo', 11), " +
                "('São Geraldo da Piedade', 11), " +
                "('São Geraldo do Baixio', 11), " +
                "('São Gonçalo do Abaeté', 11), " +
                "('São Gonçalo do Pará', 11), " +
                "('São Gonçalo do Rio Abaixo', 11), " +
                "('São Gonçalo do Rio Preto', 11), " +
                "('São Gonçalo do Sapucaí', 11), " +
                "('São Gotardo', 11), " +
                "('São João Batista do Glória', 11), " +
                "('São João da Lagoa', 11), " +
                "('São João da Mata', 11), " +
                "('São João da Ponte', 11), " +
                "('São João das Missões', 11), " +
                "('São João del Rei', 11), " +
                "('São João do Manhuaçu', 11), " +
                "('São João do Manteninha', 11), " +
                "('São João do Oriente', 11), " +
                "('São João do Pacuí', 11), " +
                "('São João do Paraíso', 11), " +
                "('São João Evangelista', 11), " +
                "('São João Nepomuceno', 11), " +
                "('São Joaquim de Bicas', 11), " +
                "('São José da Barra', 11), " +
                "('São José da Lapa', 11), " +
                "('São José da Safira', 11), " +
                "('São José da Varginha', 11), " +
                "('São José do Alegre', 11), " +
                "('São José do Divino', 11), " +
                "('São José do Goiabal', 11), " +
                "('São José do Jacuri', 11), " +
                "('São José do Mantimento', 11), " +
                "('São Lourenço', 11), " +
                "('São Miguel do Anta', 11), " +
                "('São Pedro da União', 11), " +
                "('São Pedro do Suaçuí', 11), " +
                "('São Pedro dos Ferros', 11), " +
                "('São Romão', 11), " +
                "('São Roque de Minas', 11), " +
                "('São Sebastião da Bela Vista', 11), " +
                "('São Sebastião da Vargem Alegre', 11), " +
                "('São Sebastião do Anta', 11), " +
                "('São Sebastião do Maranhão', 11), " +
                "('São Sebastião do Oeste', 11), " +
                "('São Sebastião do Paraíso', 11), " +
                "('São Sebastião do Rio Preto', 11), " +
                "('São Sebastião do Rio Verde', 11), " +
                "('São Thomé das Letras', 11), " +
                "('São Tiago', 11), " +
                "('São Tomás de Aquino', 11), " +
                "('São Vicente de Minas', 11), " +
                "('Sapucaí-Mirim', 11), " +
                "('Sardoá', 11), " +
                "('Sarzedo', 11), " +
                "('Sem-Peixe', 11), " +
                "('Senador Amaral', 11), " +
                "('Senador Cortes', 11), " +
                "('Senador Firmino', 11), " +
                "('Senador José Bento', 11), " +
                "('Senador Modestino Gonçalves', 11), " +
                "('Senhora de Oliveira', 11), " +
                "('Senhora do Porto', 11), " +
                "('Senhora dos Remédios', 11), " +
                "('Sericita', 11), " +
                "('Seritinga', 11), " +
                "('Serra Azul de Minas', 11), " +
                "('Serra da Saudade', 11), " +
                "('Serra do Salitre', 11), " +
                "('Serra dos Aimorés', 11), " +
                "('Serrania', 11), " +
                "('Serranópolis de Minas', 11), " +
                "('Serranos', 11), " +
                "('Serro', 11), " +
                "('Sete Lagoas', 11), " +
                "('Setubinha', 11), " +
                "('Silveirânia', 11), " +
                "('Silvianópolis', 11), " +
                "('Simão Pereira', 11), " +
                "('Simonésia', 11), " +
                "('Sobrália', 11), " +
                "('Soledade de Minas', 11), " +
                "('Tabuleiro', 11), " +
                "('Taiobeiras', 11), " +
                "('Taparuba', 11), " +
                "('Tapira', 11), " +
                "('Tapiraí', 11), " +
                "('Taquaraçu de Minas', 11), " +
                "('Tarumirim', 11), " +
                "('Teixeiras', 11), " +
                "('Teófilo Otoni', 11), " +
                "('Timóteo', 11), " +
                "('Tiradentes', 11), " +
                "('Tiros', 11), " +
                "('Tocantins', 11), " +
                "('Tocos do Moji', 11), " +
                "('Toledo', 11), " +
                "('Tombos', 11), " +
                "('Três Corações', 11), " +
                "('Três Marias', 11), " +
                "('Três Pontas', 11), " +
                "('Tumiritinga', 11), " +
                "('Tupaciguara', 11), " +
                "('Turmalina', 11), " +
                "('Turvolândia', 11), " +
                "('Ubá', 11), " +
                "('Ubaí', 11), " +
                "('Ubaporanga', 11), " +
                "('Uberaba', 11), " +
                "('Uberlândia', 11), " +
                "('Umburatiba', 11), " +
                "('Unaí', 11), " +
                "('União de Minas', 11), " +
                "('Uruana de Minas', 11), " +
                "('Urucânia', 11), " +
                "('Urucuia', 11), " +
                "('Vargem Alegre', 11), " +
                "('Vargem Bonita', 11), " +
                "('Vargem Grande do Rio Pardo', 11), " +
                "('Varginha', 11), " +
                "('Varjão de Minas', 11), " +
                "('Várzea da Palma', 11), " +
                "('Varzelândia', 11), " +
                "('Vazante', 11), " +
                "('Verdelândia', 11), " +
                "('Veredinha', 11), " +
                "('Veríssimo', 11), " +
                "('Vermelho Novo', 11), " +
                "('Vespasiano', 11), " +
                "('Viçosa', 11), " +
                "('Vieiras', 11), " +
                "('Virgem da Lapa', 11), " +
                "('Virgínia', 11), " +
                "('Virginópolis', 11), " +
                "('Virgolândia', 11), " +
                "('Visconde do Rio Branco', 11), " +
                "('Volta Grande', 11), " +
                "('Wenceslau Braz', 11), " +
                "('Abaetetuba', 14), " +
                "('Abel Figueiredo', 14), " +
                "('Acará', 14), " +
                "('Afuá', 14), " +
                "('Água Azul do Norte', 14), " +
                "('Alenquer', 14), " +
                "('Almeirim', 14), " +
                "('Altamira', 14), " +
                "('Anajás', 14), " +
                "('Ananindeua', 14), " +
                "('Anapu', 14), " +
                "('Augusto Corrêa', 14), " +
                "('Aurora do Pará', 14), " +
                "('Aveiro', 14), " +
                "('Bagre', 14), " +
                "('Baião', 14), " +
                "('Bannach', 14), " +
                "('Barcarena', 14), " +
                "('Belém', 14), " +
                "('Belterra', 14), " +
                "('Benevides', 14), " +
                "('Bom Jesus do Tocantins', 14), " +
                "('Bonito', 14), " +
                "('Bragança', 14), " +
                "('Brasil Novo', 14), " +
                "('Brejo Grande do Araguaia', 14), " +
                "('Breu Branco', 14), " +
                "('Breves', 14), " +
                "('Bujaru', 14), " +
                "('Cachoeira do Arari', 14), " +
                "('Cachoeira do Piriá', 14), " +
                "('Cametá', 14), " +
                "('Canaã dos Carajás', 14), " +
                "('Capanema', 14), " +
                "('Capitão Poço', 14), " +
                "('Castanhal', 14), " +
                "('Chaves', 14), " +
                "('Colares', 14), " +
                "('Conceição do Araguaia', 14), " +
                "('Concórdia do Pará', 14), " +
                "('Cumaru do Norte', 14), " +
                "('Curionópolis', 14), " +
                "('Curralinho', 14), " +
                "('Curuá', 14), " +
                "('Curuçá', 14), " +
                "('Dom Eliseu', 14), " +
                "('Eldorado dos Carajás', 14), " +
                "('Faro', 14), " +
                "('Floresta do Araguaia', 14), " +
                "('Garrafão do Norte', 14), " +
                "('Goianésia do Pará', 14), " +
                "('Gurupá', 14), " +
                "('Igarapé-Açu', 14), " +
                "('Igarapé-Miri', 14), " +
                "('Inhangapi', 14), " +
                "('Ipixuna do Pará', 14), " +
                "('Irituia', 14), " +
                "('Itaituba', 14), " +
                "('Itupiranga', 14), " +
                "('Jacareacanga', 14), " +
                "('Jacundá', 14), " +
                "('Juruti', 14), " +
                "('Limoeiro do Ajuru', 14), " +
                "('Mãe do Rio', 14), " +
                "('Magalhães Barata', 14), " +
                "('Marabá', 14), " +
                "('Maracanã', 14), " +
                "('Marapanim', 14), " +
                "('Marituba', 14), " +
                "('Medicilândia', 14), " +
                "('Melgaço', 14), " +
                "('Mocajuba', 14), " +
                "('Moju', 14), " +
                "('Monte Alegre', 14), " +
                "('Muaná', 14), " +
                "('Nova Esperança do Piriá', 14), " +
                "('Nova Ipixuna', 14), " +
                "('Nova Timboteua', 14), " +
                "('Novo Progresso', 14), " +
                "('Novo Repartimento', 14), " +
                "('Óbidos', 14), " +
                "('Oeiras do Pará', 14), " +
                "('Oriximiná', 14), " +
                "('Ourém', 14), " +
                "('Ourilândia do Norte', 14), " +
                "('Pacajá', 14), " +
                "('Palestina do Pará', 14), " +
                "('Paragominas', 14), " +
                "('Parauapebas', 14), " +
                "('Pau d`Arco', 14), " +
                "('Peixe-Boi', 14), " +
                "('Piçarra', 14), " +
                "('Placas', 14), " +
                "('Ponta de Pedras', 14), " +
                "('Portel', 14), " +
                "('Porto de Moz', 14), " +
                "('Prainha', 14), " +
                "('Primavera', 14), " +
                "('Quatipuru', 14), " +
                "('Redenção', 14), " +
                "('Rio Maria', 14), " +
                "('Rondon do Pará', 14), " +
                "('Rurópolis', 14), " +
                "('Salinópolis', 14), " +
                "('Salvaterra', 14), " +
                "('Santa Bárbara do Pará', 14), " +
                "('Santa Cruz do Arari', 14), " +
                "('Santa Isabel do Pará', 14), " +
                "('Santa Luzia do Pará', 14), " +
                "('Santa Maria das Barreiras', 14), " +
                "('Santa Maria do Pará', 14), " +
                "('Santana do Araguaia', 14), " +
                "('Santarém', 14), " +
                "('Santarém Novo', 14), " +
                "('Santo Antônio do Tauá', 14), " +
                "('São Caetano de Odivelas', 14), " +
                "('São Domingos do Araguaia', 14), " +
                "('São Domingos do Capim', 14), " +
                "('São Félix do Xingu', 14), " +
                "('São Francisco do Pará', 14), " +
                "('São Geraldo do Araguaia', 14), " +
                "('São João da Ponta', 14), " +
                "('São João de Pirabas', 14), " +
                "('São João do Araguaia', 14), " +
                "('São Miguel do Guamá', 14), " +
                "('São Sebastião da Boa Vista', 14), " +
                "('Sapucaia', 14), " +
                "('Senador José Porfírio', 14), " +
                "('Soure', 14), " +
                "('Tailândia', 14), " +
                "('Terra Alta', 14), " +
                "('Terra Santa', 14), " +
                "('Tomé-Açu', 14), " +
                "('Tracuateua', 14), " +
                "('Trairão', 14), " +
                "('Tucumã', 14), " +
                "('Tucuruí', 14), " +
                "('Ulianópolis', 14), " +
                "('Uruará', 14), " +
                "('Vigia', 14), " +
                "('Viseu', 14), " +
                "('Vitória do Xingu', 14), " +
                "('Xinguara', 14), " +
                "('Água Branca', 15), " +
                "('Aguiar', 15), " +
                "('Alagoa Grande', 15), " +
                "('Alagoa Nova', 15), " +
                "('Alagoinha', 15), " +
                "('Alcantil', 15), " +
                "('Algodão de Jandaíra', 15), " +
                "('Alhandra', 15), " +
                "('Amparo', 15), " +
                "('Aparecida', 15), " +
                "('Araçagi', 15), " +
                "('Arara', 15), " +
                "('Araruna', 15), " +
                "('Areia', 15), " +
                "('Areia de Baraúnas', 15), " +
                "('Areial', 15), " +
                "('Aroeiras', 15), " +
                "('Assunção', 15), " +
                "('Baía da Traição', 15), " +
                "('Bananeiras', 15), " +
                "('Baraúna', 15), " +
                "('Barra de Santa Rosa', 15), " +
                "('Barra de Santana', 15), " +
                "('Barra de São Miguel', 15), " +
                "('Bayeux', 15), " +
                "('Belém', 15), " +
                "('Belém do Brejo do Cruz', 15), " +
                "('Bernardino Batista', 15), " +
                "('Boa Ventura', 15), " +
                "('Boa Vista', 15), " +
                "('Bom Jesus', 15), " +
                "('Bom Sucesso', 15), " +
                "('Bonito de Santa Fé', 15), " +
                "('Boqueirão', 15), " +
                "('Borborema', 15), " +
                "('Brejo do Cruz', 15), " +
                "('Brejo dos Santos', 15), " +
                "('Caaporã', 15), " +
                "('Cabaceiras', 15), " +
                "('Cabedelo', 15), " +
                "('Cachoeira dos Índios', 15), " +
                "('Cacimba de Areia', 15), " +
                "('Cacimba de Dentro', 15), " +
                "('Cacimbas', 15), " +
                "('Caiçara', 15), " +
                "('Cajazeiras', 15), " +
                "('Cajazeirinhas', 15), " +
                "('Caldas Brandão', 15), " +
                "('Camalaú', 15), " +
                "('Campina Grande', 15), " +
                "('Campo de Santana', 15), " +
                "('Capim', 15), " +
                "('Caraúbas', 15), " +
                "('Carrapateira', 15), " +
                "('Casserengue', 15), " +
                "('Catingueira', 15), " +
                "('Catolé do Rocha', 15), " +
                "('Caturité', 15), " +
                "('Conceição', 15), " +
                "('Condado', 15), " +
                "('Conde', 15), " +
                "('Congo', 15), " +
                "('Coremas', 15), " +
                "('Coxixola', 15), " +
                "('Cruz do Espírito Santo', 15), " +
                "('Cubati', 15), " +
                "('Cuité', 15), " +
                "('Cuité de Mamanguape', 15), " +
                "('Cuitegi', 15), " +
                "('Curral de Cima', 15), " +
                "('Curral Velho', 15), " +
                "('Damião', 15), " +
                "('Desterro', 15), " +
                "('Diamante', 15), " +
                "('Dona Inês', 15), " +
                "('Duas Estradas', 15), " +
                "('Emas', 15), " +
                "('Esperança', 15), " +
                "('Fagundes', 15), " +
                "('Frei Martinho', 15), " +
                "('Gado Bravo', 15), " +
                "('Guarabira', 15), " +
                "('Gurinhém', 15), " +
                "('Gurjão', 15), " +
                "('Ibiara', 15), " +
                "('Igaracy', 15), " +
                "('Imaculada', 15), " +
                "('Ingá', 15), " +
                "('Itabaiana', 15), " +
                "('Itaporanga', 15), " +
                "('Itapororoca', 15), " +
                "('Itatuba', 15), " +
                "('Jacaraú', 15), " +
                "('Jericó', 15), " +
                "('João Pessoa', 15), " +
                "('Juarez Távora', 15), " +
                "('Juazeirinho', 15), " +
                "('Junco do Seridó', 15), " +
                "('Juripiranga', 15), " +
                "('Juru', 15), " +
                "('Lagoa', 15), " +
                "('Lagoa de Dentro', 15), " +
                "('Lagoa Seca', 15), " +
                "('Lastro', 15), " +
                "('Livramento', 15), " +
                "('Logradouro', 15), " +
                "('Lucena', 15), " +
                "('Mãe d`Água', 15), " +
                "('Malta', 15), " +
                "('Mamanguape', 15), " +
                "('Manaíra', 15), " +
                "('Marcação', 15), " +
                "('Mari', 15), " +
                "('Marizópolis', 15), " +
                "('Massaranduba', 15), " +
                "('Mataraca', 15), " +
                "('Matinhas', 15), " +
                "('Mato Grosso', 15), " +
                "('Maturéia', 15), " +
                "('Mogeiro', 15), " +
                "('Montadas', 15), " +
                "('Monte Horebe', 15), " +
                "('Monteiro', 15), " +
                "('Mulungu', 15), " +
                "('Natuba', 15), " +
                "('Nazarezinho', 15), " +
                "('Nova Floresta', 15), " +
                "('Nova Olinda', 15), " +
                "('Nova Palmeira', 15), " +
                "('Olho d`Água', 15), " +
                "('Olivedos', 15), " +
                "('Ouro Velho', 15), " +
                "('Parari', 15), " +
                "('Passagem', 15), " +
                "('Patos', 15), " +
                "('Paulista', 15), " +
                "('Pedra Branca', 15), " +
                "('Pedra Lavrada', 15), " +
                "('Pedras de Fogo', 15), " +
                "('Pedro Régis', 15), " +
                "('Piancó', 15), " +
                "('Picuí', 15), " +
                "('Pilar', 15), " +
                "('Pilões', 15), " +
                "('Pilõezinhos', 15), " +
                "('Pirpirituba', 15), " +
                "('Pitimbu', 15), " +
                "('Pocinhos', 15), " +
                "('Poço Dantas', 15), " +
                "('Poço de José de Moura', 15), " +
                "('Pombal', 15), " +
                "('Prata', 15), " +
                "('Princesa Isabel', 15), " +
                "('Puxinanã', 15), " +
                "('Queimadas', 15), " +
                "('Quixabá', 15), " +
                "('Remígio', 15), " +
                "('Riachão', 15), " +
                "('Riachão do Bacamarte', 15), " +
                "('Riachão do Poço', 15), " +
                "('Riacho de Santo Antônio', 15), " +
                "('Riacho dos Cavalos', 15), " +
                "('Rio Tinto', 15), " +
                "('Salgadinho', 15), " +
                "('Salgado de São Félix', 15), " +
                "('Santa Cecília', 15), " +
                "('Santa Cruz', 15), " +
                "('Santa Helena', 15), " +
                "('Santa Inês', 15), " +
                "('Santa Luzia', 15), " +
                "('Santa Rita', 15), " +
                "('Santa Teresinha', 15), " +
                "('Santana de Mangueira', 15), " +
                "('Santana dos Garrotes', 15), " +
                "('Santarém', 15), " +
                "('Santo André', 15), " +
                "('São Bentinho', 15), " +
                "('São Bento', 15), " +
                "('São Domingos de Pombal', 15), " +
                "('São Domingos do Cariri', 15), " +
                "('São Francisco', 15), " +
                "('São João do Cariri', 15), " +
                "('São João do Rio do Peixe', 15), " +
                "('São João do Tigre', 15), " +
                "('São José da Lagoa Tapada', 15), " +
                "('São José de Caiana', 15), " +
                "('São José de Espinharas', 15), " +
                "('São José de Piranhas', 15), " +
                "('São José de Princesa', 15), " +
                "('São José do Bonfim', 15), " +
                "('São José do Brejo do Cruz', 15), " +
                "('São José do Sabugi', 15), " +
                "('São José dos Cordeiros', 15), " +
                "('São José dos Ramos', 15), " +
                "('São Mamede', 15), " +
                "('São Miguel de Taipu', 15), " +
                "('São Sebastião de Lagoa de Roça', 15), " +
                "('São Sebastião do Umbuzeiro', 15), " +
                "('Sapé', 15), " +
                "('Seridó', 15), " +
                "('Serra Branca', 15), " +
                "('Serra da Raiz', 15), " +
                "('Serra Grande', 15), " +
                "('Serra Redonda', 15), " +
                "('Serraria', 15), " +
                "('Sertãozinho', 15), " +
                "('Sobrado', 15), " +
                "('Solânea', 15), " +
                "('Soledade', 15), " +
                "('Sossêgo', 15), " +
                "('Sousa', 15), " +
                "('Sumé', 15), " +
                "('Taperoá', 15), " +
                "('Tavares', 15), " +
                "('Teixeira', 15), " +
                "('Tenório', 15), " +
                "('Triunfo', 15), " +
                "('Uiraúna', 15), " +
                "('Umbuzeiro', 15), " +
                "('Várzea', 15), " +
                "('Vieirópolis', 15), " +
                "('Vista Serrana', 15), " +
                "('Zabelê', 15), " +
                "('Abatiá', 18), " +
                "('Adrianópolis', 18), " +
                "('Agudos do Sul', 18), " +
                "('Almirante Tamandaré', 18), " +
                "('Altamira do Paraná', 18), " +
                "('Alto Paraíso', 18), " +
                "('Alto Paraná', 18), " +
                "('Alto Piquiri', 18), " +
                "('Altônia', 18), " +
                "('Alvorada do Sul', 18), " +
                "('Amaporã', 18), " +
                "('Ampére', 18), " +
                "('Anahy', 18), " +
                "('Andirá', 18), " +
                "('Ângulo', 18), " +
                "('Antonina', 18), " +
                "('Antônio Olinto', 18), " +
                "('Apucarana', 18), " +
                "('Arapongas', 18), " +
                "('Arapoti', 18), " +
                "('Arapuã', 18), " +
                "('Araruna', 18), " +
                "('Araucária', 18), " +
                "('Ariranha do Ivaí', 18), " +
                "('Assaí', 18), " +
                "('Assis Chateaubriand', 18), " +
                "('Astorga', 18), " +
                "('Atalaia', 18), " +
                "('Balsa Nova', 18), " +
                "('Bandeirantes', 18), " +
                "('Barbosa Ferraz', 18), " +
                "('Barra do Jacaré', 18), " +
                "('Barracão', 18), " +
                "('Bela Vista da Caroba', 18), " +
                "('Bela Vista do Paraíso', 18), " +
                "('Bituruna', 18), " +
                "('Boa Esperança', 18), " +
                "('Boa Esperança do Iguaçu', 18), " +
                "('Boa Ventura de São Roque', 18), " +
                "('Boa Vista da Aparecida', 18), " +
                "('Bocaiúva do Sul', 18), " +
                "('Bom Jesus do Sul', 18), " +
                "('Bom Sucesso', 18), " +
                "('Bom Sucesso do Sul', 18), " +
                "('Borrazópolis', 18), " +
                "('Braganey', 18), " +
                "('Brasilândia do Sul', 18), " +
                "('Cafeara', 18), " +
                "('Cafelândia', 18), " +
                "('Cafezal do Sul', 18), " +
                "('Califórnia', 18), " +
                "('Cambará', 18), " +
                "('Cambé', 18), " +
                "('Cambira', 18), " +
                "('Campina da Lagoa', 18), " +
                "('Campina do Simão', 18), " +
                "('Campina Grande do Sul', 18), " +
                "('Campo Bonito', 18), " +
                "('Campo do Tenente', 18), " +
                "('Campo Largo', 18), " +
                "('Campo Magro', 18), " +
                "('Campo Mourão', 18), " +
                "('Cândido de Abreu', 18), " +
                "('Candói', 18), " +
                "('Cantagalo', 18), " +
                "('Capanema', 18), " +
                "('Capitão Leônidas Marques', 18), " +
                "('Carambeí', 18), " +
                "('Carlópolis', 18), " +
                "('Cascavel', 18), " +
                "('Castro', 18), " +
                "('Catanduvas', 18), " +
                "('Centenário do Sul', 18), " +
                "('Cerro Azul', 18), " +
                "('Céu Azul', 18), " +
                "('Chopinzinho', 18), " +
                "('Cianorte', 18), " +
                "('Cidade Gaúcha', 18), " +
                "('Clevelândia', 18), " +
                "('Colombo', 18), " +
                "('Colorado', 18), " +
                "('Congonhinhas', 18), " +
                "('Conselheiro Mairinck', 18), " +
                "('Contenda', 18), " +
                "('Corbélia', 18), " +
                "('Cornélio Procópio', 18), " +
                "('Coronel Domingos Soares', 18), " +
                "('Coronel Vivida', 18), " +
                "('Corumbataí do Sul', 18), " +
                "('Cruz Machado', 18), " +
                "('Cruzeiro do Iguaçu', 18), " +
                "('Cruzeiro do Oeste', 18), " +
                "('Cruzeiro do Sul', 18), " +
                "('Cruzmaltina', 18), " +
                "('Curitiba', 18), " +
                "('Curiúva', 18), " +
                "('Diamante d`Oeste', 18), " +
                "('Diamante do Norte', 18), " +
                "('Diamante do Sul', 18), " +
                "('Dois Vizinhos', 18), " +
                "('Douradina', 18), " +
                "('Doutor Camargo', 18), " +
                "('Doutor Ulysses', 18), " +
                "('Enéas Marques', 18), " +
                "('Engenheiro Beltrão', 18), " +
                "('Entre Rios do Oeste', 18), " +
                "('Esperança Nova', 18), " +
                "('Espigão Alto do Iguaçu', 18), " +
                "('Farol', 18), " +
                "('Faxinal', 18), " +
                "('Fazenda Rio Grande', 18), " +
                "('Fênix', 18), " +
                "('Fernandes Pinheiro', 18), " +
                "('Figueira', 18), " +
                "('Flor da Serra do Sul', 18), " +
                "('Floraí', 18), " +
                "('Floresta', 18), " +
                "('Florestópolis', 18), " +
                "('Flórida', 18), " +
                "('Formosa do Oeste', 18), " +
                "('Foz do Iguaçu', 18), " +
                "('Foz do Jordão', 18), " +
                "('Francisco Alves', 18), " +
                "('Francisco Beltrão', 18), " +
                "('General Carneiro', 18), " +
                "('Godoy Moreira', 18), " +
                "('Goioerê', 18), " +
                "('Goioxim', 18), " +
                "('Grandes Rios', 18), " +
                "('Guaíra', 18), " +
                "('Guairaçá', 18), " +
                "('Guamiranga', 18), " +
                "('Guapirama', 18), " +
                "('Guaporema', 18), " +
                "('Guaraci', 18), " +
                "('Guaraniaçu', 18), " +
                "('Guarapuava', 18), " +
                "('Guaraqueçaba', 18), " +
                "('Guaratuba', 18), " +
                "('Honório Serpa', 18), " +
                "('Ibaiti', 18), " +
                "('Ibema', 18), " +
                "('Ibiporã', 18), " +
                "('Icaraíma', 18), " +
                "('Iguaraçu', 18), " +
                "('Iguatu', 18), " +
                "('Imbaú', 18), " +
                "('Imbituva', 18), " +
                "('Inácio Martins', 18), " +
                "('Inajá', 18), " +
                "('Indianópolis', 18), " +
                "('Ipiranga', 18), " +
                "('Iporã', 18), " +
                "('Iracema do Oeste', 18), " +
                "('Irati', 18), " +
                "('Iretama', 18), " +
                "('Itaguajé', 18), " +
                "('Itaipulândia', 18), " +
                "('Itambaracá', 18), " +
                "('Itambé', 18), " +
                "('Itapejara d`Oeste', 18), " +
                "('Itaperuçu', 18), " +
                "('Itaúna do Sul', 18), " +
                "('Ivaí', 18), " +
                "('Ivaiporã', 18), " +
                "('Ivaté', 18), " +
                "('Ivatuba', 18), " +
                "('Jaboti', 18), " +
                "('Jacarezinho', 18), " +
                "('Jaguapitã', 18), " +
                "('Jaguariaíva', 18), " +
                "('Jandaia do Sul', 18), " +
                "('Janiópolis', 18), " +
                "('Japira', 18), " +
                "('Japurá', 18), " +
                "('Jardim Alegre', 18), " +
                "('Jardim Olinda', 18), " +
                "('Jataizinho', 18), " +
                "('Jesuítas', 18), " +
                "('Joaquim Távora', 18), " +
                "('Jundiaí do Sul', 18), " +
                "('Juranda', 18), " +
                "('Jussara', 18), " +
                "('Kaloré', 18), " +
                "('Lapa', 18), " +
                "('Laranjal', 18), " +
                "('Laranjeiras do Sul', 18), " +
                "('Leópolis', 18), " +
                "('Lidianópolis', 18), " +
                "('Lindoeste', 18), " +
                "('Loanda', 18), " +
                "('Lobato', 18), " +
                "('Londrina', 18), " +
                "('Luiziana', 18), " +
                "('Lunardelli', 18), " +
                "('Lupionópolis', 18), " +
                "('Mallet', 18), " +
                "('Mamborê', 18), " +
                "('Mandaguaçu', 18), " +
                "('Mandaguari', 18), " +
                "('Mandirituba', 18), " +
                "('Manfrinópolis', 18), " +
                "('Mangueirinha', 18), " +
                "('Manoel Ribas', 18), " +
                "('Marechal Cândido Rondon', 18), " +
                "('Maria Helena', 18), " +
                "('Marialva', 18), " +
                "('Marilândia do Sul', 18), " +
                "('Marilena', 18), " +
                "('Mariluz', 18), " +
                "('Maringá', 18), " +
                "('Mariópolis', 18), " +
                "('Maripá', 18), " +
                "('Marmeleiro', 18), " +
                "('Marquinho', 18), " +
                "('Marumbi', 18), " +
                "('Matelândia', 18), " +
                "('Matinhos', 18), " +
                "('Mato Rico', 18), " +
                "('Mauá da Serra', 18), " +
                "('Medianeira', 18), " +
                "('Mercedes', 18), " +
                "('Mirador', 18), " +
                "('Miraselva', 18), " +
                "('Missal', 18), " +
                "('Moreira Sales', 18), " +
                "('Morretes', 18), " +
                "('Munhoz de Melo', 18), " +
                "('Nossa Senhora das Graças', 18), " +
                "('Nova Aliança do Ivaí', 18), " +
                "('Nova América da Colina', 18), " +
                "('Nova Aurora', 18), " +
                "('Nova Cantu', 18), " +
                "('Nova Esperança', 18), " +
                "('Nova Esperança do Sudoeste', 18), " +
                "('Nova Fátima', 18), " +
                "('Nova Laranjeiras', 18), " +
                "('Nova Londrina', 18), " +
                "('Nova Olímpia', 18), " +
                "('Nova Prata do Iguaçu', 18), " +
                "('Nova Santa Bárbara', 18), " +
                "('Nova Santa Rosa', 18), " +
                "('Nova Tebas', 18), " +
                "('Novo Itacolomi', 18), " +
                "('Ortigueira', 18), " +
                "('Ourizona', 18), " +
                "('Ouro Verde do Oeste', 18), " +
                "('Paiçandu', 18), " +
                "('Palmas', 18), " +
                "('Palmeira', 18), " +
                "('Palmital', 18), " +
                "('Palotina', 18), " +
                "('Paraíso do Norte', 18), " +
                "('Paranacity', 18), " +
                "('Paranaguá', 18), " +
                "('Paranapoema', 18), " +
                "('Paranavaí', 18), " +
                "('Pato Bragado', 18), " +
                "('Pato Branco', 18), " +
                "('Paula Freitas', 18), " +
                "('Paulo Frontin', 18), " +
                "('Peabiru', 18), " +
                "('Perobal', 18), " +
                "('Pérola', 18), " +
                "('Pérola d`Oeste', 18), " +
                "('Piên', 18), " +
                "('Pinhais', 18), " +
                "('Pinhal de São Bento', 18), " +
                "('Pinhalão', 18), " +
                "('Pinhão', 18), " +
                "('Piraí do Sul', 18), " +
                "('Piraquara', 18), " +
                "('Pitanga', 18), " +
                "('Pitangueiras', 18), " +
                "('Planaltina do Paraná', 18), " +
                "('Planalto', 18), " +
                "('Ponta Grossa', 18), " +
                "('Pontal do Paraná', 18), " +
                "('Porecatu', 18), " +
                "('Porto Amazonas', 18), " +
                "('Porto Barreiro', 18), " +
                "('Porto Rico', 18), " +
                "('Porto Vitória', 18), " +
                "('Prado Ferreira', 18), " +
                "('Pranchita', 18), " +
                "('Presidente Castelo Branco', 18), " +
                "('Primeiro de Maio', 18), " +
                "('Prudentópolis', 18), " +
                "('Quarto Centenário', 18), " +
                "('Quatiguá', 18), " +
                "('Quatro Barras', 18), " +
                "('Quatro Pontes', 18), " +
                "('Quedas do Iguaçu', 18), " +
                "('Querência do Norte', 18), " +
                "('Quinta do Sol', 18), " +
                "('Quitandinha', 18), " +
                "('Ramilândia', 18), " +
                "('Rancho Alegre', 18), " +
                "('Rancho Alegre d`Oeste', 18), " +
                "('Realeza', 18), " +
                "('Rebouças', 18), " +
                "('Renascença', 18), " +
                "('Reserva', 18), " +
                "('Reserva do Iguaçu', 18), " +
                "('Ribeirão Claro', 18), " +
                "('Ribeirão do Pinhal', 18), " +
                "('Rio Azul', 18), " +
                "('Rio Bom', 18), " +
                "('Rio Bonito do Iguaçu', 18), " +
                "('Rio Branco do Ivaí', 18), " +
                "('Rio Branco do Sul', 18), " +
                "('Rio Negro', 18), " +
                "('Rolândia', 18), " +
                "('Roncador', 18), " +
                "('Rondon', 18), " +
                "('Rosário do Ivaí', 18), " +
                "('Sabáudia', 18), " +
                "('Salgado Filho', 18), " +
                "('Salto do Itararé', 18), " +
                "('Salto do Lontra', 18), " +
                "('Santa Amélia', 18), " +
                "('Santa Cecília do Pavão', 18), " +
                "('Santa Cruz de Monte Castelo', 18), " +
                "('Santa Fé', 18), " +
                "('Santa Helena', 18), " +
                "('Santa Inês', 18), " +
                "('Santa Isabel do Ivaí', 18), " +
                "('Santa Izabel do Oeste', 18), " +
                "('Santa Lúcia', 18), " +
                "('Santa Maria do Oeste', 18), " +
                "('Santa Mariana', 18), " +
                "('Santa Mônica', 18), " +
                "('Santa Tereza do Oeste', 18), " +
                "('Santa Terezinha de Itaipu', 18), " +
                "('Santana do Itararé', 18), " +
                "('Santo Antônio da Platina', 18), " +
                "('Santo Antônio do Caiuá', 18), " +
                "('Santo Antônio do Paraíso', 18), " +
                "('Santo Antônio do Sudoeste', 18), " +
                "('Santo Inácio', 18), " +
                "('São Carlos do Ivaí', 18), " +
                "('São Jerônimo da Serra', 18), " +
                "('São João', 18), " +
                "('São João do Caiuá', 18), " +
                "('São João do Ivaí', 18), " +
                "('São João do Triunfo', 18), " +
                "('São Jorge d`Oeste', 18), " +
                "('São Jorge do Ivaí', 18), " +
                "('São Jorge do Patrocínio', 18), " +
                "('São José da Boa Vista', 18), " +
                "('São José das Palmeiras', 18), " +
                "('São José dos Pinhais', 18), " +
                "('São Manoel do Paraná', 18), " +
                "('São Mateus do Sul', 18), " +
                "('São Miguel do Iguaçu', 18), " +
                "('São Pedro do Iguaçu', 18), " +
                "('São Pedro do Ivaí', 18), " +
                "('São Pedro do Paraná', 18), " +
                "('São Sebastião da Amoreira', 18), " +
                "('São Tomé', 18), " +
                "('Sapopema', 18), " +
                "('Sarandi', 18), " +
                "('Saudade do Iguaçu', 18), " +
                "('Sengés', 18), " +
                "('Serranópolis do Iguaçu', 18), " +
                "('Sertaneja', 18), " +
                "('Sertanópolis', 18), " +
                "('Siqueira Campos', 18), " +
                "('Sulina', 18), " +
                "('Tamarana', 18), " +
                "('Tamboara', 18), " +
                "('Tapejara', 18), " +
                "('Tapira', 18), " +
                "('Teixeira Soares', 18), " +
                "('Telêmaco Borba', 18), " +
                "('Terra Boa', 18), " +
                "('Terra Rica', 18), " +
                "('Terra Roxa', 18), " +
                "('Tibagi', 18), " +
                "('Tijucas do Sul', 18), " +
                "('Toledo', 18), " +
                "('Tomazina', 18), " +
                "('Três Barras do Paraná', 18), " +
                "('Tunas do Paraná', 18), " +
                "('Tuneiras do Oeste', 18), " +
                "('Tupãssi', 18), " +
                "('Turvo', 18), " +
                "('Ubiratã', 18), " +
                "('Umuarama', 18), " +
                "('União da Vitória', 18), " +
                "('Uniflor', 18), " +
                "('Uraí', 18), " +
                "('Ventania', 18), " +
                "('Vera Cruz do Oeste', 18), " +
                "('Verê', 18), " +
                "('Virmond', 18), " +
                "('Vitorino', 18), " +
                "('Wenceslau Braz', 18), " +
                "('Xambrê', 18), " +
                "('Abreu e Lima', 16), " +
                "('Afogados da Ingazeira', 16), " +
                "('Afrânio', 16), " +
                "('Agrestina', 16), " +
                "('Água Preta', 16), " +
                "('Águas Belas', 16), " +
                "('Alagoinha', 16), " +
                "('Aliança', 16), " +
                "('Altinho', 16), " +
                "('Amaraji', 16), " +
                "('Angelim', 16), " +
                "('Araçoiaba', 16), " +
                "('Araripina', 16), " +
                "('Arcoverde', 16), " +
                "('Barra de Guabiraba', 16), " +
                "('Barreiros', 16), " +
                "('Belém de Maria', 16), " +
                "('Belém de São Francisco', 16), " +
                "('Belo Jardim', 16), " +
                "('Betânia', 16), " +
                "('Bezerros', 16), " +
                "('Bodocó', 16), " +
                "('Bom Conselho', 16), " +
                "('Bom Jardim', 16), " +
                "('Bonito', 16), " +
                "('Brejão', 16), " +
                "('Brejinho', 16), " +
                "('Brejo da Madre de Deus', 16), " +
                "('Buenos Aires', 16), " +
                "('Buíque', 16), " +
                "('Cabo de Santo Agostinho', 16), " +
                "('Cabrobó', 16), " +
                "('Cachoeirinha', 16), " +
                "('Caetés', 16), " +
                "('Calçado', 16), " +
                "('Calumbi', 16), " +
                "('Camaragibe', 16), " +
                "('Camocim de São Félix', 16), " +
                "('Camutanga', 16), " +
                "('Canhotinho', 16), " +
                "('Capoeiras', 16), " +
                "('Carnaíba', 16), " +
                "('Carnaubeira da Penha', 16), " +
                "('Carpina', 16), " +
                "('Caruaru', 16), " +
                "('Casinhas', 16), " +
                "('Catende', 16), " +
                "('Cedro', 16), " +
                "('Chã de Alegria', 16), " +
                "('Chã Grande', 16), " +
                "('Condado', 16), " +
                "('Correntes', 16), " +
                "('Cortês', 16), " +
                "('Cumaru', 16), " +
                "('Cupira', 16), " +
                "('Custódia', 16), " +
                "('Dormentes', 16), " +
                "('Escada', 16), " +
                "('Exu', 16), " +
                "('Feira Nova', 16), " +
                "('Fernando de Noronha', 16), " +
                "('Ferreiros', 16), " +
                "('Flores', 16), " +
                "('Floresta', 16), " +
                "('Frei Miguelinho', 16), " +
                "('Gameleira', 16), " +
                "('Garanhuns', 16), " +
                "('Glória do Goitá', 16), " +
                "('Goiana', 16), " +
                "('Granito', 16), " +
                "('Gravatá', 16), " +
                "('Iati', 16), " +
                "('Ibimirim', 16), " +
                "('Ibirajuba', 16), " +
                "('Igarassu', 16), " +
                "('Iguaraci', 16), " +
                "('Ilha de Itamaracá', 16), " +
                "('Inajá', 16), " +
                "('Ingazeira', 16), " +
                "('Ipojuca', 16), " +
                "('Ipubi', 16), " +
                "('Itacuruba', 16), " +
                "('Itaíba', 16), " +
                "('Itambé', 16), " +
                "('Itapetim', 16), " +
                "('Itapissuma', 16), " +
                "('Itaquitinga', 16), " +
                "('Jaboatão dos Guararapes', 16), " +
                "('Jaqueira', 16), " +
                "('Jataúba', 16), " +
                "('Jatobá', 16), " +
                "('João Alfredo', 16), " +
                "('Joaquim Nabuco', 16), " +
                "('Jucati', 16), " +
                "('Jupi', 16), " +
                "('Jurema', 16), " +
                "('Lagoa do Carro', 16), " +
                "('Lagoa do Itaenga', 16), " +
                "('Lagoa do Ouro', 16), " +
                "('Lagoa dos Gatos', 16), " +
                "('Lagoa Grande', 16), " +
                "('Lajedo', 16), " +
                "('Limoeiro', 16), " +
                "('Macaparana', 16), " +
                "('Machados', 16), " +
                "('Manari', 16), " +
                "('Maraial', 16), " +
                "('Mirandiba', 16), " +
                "('Moreilândia', 16), " +
                "('Moreno', 16), " +
                "('Nazaré da Mata', 16), " +
                "('Olinda', 16), " +
                "('Orobó', 16), " +
                "('Orocó', 16), " +
                "('Ouricuri', 16), " +
                "('Palmares', 16), " +
                "('Palmeirina', 16), " +
                "('Panelas', 16), " +
                "('Paranatama', 16), " +
                "('Parnamirim', 16), " +
                "('Passira', 16), " +
                "('Paudalho', 16), " +
                "('Paulista', 16), " +
                "('Pedra', 16), " +
                "('Pesqueira', 16), " +
                "('Petrolândia', 16), " +
                "('Petrolina', 16), " +
                "('Poção', 16), " +
                "('Pombos', 16), " +
                "('Primavera', 16), " +
                "('Quipapá', 16), " +
                "('Quixaba', 16), " +
                "('Recife', 16), " +
                "('Riacho das Almas', 16), " +
                "('Ribeirão', 16), " +
                "('Rio Formoso', 16), " +
                "('Sairé', 16), " +
                "('Salgadinho', 16), " +
                "('Salgueiro', 16), " +
                "('Saloá', 16), " +
                "('Sanharó', 16), " +
                "('Santa Cruz', 16), " +
                "('Santa Cruz da Baixa Verde', 16), " +
                "('Santa Cruz do Capibaribe', 16), " +
                "('Santa Filomena', 16), " +
                "('Santa Maria da Boa Vista', 16), " +
                "('Santa Maria do Cambucá', 16), " +
                "('Santa Terezinha', 16), " +
                "('São Benedito do Sul', 16), " +
                "('São Bento do Una', 16), " +
                "('São Caitano', 16), " +
                "('São João', 16), " +
                "('São Joaquim do Monte', 16), " +
                "('São José da Coroa Grande', 16), " +
                "('São José do Belmonte', 16), " +
                "('São José do Egito', 16), " +
                "('São Lourenço da Mata', 16), " +
                "('São Vicente Ferrer', 16), " +
                "('Serra Talhada', 16), " +
                "('Serrita', 16), " +
                "('Sertânia', 16), " +
                "('Sirinhaém', 16), " +
                "('Solidão', 16), " +
                "('Surubim', 16), " +
                "('Tabira', 16), " +
                "('Tacaimbó', 16), " +
                "('Tacaratu', 16), " +
                "('Tamandaré', 16), " +
                "('Taquaritinga do Norte', 16), " +
                "('Terezinha', 16), " +
                "('Terra Nova', 16), " +
                "('Timbaúba', 16), " +
                "('Toritama', 16), " +
                "('Tracunhaém', 16), " +
                "('Trindade', 16), " +
                "('Triunfo', 16), " +
                "('Tupanatinga', 16), " +
                "('Tuparetama', 16), " +
                "('Venturosa', 16), " +
                "('Verdejante', 16), " +
                "('Vertente do Lério', 16), " +
                "('Vertentes', 16), " +
                "('Vicência', 16), " +
                "('Vitória de Santo Antão', 16), " +
                "('Xexéu', 16), " +
                "('Acauã', 17), " +
                "('Agricolândia', 17), " +
                "('Água Branca', 17), " +
                "('Alagoinha do Piauí', 17), " +
                "('Alegrete do Piauí', 17), " +
                "('Alto Longá', 17), " +
                "('Altos', 17), " +
                "('Alvorada do Gurguéia', 17), " +
                "('Amarante', 17), " +
                "('Angical do Piauí', 17), " +
                "('Anísio de Abreu', 17), " +
                "('Antônio Almeida', 17), " +
                "('Aroazes', 17), " +
                "('Aroeiras do Itaim', 17), " +
                "('Arraial', 17), " +
                "('Assunção do Piauí', 17), " +
                "('Avelino Lopes', 17), " +
                "('Baixa Grande do Ribeiro', 17), " +
                "('Barra d`Alcântara', 17), " +
                "('Barras', 17), " +
                "('Barreiras do Piauí', 17), " +
                "('Barro Duro', 17), " +
                "('Batalha', 17), " +
                "('Bela Vista do Piauí', 17), " +
                "('Belém do Piauí', 17), " +
                "('Beneditinos', 17), " +
                "('Bertolínia', 17), " +
                "('Betânia do Piauí', 17), " +
                "('Boa Hora', 17), " +
                "('Bocaina', 17), " +
                "('Bom Jesus', 17), " +
                "('Bom Princípio do Piauí', 17), " +
                "('Bonfim do Piauí', 17), " +
                "('Boqueirão do Piauí', 17), " +
                "('Brasileira', 17), " +
                "('Brejo do Piauí', 17), " +
                "('Buriti dos Lopes', 17), " +
                "('Buriti dos Montes', 17), " +
                "('Cabeceiras do Piauí', 17), " +
                "('Cajazeiras do Piauí', 17), " +
                "('Cajueiro da Praia', 17), " +
                "('Caldeirão Grande do Piauí', 17), " +
                "('Campinas do Piauí', 17), " +
                "('Campo Alegre do Fidalgo', 17), " +
                "('Campo Grande do Piauí', 17), " +
                "('Campo Largo do Piauí', 17), " +
                "('Campo Maior', 17), " +
                "('Canavieira', 17), " +
                "('Canto do Buriti', 17), " +
                "('Capitão de Campos', 17), " +
                "('Capitão Gervásio Oliveira', 17), " +
                "('Caracol', 17), " +
                "('Caraúbas do Piauí', 17), " +
                "('Caridade do Piauí', 17), " +
                "('Castelo do Piauí', 17), " +
                "('Caxingó', 17), " +
                "('Cocal', 17), " +
                "('Cocal de Telha', 17), " +
                "('Cocal dos Alves', 17), " +
                "('Coivaras', 17), " +
                "('Colônia do Gurguéia', 17), " +
                "('Colônia do Piauí', 17), " +
                "('Conceição do Canindé', 17), " +
                "('Coronel José Dias', 17), " +
                "('Corrente', 17), " +
                "('Cristalândia do Piauí', 17), " +
                "('Cristino Castro', 17), " +
                "('Curimatá', 17), " +
                "('Currais', 17), " +
                "('Curral Novo do Piauí', 17), " +
                "('Curralinhos', 17), " +
                "('Demerval Lobão', 17), " +
                "('Dirceu Arcoverde', 17), " +
                "('Dom Expedito Lopes', 17), " +
                "('Dom Inocêncio', 17), " +
                "('Domingos Mourão', 17), " +
                "('Elesbão Veloso', 17), " +
                "('Eliseu Martins', 17), " +
                "('Esperantina', 17), " +
                "('Fartura do Piauí', 17), " +
                "('Flores do Piauí', 17), " +
                "('Floresta do Piauí', 17), " +
                "('Floriano', 17), " +
                "('Francinópolis', 17), " +
                "('Francisco Ayres', 17), " +
                "('Francisco Macedo', 17), " +
                "('Francisco Santos', 17), " +
                "('Fronteiras', 17), " +
                "('Geminiano', 17), " +
                "('Gilbués', 17), " +
                "('Guadalupe', 17), " +
                "('Guaribas', 17), " +
                "('Hugo Napoleão', 17), " +
                "('Ilha Grande', 17), " +
                "('Inhuma', 17), " +
                "('Ipiranga do Piauí', 17), " +
                "('Isaías Coelho', 17), " +
                "('Itainópolis', 17), " +
                "('Itaueira', 17), " +
                "('Jacobina do Piauí', 17), " +
                "('Jaicós', 17), " +
                "('Jardim do Mulato', 17), " +
                "('Jatobá do Piauí', 17), " +
                "('Jerumenha', 17), " +
                "('João Costa', 17), " +
                "('Joaquim Pires', 17), " +
                "('Joca Marques', 17), " +
                "('José de Freitas', 17), " +
                "('Juazeiro do Piauí', 17), " +
                "('Júlio Borges', 17), " +
                "('Jurema', 17), " +
                "('Lagoa Alegre', 17), " +
                "('Lagoa de São Francisco', 17), " +
                "('Lagoa do Barro do Piauí', 17), " +
                "('Lagoa do Piauí', 17), " +
                "('Lagoa do Sítio', 17), " +
                "('Lagoinha do Piauí', 17), " +
                "('Landri Sales', 17), " +
                "('Luís Correia', 17), " +
                "('Luzilândia', 17), " +
                "('Madeiro', 17), " +
                "('Manoel Emídio', 17), " +
                "('Marcolândia', 17), " +
                "('Marcos Parente', 17), " +
                "('Massapê do Piauí', 17), " +
                "('Matias Olímpio', 17), " +
                "('Miguel Alves', 17), " +
                "('Miguel Leão', 17), " +
                "('Milton Brandão', 17), " +
                "('Monsenhor Gil', 17), " +
                "('Monsenhor Hipólito', 17), " +
                "('Monte Alegre do Piauí', 17), " +
                "('Morro Cabeça no Tempo', 17), " +
                "('Morro do Chapéu do Piauí', 17), " +
                "('Murici dos Portelas', 17), " +
                "('Nazaré do Piauí', 17), " +
                "('Nossa Senhora de Nazaré', 17), " +
                "('Nossa Senhora dos Remédios', 17), " +
                "('Nova Santa Rita', 17), " +
                "('Novo Oriente do Piauí', 17), " +
                "('Novo Santo Antônio', 17), " +
                "('Oeiras', 17), " +
                "('Olho d`Água do Piauí', 17), " +
                "('Padre Marcos', 17), " +
                "('Paes Landim', 17), " +
                "('Pajeú do Piauí', 17), " +
                "('Palmeira do Piauí', 17), " +
                "('Palmeirais', 17), " +
                "('Paquetá', 17), " +
                "('Parnaguá', 17), " +
                "('Parnaíba', 17), " +
                "('Passagem Franca do Piauí', 17), " +
                "('Patos do Piauí', 17), " +
                "('Pau d`Arco do Piauí', 17), " +
                "('Paulistana', 17), " +
                "('Pavussu', 17), " +
                "('Pedro II', 17), " +
                "('Pedro Laurentino', 17), " +
                "('Picos', 17), " +
                "('Pimenteiras', 17), " +
                "('Pio IX', 17), " +
                "('Piracuruca', 17), " +
                "('Piripiri', 17), " +
                "('Porto', 17), " +
                "('Porto Alegre do Piauí', 17), " +
                "('Prata do Piauí', 17), " +
                "('Queimada Nova', 17), " +
                "('Redenção do Gurguéia', 17), " +
                "('Regeneração', 17), " +
                "('Riacho Frio', 17), " +
                "('Ribeira do Piauí', 17), " +
                "('Ribeiro Gonçalves', 17), " +
                "('Rio Grande do Piauí', 17), " +
                "('Santa Cruz do Piauí', 17), " +
                "('Santa Cruz dos Milagres', 17), " +
                "('Santa Filomena', 17), " +
                "('Santa Luz', 17), " +
                "('Santa Rosa do Piauí', 17), " +
                "('Santana do Piauí', 17), " +
                "('Santo Antônio de Lisboa', 17), " +
                "('Santo Antônio dos Milagres', 17), " +
                "('Santo Inácio do Piauí', 17), " +
                "('São Braz do Piauí', 17), " +
                "('São Félix do Piauí', 17), " +
                "('São Francisco de Assis do Piauí', 17), " +
                "('São Francisco do Piauí', 17), " +
                "('São Gonçalo do Gurguéia', 17), " +
                "('São Gonçalo do Piauí', 17), " +
                "('São João da Canabrava', 17), " +
                "('São João da Fronteira', 17), " +
                "('São João da Serra', 17), " +
                "('São João da Varjota', 17), " +
                "('São João do Arraial', 17), " +
                "('São João do Piauí', 17), " +
                "('São José do Divino', 17), " +
                "('São José do Peixe', 17), " +
                "('São José do Piauí', 17), " +
                "('São Julião', 17), " +
                "('São Lourenço do Piauí', 17), " +
                "('São Luis do Piauí', 17), " +
                "('São Miguel da Baixa Grande', 17), " +
                "('São Miguel do Fidalgo', 17), " +
                "('São Miguel do Tapuio', 17), " +
                "('São Pedro do Piauí', 17), " +
                "('São Raimundo Nonato', 17), " +
                "('Sebastião Barros', 17), " +
                "('Sebastião Leal', 17), " +
                "('Sigefredo Pacheco', 17), " +
                "('Simões', 17), " +
                "('Simplício Mendes', 17), " +
                "('Socorro do Piauí', 17), " +
                "('Sussuapara', 17), " +
                "('Tamboril do Piauí', 17), " +
                "('Tanque do Piauí', 17), " +
                "('Teresina', 17), " +
                "('União', 17), " +
                "('Uruçuí', 17), " +
                "('Valença do Piauí', 17), " +
                "('Várzea Branca', 17), " +
                "('Várzea Grande', 17), " +
                "('Vera Mendes', 17), " +
                "('Vila Nova do Piauí', 17), " +
                "('Wall Ferraz', 17), " +
                "('Angra dos Reis', 19), " +
                "('Aperibé', 19), " +
                "('Araruama', 19), " +
                "('Areal', 19), " +
                "('Armação dos Búzios', 19), " +
                "('Arraial do Cabo', 19), " +
                "('Barra do Piraí', 19), " +
                "('Barra Mansa', 19), " +
                "('Belford Roxo', 19), " +
                "('Bom Jardim', 19), " +
                "('Bom Jesus do Itabapoana', 19), " +
                "('Cabo Frio', 19), " +
                "('Cachoeiras de Macacu', 19), " +
                "('Cambuci', 19), " +
                "('Campos dos Goytacazes', 19), " +
                "('Cantagalo', 19), " +
                "('Carapebus', 19), " +
                "('Cardoso Moreira', 19), " +
                "('Carmo', 19), " +
                "('Casimiro de Abreu', 19), " +
                "('Comendador Levy Gasparian', 19), " +
                "('Conceição de Macabu', 19), " +
                "('Cordeiro', 19), " +
                "('Duas Barras', 19), " +
                "('Duque de Caxias', 19), " +
                "('Engenheiro Paulo de Frontin', 19), " +
                "('Guapimirim', 19), " +
                "('Iguaba Grande', 19), " +
                "('Itaboraí', 19), " +
                "('Itaguaí', 19), " +
                "('Italva', 19), " +
                "('Itaocara', 19), " +
                "('Itaperuna', 19), " +
                "('Itatiaia', 19), " +
                "('Japeri', 19), " +
                "('Laje do Muriaé', 19), " +
                "('Macaé', 19), " +
                "('Macuco', 19), " +
                "('Magé', 19), " +
                "('Mangaratiba', 19), " +
                "('Maricá', 19), " +
                "('Mendes', 19), " +
                "('Mesquita', 19), " +
                "('Miguel Pereira', 19), " +
                "('Miracema', 19), " +
                "('Natividade', 19), " +
                "('Nilópolis', 19), " +
                "('Niterói', 19), " +
                "('Nova Friburgo', 19), " +
                "('Nova Iguaçu', 19), " +
                "('Paracambi', 19), " +
                "('Paraíba do Sul', 19), " +
                "('Parati', 19), " +
                "('Paty do Alferes', 19), " +
                "('Petrópolis', 19), " +
                "('Pinheiral', 19), " +
                "('Piraí', 19), " +
                "('Porciúncula', 19), " +
                "('Porto Real', 19), " +
                "('Quatis', 19), " +
                "('Queimados', 19), " +
                "('Quissamã', 19), " +
                "('Resende', 19), " +
                "('Rio Bonito', 19), " +
                "('Rio Claro', 19), " +
                "('Rio das Flores', 19), " +
                "('Rio das Ostras', 19), " +
                "('Rio de Janeiro', 19), " +
                "('Santa Maria Madalena', 19), " +
                "('Santo Antônio de Pádua', 19), " +
                "('São Fidélis', 19), " +
                "('São Francisco de Itabapoana', 19), " +
                "('São Gonçalo', 19), " +
                "('São João da Barra', 19), " +
                "('São João de Meriti', 19), " +
                "('São José de Ubá', 19), " +
                "('São José do Vale do Rio Pret', 19), " +
                "('São Pedro da Aldeia', 19), " +
                "('São Sebastião do Alto', 19), " +
                "('Sapucaia', 19), " +
                "('Saquarema', 19), " +
                "('Seropédica', 19), " +
                "('Silva Jardim', 19), " +
                "('Sumidouro', 19), " +
                "('Tanguá', 19), " +
                "('Teresópolis', 19), " +
                "('Trajano de Morais', 19), " +
                "('Três Rios', 19), " +
                "('Valença', 19), " +
                "('Varre-Sai', 19), " +
                "('Vassouras', 19), " +
                "('Volta Redonda', 19), " +
                "('Acari', 20), " +
                "('Açu', 20), " +
                "('Afonso Bezerra', 20), " +
                "('Água Nova', 20), " +
                "('Alexandria', 20), " +
                "('Almino Afonso', 20), " +
                "('Alto do Rodrigues', 20), " +
                "('Angicos', 20), " +
                "('Antônio Martins', 20), " +
                "('Apodi', 20), " +
                "('Areia Branca', 20), " +
                "('Arês', 20), " +
                "('Augusto Severo', 20), " +
                "('Baía Formosa', 20), " +
                "('Baraúna', 20), " +
                "('Barcelona', 20), " +
                "('Bento Fernandes', 20), " +
                "('Bodó', 20), " +
                "('Bom Jesus', 20), " +
                "('Brejinho', 20), " +
                "('Caiçara do Norte', 20), " +
                "('Caiçara do Rio do Vento', 20), " +
                "('Caicó', 20), " +
                "('Campo Redondo', 20), " +
                "('Canguaretama', 20), " +
                "('Caraúbas', 20), " +
                "('Carnaúba dos Dantas', 20), " +
                "('Carnaubais', 20), " +
                "('Ceará-Mirim', 20), " +
                "('Cerro Corá', 20), " +
                "('Coronel Ezequiel', 20), " +
                "('Coronel João Pessoa', 20), " +
                "('Cruzeta', 20), " +
                "('Currais Novos', 20), " +
                "('Doutor Severiano', 20), " +
                "('Encanto', 20), " +
                "('Equador', 20), " +
                "('Espírito Santo', 20), " +
                "('Extremoz', 20), " +
                "('Felipe Guerra', 20), " +
                "('Fernando Pedroza', 20), " +
                "('Florânia', 20), " +
                "('Francisco Dantas', 20), " +
                "('Frutuoso Gomes', 20), " +
                "('Galinhos', 20), " +
                "('Goianinha', 20), " +
                "('Governador Dix-Sept Rosado', 20), " +
                "('Grossos', 20), " +
                "('Guamaré', 20), " +
                "('Ielmo Marinho', 20), " +
                "('Ipanguaçu', 20), " +
                "('Ipueira', 20), " +
                "('Itajá', 20), " +
                "('Itaú', 20), " +
                "('Jaçanã', 20), " +
                "('Jandaíra', 20), " +
                "('Janduís', 20), " +
                "('Januário Cicco', 20), " +
                "('Japi', 20), " +
                "('Jardim de Angicos', 20), " +
                "('Jardim de Piranhas', 20), " +
                "('Jardim do Seridó', 20), " +
                "('João Câmara', 20), " +
                "('João Dias', 20), " +
                "('José da Penha', 20), " +
                "('Jucurutu', 20), " +
                "('Jundiá', 20), " +
                "('Lagoa d`Anta', 20), " +
                "('Lagoa de Pedras', 20), " +
                "('Lagoa de Velhos', 20), " +
                "('Lagoa Nova', 20), " +
                "('Lagoa Salgada', 20), " +
                "('Lajes', 20), " +
                "('Lajes Pintadas', 20), " +
                "('Lucrécia', 20), " +
                "('Luís Gomes', 20), " +
                "('Macaíba', 20), " +
                "('Macau', 20), " +
                "('Major Sales', 20), " +
                "('Marcelino Vieira', 20), " +
                "('Martins', 20), " +
                "('Maxaranguape', 20), " +
                "('Messias Targino', 20), " +
                "('Montanhas', 20), " +
                "('Monte Alegre', 20), " +
                "('Monte das Gameleiras', 20), " +
                "('Mossoró', 20), " +
                "('Natal', 20), " +
                "('Nísia Floresta', 20), " +
                "('Nova Cruz', 20), " +
                "('Olho-d`Água do Borges', 20), " +
                "('Ouro Branco', 20), " +
                "('Paraná', 20), " +
                "('Paraú', 20), " +
                "('Parazinho', 20), " +
                "('Parelhas', 20), " +
                "('Parnamirim', 20), " +
                "('Passa e Fica', 20), " +
                "('Passagem', 20), " +
                "('Patu', 20), " +
                "('Pau dos Ferros', 20), " +
                "('Pedra Grande', 20), " +
                "('Pedra Preta', 20), " +
                "('Pedro Avelino', 20), " +
                "('Pedro Velho', 20), " +
                "('Pendências', 20), " +
                "('Pilões', 20), " +
                "('Poço Branco', 20), " +
                "('Portalegre', 20), " +
                "('Porto do Mangue', 20), " +
                "('Presidente Juscelino', 20), " +
                "('Pureza', 20), " +
                "('Rafael Fernandes', 20), " +
                "('Rafael Godeiro', 20), " +
                "('Riacho da Cruz', 20), " +
                "('Riacho de Santana', 20), " +
                "('Riachuelo', 20), " +
                "('Rio do Fogo', 20), " +
                "('Rodolfo Fernandes', 20), " +
                "('Ruy Barbosa', 20), " +
                "('Santa Cruz', 20), " +
                "('Santa Maria', 20), " +
                "('Santana do Matos', 20), " +
                "('Santana do Seridó', 20), " +
                "('Santo Antônio', 20), " +
                "('São Bento do Norte', 20), " +
                "('São Bento do Trairí', 20), " +
                "('São Fernando', 20), " +
                "('São Francisco do Oeste', 20), " +
                "('São Gonçalo do Amarante', 20), " +
                "('São João do Sabugi', 20), " +
                "('São José de Mipibu', 20), " +
                "('São José do Campestre', 20), " +
                "('São José do Seridó', 20), " +
                "('São Miguel', 20), " +
                "('São Miguel do Gostoso', 20), " +
                "('São Paulo do Potengi', 20), " +
                "('São Pedro', 20), " +
                "('São Rafael', 20), " +
                "('São Tomé', 20), " +
                "('São Vicente', 20), " +
                "('Senador Elói de Souza', 20), " +
                "('Senador Georgino Avelino', 20), " +
                "('Serra de São Bento', 20), " +
                "('Serra do Mel', 20), " +
                "('Serra Negra do Norte', 20), " +
                "('Serrinha', 20), " +
                "('Serrinha dos Pintos', 20), " +
                "('Severiano Melo', 20), " +
                "('Sítio Novo', 20), " +
                "('Taboleiro Grande', 20), " +
                "('Taipu', 20), " +
                "('Tangará', 20), " +
                "('Tenente Ananias', 20), " +
                "('Tenente Laurentino Cruz', 20), " +
                "('Tibau', 20), " +
                "('Tibau do Sul', 20), " +
                "('Timbaúba dos Batistas', 20), " +
                "('Touros', 20), " +
                "('Triunfo Potiguar', 20), " +
                "('Umarizal', 20), " +
                "('Upanema', 20), " +
                "('Várzea', 20), " +
                "('Venha-Ver', 20), " +
                "('Vera Cruz', 20), " +
                "('Viçosa', 20), " +
                "('Vila Flor', 20), " +
                "('Aceguá', 23), " +
                "('Água Santa', 23), " +
                "('Agudo', 23), " +
                "('Ajuricaba', 23), " +
                "('Alecrim', 23), " +
                "('Alegrete', 23), " +
                "('Alegria', 23), " +
                "('Almirante Tamandaré do Sul', 23), " +
                "('Alpestre', 23), " +
                "('Alto Alegre', 23), " +
                "('Alto Feliz', 23), " +
                "('Alvorada', 23), " +
                "('Amaral Ferrador', 23), " +
                "('Ametista do Sul', 23), " +
                "('André da Rocha', 23), " +
                "('Anta Gorda', 23), " +
                "('Antônio Prado', 23), " +
                "('Arambaré', 23), " +
                "('Araricá', 23), " +
                "('Aratiba', 23), " +
                "('Arroio do Meio', 23), " +
                "('Arroio do Padre', 23), " +
                "('Arroio do Sal', 23), " +
                "('Arroio do Tigre', 23), " +
                "('Arroio dos Ratos', 23), " +
                "('Arroio Grande', 23), " +
                "('Arvorezinha', 23), " +
                "('Augusto Pestana', 23), " +
                "('Áurea', 23), " +
                "('Bagé', 23), " +
                "('Balneário Pinhal', 23), " +
                "('Barão', 23), " +
                "('Barão de Cotegipe', 23), " +
                "('Barão do Triunfo', 23), " +
                "('Barra do Guarita', 23), " +
                "('Barra do Quaraí', 23), " +
                "('Barra do Ribeiro', 23), " +
                "('Barra do Rio Azul', 23), " +
                "('Barra Funda', 23), " +
                "('Barracão', 23), " +
                "('Barros Cassal', 23), " +
                "('Benjamin Constant do Sul', 23), " +
                "('Bento Gonçalves', 23), " +
                "('Boa Vista das Missões', 23), " +
                "('Boa Vista do Buricá', 23), " +
                "('Boa Vista do Cadeado', 23), " +
                "('Boa Vista do Incra', 23), " +
                "('Boa Vista do Sul', 23), " +
                "('Bom Jesus', 23), " +
                "('Bom Princípio', 23), " +
                "('Bom Progresso', 23), " +
                "('Bom Retiro do Sul', 23), " +
                "('Boqueirão do Leão', 23), " +
                "('Bossoroca', 23), " +
                "('Bozano', 23), " +
                "('Braga', 23), " +
                "('Brochier', 23), " +
                "('Butiá', 23), " +
                "('Caçapava do Sul', 23), " +
                "('Cacequi', 23), " +
                "('Cachoeira do Sul', 23), " +
                "('Cachoeirinha', 23), " +
                "('Cacique Doble', 23), " +
                "('Caibaté', 23), " +
                "('Caiçara', 23), " +
                "('Camaquã', 23), " +
                "('Camargo', 23), " +
                "('Cambará do Sul', 23), " +
                "('Campestre da Serra', 23), " +
                "('Campina das Missões', 23), " +
                "('Campinas do Sul', 23), " +
                "('Campo Bom', 23), " +
                "('Campo Novo', 23), " +
                "('Campos Borges', 23), " +
                "('Candelária', 23), " +
                "('Cândido Godói', 23), " +
                "('Candiota', 23), " +
                "('Canela', 23), " +
                "('Canguçu', 23), " +
                "('Canoas', 23), " +
                "('Canudos do Vale', 23), " +
                "('Capão Bonito do Sul', 23), " +
                "('Capão da Canoa', 23), " +
                "('Capão do Cipó', 23), " +
                "('Capão do Leão', 23), " +
                "('Capela de Santana', 23), " +
                "('Capitão', 23), " +
                "('Capivari do Sul', 23), " +
                "('Caraá', 23), " +
                "('Carazinho', 23), " +
                "('Carlos Barbosa', 23), " +
                "('Carlos Gomes', 23), " +
                "('Casca', 23), " +
                "('Caseiros', 23), " +
                "('Catuípe', 23), " +
                "('Caxias do Sul', 23), " +
                "('Centenário', 23), " +
                "('Cerrito', 23), " +
                "('Cerro Branco', 23), " +
                "('Cerro Grande', 23), " +
                "('Cerro Grande do Sul', 23), " +
                "('Cerro Largo', 23), " +
                "('Chapada', 23), " +
                "('Charqueadas', 23), " +
                "('Charrua', 23), " +
                "('Chiapeta', 23), " +
                "('Chuí', 23), " +
                "('Chuvisca', 23), " +
                "('Cidreira', 23), " +
                "('Ciríaco', 23), " +
                "('Colinas', 23), " +
                "('Colorado', 23), " +
                "('Condor', 23), " +
                "('Constantina', 23), " +
                "('Coqueiro Baixo', 23), " +
                "('Coqueiros do Sul', 23), " +
                "('Coronel Barros', 23), " +
                "('Coronel Bicaco', 23), " +
                "('Coronel Pilar', 23), " +
                "('Cotiporã', 23), " +
                "('Coxilha', 23), " +
                "('Crissiumal', 23), " +
                "('Cristal', 23), " +
                "('Cristal do Sul', 23), " +
                "('Cruz Alta', 23), " +
                "('Cruzaltense', 23), " +
                "('Cruzeiro do Sul', 23), " +
                "('David Canabarro', 23), " +
                "('Derrubadas', 23), " +
                "('Dezesseis de Novembro', 23), " +
                "('Dilermando de Aguiar', 23), " +
                "('Dois Irmãos', 23), " +
                "('Dois Irmãos das Missões', 23), " +
                "('Dois Lajeados', 23), " +
                "('Dom Feliciano', 23), " +
                "('Dom Pedrito', 23), " +
                "('Dom Pedro de Alcântara', 23), " +
                "('Dona Francisca', 23), " +
                "('Doutor Maurício Cardoso', 23), " +
                "('Doutor Ricardo', 23), " +
                "('Eldorado do Sul', 23), " +
                "('Encantado', 23), " +
                "('Encruzilhada do Sul', 23), " +
                "('Engenho Velho', 23), " +
                "('Entre Rios do Sul', 23), " +
                "('Entre-Ijuís', 23), " +
                "('Erebango', 23), " +
                "('Erechim', 23), " +
                "('Ernestina', 23), " +
                "('Erval Grande', 23), " +
                "('Erval Seco', 23), " +
                "('Esmeralda', 23), " +
                "('Esperança do Sul', 23), " +
                "('Espumoso', 23), " +
                "('Estação', 23), " +
                "('Estância Velha', 23), " +
                "('Esteio', 23), " +
                "('Estrela', 23), " +
                "('Estrela Velha', 23), " +
                "('Eugênio de Castro', 23), " +
                "('Fagundes Varela', 23), " +
                "('Farroupilha', 23), " +
                "('Faxinal do Soturno', 23), " +
                "('Faxinalzinho', 23), " +
                "('Fazenda Vilanova', 23), " +
                "('Feliz', 23), " +
                "('Flores da Cunha', 23), " +
                "('Floriano Peixoto', 23), " +
                "('Fontoura Xavier', 23), " +
                "('Formigueiro', 23), " +
                "('Forquetinha', 23), " +
                "('Fortaleza dos Valos', 23), " +
                "('Frederico Westphalen', 23), " +
                "('Garibaldi', 23), " +
                "('Garruchos', 23), " +
                "('Gaurama', 23), " +
                "('General Câmara', 23), " +
                "('Gentil', 23), " +
                "('Getúlio Vargas', 23), " +
                "('Giruá', 23), " +
                "('Glorinha', 23), " +
                "('Gramado', 23), " +
                "('Gramado dos Loureiros', 23), " +
                "('Gramado Xavier', 23), " +
                "('Gravataí', 23), " +
                "('Guabiju', 23), " +
                "('Guaíba', 23), " +
                "('Guaporé', 23), " +
                "('Guarani das Missões', 23), " +
                "('Harmonia', 23), " +
                "('Herval', 23), " +
                "('Herveiras', 23), " +
                "('Horizontina', 23), " +
                "('Hulha Negra', 23), " +
                "('Humaitá', 23), " +
                "('Ibarama', 23), " +
                "('Ibiaçá', 23), " +
                "('Ibiraiaras', 23), " +
                "('Ibirapuitã', 23), " +
                "('Ibirubá', 23), " +
                "('Igrejinha', 23), " +
                "('Ijuí', 23), " +
                "('Ilópolis', 23), " +
                "('Imbé', 23), " +
                "('Imigrante', 23), " +
                "('Independência', 23), " +
                "('Inhacorá', 23), " +
                "('Ipê', 23), " +
                "('Ipiranga do Sul', 23), " +
                "('Iraí', 23), " +
                "('Itaara', 23), " +
                "('Itacurubi', 23), " +
                "('Itapuca', 23), " +
                "('Itaqui', 23), " +
                "('Itati', 23), " +
                "('Itatiba do Sul', 23), " +
                "('Ivorá', 23), " +
                "('Ivoti', 23), " +
                "('Jaboticaba', 23), " +
                "('Jacuizinho', 23), " +
                "('Jacutinga', 23), " +
                "('Jaguarão', 23), " +
                "('Jaguari', 23), " +
                "('Jaquirana', 23), " +
                "('Jari', 23), " +
                "('Jóia', 23), " +
                "('Júlio de Castilhos', 23), " +
                "('Lagoa Bonita do Sul', 23), " +
                "('Lagoa dos Três Cantos', 23), " +
                "('Lagoa Vermelha', 23), " +
                "('Lagoão', 23), " +
                "('Lajeado', 23), " +
                "('Lajeado do Bugre', 23), " +
                "('Lavras do Sul', 23), " +
                "('Liberato Salzano', 23), " +
                "('Lindolfo Collor', 23), " +
                "('Linha Nova', 23), " +
                "('Maçambara', 23), " +
                "('Machadinho', 23), " +
                "('Mampituba', 23), " +
                "('Manoel Viana', 23), " +
                "('Maquiné', 23), " +
                "('Maratá', 23), " +
                "('Marau', 23), " +
                "('Marcelino Ramos', 23), " +
                "('Mariana Pimentel', 23), " +
                "('Mariano Moro', 23), " +
                "('Marques de Souza', 23), " +
                "('Mata', 23), " +
                "('Mato Castelhano', 23), " +
                "('Mato Leitão', 23), " +
                "('Mato Queimado', 23), " +
                "('Maximiliano de Almeida', 23), " +
                "('Minas do Leão', 23), " +
                "('Miraguaí', 23), " +
                "('Montauri', 23), " +
                "('Monte Alegre dos Campos', 23), " +
                "('Monte Belo do Sul', 23), " +
                "('Montenegro', 23), " +
                "('Mormaço', 23), " +
                "('Morrinhos do Sul', 23), " +
                "('Morro Redondo', 23), " +
                "('Morro Reuter', 23), " +
                "('Mostardas', 23), " +
                "('Muçum', 23), " +
                "('Muitos Capões', 23), " +
                "('Muliterno', 23), " +
                "('Não-Me-Toque', 23), " +
                "('Nicolau Vergueiro', 23), " +
                "('Nonoai', 23), " +
                "('Nova Alvorada', 23), " +
                "('Nova Araçá', 23), " +
                "('Nova Bassano', 23), " +
                "('Nova Boa Vista', 23), " +
                "('Nova Bréscia', 23), " +
                "('Nova Candelária', 23), " +
                "('Nova Esperança do Sul', 23), " +
                "('Nova Hartz', 23), " +
                "('Nova Pádua', 23), " +
                "('Nova Palma', 23), " +
                "('Nova Petrópolis', 23), " +
                "('Nova Prata', 23), " +
                "('Nova Ramada', 23), " +
                "('Nova Roma do Sul', 23), " +
                "('Nova Santa Rita', 23), " +
                "('Novo Barreiro', 23), " +
                "('Novo Cabrais', 23), " +
                "('Novo Hamburgo', 23), " +
                "('Novo Machado', 23), " +
                "('Novo Tiradentes', 23), " +
                "('Novo Xingu', 23), " +
                "('Osório', 23), " +
                "('Paim Filho', 23), " +
                "('Palmares do Sul', 23), " +
                "('Palmeira das Missões', 23), " +
                "('Palmitinho', 23), " +
                "('Panambi', 23), " +
                "('Pantano Grande', 23), " +
                "('Paraí', 23), " +
                "('Paraíso do Sul', 23), " +
                "('Pareci Novo', 23), " +
                "('Parobé', 23), " +
                "('Passa Sete', 23), " +
                "('Passo do Sobrado', 23), " +
                "('Passo Fundo', 23), " +
                "('Paulo Bento', 23), " +
                "('Paverama', 23), " +
                "('Pedras Altas', 23), " +
                "('Pedro Osório', 23), " +
                "('Pejuçara', 23), " +
                "('Pelotas', 23), " +
                "('Picada Café', 23), " +
                "('Pinhal', 23), " +
                "('Pinhal da Serra', 23), " +
                "('Pinhal Grande', 23), " +
                "('Pinheirinho do Vale', 23), " +
                "('Pinheiro Machado', 23), " +
                "('Pirapó', 23), " +
                "('Piratini', 23), " +
                "('Planalto', 23), " +
                "('Poço das Antas', 23), " +
                "('Pontão', 23), " +
                "('Ponte Preta', 23), " +
                "('Portão', 23), " +
                "('Porto Alegre', 23), " +
                "('Porto Lucena', 23), " +
                "('Porto Mauá', 23), " +
                "('Porto Vera Cruz', 23), " +
                "('Porto Xavier', 23), " +
                "('Pouso Novo', 23), " +
                "('Presidente Lucena', 23), " +
                "('Progresso', 23), " +
                "('Protásio Alves', 23), " +
                "('Putinga', 23), " +
                "('Quaraí', 23), " +
                "('Quatro Irmãos', 23), " +
                "('Quevedos', 23), " +
                "('Quinze de Novembro', 23), " +
                "('Redentora', 23), " +
                "('Relvado', 23), " +
                "('Restinga Seca', 23), " +
                "('Rio dos Índios', 23), " +
                "('Rio Grande', 23), " +
                "('Rio Pardo', 23), " +
                "('Riozinho', 23), " +
                "('Roca Sales', 23), " +
                "('Rodeio Bonito', 23), " +
                "('Rolador', 23), " +
                "('Rolante', 23), " +
                "('Ronda Alta', 23), " +
                "('Rondinha', 23), " +
                "('Roque Gonzales', 23), " +
                "('Rosário do Sul', 23), " +
                "('Sagrada Família', 23), " +
                "('Saldanha Marinho', 23), " +
                "('Salto do Jacuí', 23), " +
                "('Salvador das Missões', 23), " +
                "('Salvador do Sul', 23), " +
                "('Sananduva', 23), " +
                "('Santa Bárbara do Sul', 23), " +
                "('Santa Cecília do Sul', 23), " +
                "('Santa Clara do Sul', 23), " +
                "('Santa Cruz do Sul', 23), " +
                "('Santa Margarida do Sul', 23), " +
                "('Santa Maria', 23), " +
                "('Santa Maria do Herval', 23), " +
                "('Santa Rosa', 23), " +
                "('Santa Tereza', 23), " +
                "('Santa Vitória do Palmar', 23), " +
                "('Santana da Boa Vista', 23), " +
                "('Santana do Livramento', 23), " +
                "('Santiago', 23), " +
                "('Santo Ângelo', 23), " +
                "('Santo Antônio da Patrulha', 23), " +
                "('Santo Antônio das Missões', 23), " +
                "('Santo Antônio do Palma', 23), " +
                "('Santo Antônio do Planalto', 23), " +
                "('Santo Augusto', 23), " +
                "('Santo Cristo', 23), " +
                "('Santo Expedito do Sul', 23), " +
                "('São Borja', 23), " +
                "('São Domingos do Sul', 23), " +
                "('São Francisco de Assis', 23), " +
                "('São Francisco de Paula', 23), " +
                "('São Gabriel', 23), " +
                "('São Jerônimo', 23), " +
                "('São João da Urtiga', 23), " +
                "('São João do Polêsine', 23), " +
                "('São Jorge', 23), " +
                "('São José das Missões', 23), " +
                "('São José do Herval', 23), " +
                "('São José do Hortêncio', 23), " +
                "('São José do Inhacorá', 23), " +
                "('São José do Norte', 23), " +
                "('São José do Ouro', 23), " +
                "('São José do Sul', 23), " +
                "('São José dos Ausentes', 23), " +
                "('São Leopoldo', 23), " +
                "('São Lourenço do Sul', 23), " +
                "('São Luiz Gonzaga', 23), " +
                "('São Marcos', 23), " +
                "('São Martinho', 23), " +
                "('São Martinho da Serra', 23), " +
                "('São Miguel das Missões', 23), " +
                "('São Nicolau', 23), " +
                "('São Paulo das Missões', 23), " +
                "('São Pedro da Serra', 23), " +
                "('São Pedro das Missões', 23), " +
                "('São Pedro do Butiá', 23), " +
                "('São Pedro do Sul', 23), " +
                "('São Sebastião do Caí', 23), " +
                "('São Sepé', 23), " +
                "('São Valentim', 23), " +
                "('São Valentim do Sul', 23), " +
                "('São Valério do Sul', 23), " +
                "('São Vendelino', 23), " +
                "('São Vicente do Sul', 23), " +
                "('Sapiranga', 23), " +
                "('Sapucaia do Sul', 23), " +
                "('Sarandi', 23), " +
                "('Seberi', 23), " +
                "('Sede Nova', 23), " +
                "('Segredo', 23), " +
                "('Selbach', 23), " +
                "('Senador Salgado Filho', 23), " +
                "('Sentinela do Sul', 23), " +
                "('Serafina Corrêa', 23), " +
                "('Sério', 23), " +
                "('Sertão', 23), " +
                "('Sertão Santana', 23), " +
                "('Sete de Setembro', 23), " +
                "('Severiano de Almeida', 23), " +
                "('Silveira Martins', 23), " +
                "('Sinimbu', 23), " +
                "('Sobradinho', 23), " +
                "('Soledade', 23), " +
                "('Tabaí', 23), " +
                "('Tapejara', 23), " +
                "('Tapera', 23), " +
                "('Tapes', 23), " +
                "('Taquara', 23), " +
                "('Taquari', 23), " +
                "('Taquaruçu do Sul', 23), " +
                "('Tavares', 23), " +
                "('Tenente Portela', 23), " +
                "('Terra de Areia', 23), " +
                "('Teutônia', 23), " +
                "('Tio Hugo', 23), " +
                "('Tiradentes do Sul', 23), " +
                "('Toropi', 23), " +
                "('Torres', 23), " +
                "('Tramandaí', 23), " +
                "('Travesseiro', 23), " +
                "('Três Arroios', 23), " +
                "('Três Cachoeiras', 23), " +
                "('Três Coroas', 23), " +
                "('Três de Maio', 23), " +
                "('Três Forquilhas', 23), " +
                "('Três Palmeiras', 23), " +
                "('Três Passos', 23), " +
                "('Trindade do Sul', 23), " +
                "('Triunfo', 23), " +
                "('Tucunduva', 23), " +
                "('Tunas', 23), " +
                "('Tupanci do Sul', 23), " +
                "('Tupanciretã', 23), " +
                "('Tupandi', 23), " +
                "('Tuparendi', 23), " +
                "('Turuçu', 23), " +
                "('Ubiretama', 23), " +
                "('União da Serra', 23), " +
                "('Unistalda', 23), " +
                "('Uruguaiana', 23), " +
                "('Vacaria', 23), " +
                "('Vale do Sol', 23), " +
                "('Vale Real', 23), " +
                "('Vale Verde', 23), " +
                "('Vanini', 23), " +
                "('Venâncio Aires', 23), " +
                "('Vera Cruz', 23), " +
                "('Veranópolis', 23), " +
                "('Vespasiano Correa', 23), " +
                "('Viadutos', 23), " +
                "('Viamão', 23), " +
                "('Vicente Dutra', 23), " +
                "('Victor Graeff', 23), " +
                "('Vila Flores', 23), " +
                "('Vila Lângaro', 23), " +
                "('Vila Maria', 23), " +
                "('Vila Nova do Sul', 23), " +
                "('Vista Alegre', 23), " +
                "('Vista Alegre do Prata', 23), " +
                "('Vista Gaúcha', 23), " +
                "('Vitória das Missões', 23), " +
                "('Westfália', 23), " +
                "('Xangri-lá', 23), " +
                "('Alta Floresta d`Oeste', 21), " +
                "('Alto Alegre dos Parecis', 21), " +
                "('Alto Paraíso', 21), " +
                "('Alvorada d`Oeste', 21), " +
                "('Ariquemes', 21), " +
                "('Buritis', 21), " +
                "('Cabixi', 21), " +
                "('Cacaulândia', 21), " +
                "('Cacoal', 21), " +
                "('Campo Novo de Rondônia', 21), " +
                "('Candeias do Jamari', 21), " +
                "('Castanheiras', 21), " +
                "('Cerejeiras', 21), " +
                "('Chupinguaia', 21), " +
                "('Colorado do Oeste', 21), " +
                "('Corumbiara', 21), " +
                "('Costa Marques', 21), " +
                "('Cujubim', 21), " +
                "('Espigão d`Oeste', 21), " +
                "('Governador Jorge Teixeira', 21), " +
                "('Guajará-Mirim', 21), " +
                "('Itapuã do Oeste', 21), " +
                "('Jaru', 21), " +
                "('Ji-Paraná', 21), " +
                "('Machadinho d`Oeste', 21), " +
                "('Ministro Andreazza', 21), " +
                "('Mirante da Serra', 21), " +
                "('Monte Negro', 21), " +
                "('Nova Brasilândia d`Oeste', 21), " +
                "('Nova Mamoré', 21), " +
                "('Nova União', 21), " +
                "('Novo Horizonte do Oeste', 21), " +
                "('Ouro Preto do Oeste', 21), " +
                "('Parecis', 21), " +
                "('Pimenta Bueno', 21), " +
                "('Pimenteiras do Oeste', 21), " +
                "('Porto Velho', 21), " +
                "('Presidente Médici', 21), " +
                "('Primavera de Rondônia', 21), " +
                "('Rio Crespo', 21), " +
                "('Rolim de Moura', 21), " +
                "('Santa Luzia d`Oeste', 21), " +
                "('São Felipe d`Oeste', 21), " +
                "('São Francisco do Guaporé', 21), " +
                "('São Miguel do Guaporé', 21), " +
                "('Seringueiras', 21), " +
                "('Teixeirópolis', 21), " +
                "('Theobroma', 21), " +
                "('Urupá', 21), " +
                "('Vale do Anari', 21), " +
                "('Vale do Paraíso', 21), " +
                "('Vilhena', 21), " +
                "('Alto Alegre', 22), " +
                "('Amajari', 22), " +
                "('Boa Vista', 22), " +
                "('Bonfim', 22), " +
                "('Cantá', 22), " +
                "('Caracaraí', 22), " +
                "('Caroebe', 22), " +
                "('Iracema', 22), " +
                "('Mucajaí', 22), " +
                "('Normandia', 22), " +
                "('Pacaraima', 22), " +
                "('Rorainópolis', 22), " +
                "('São João da Baliza', 22), " +
                "('São Luiz', 22), " +
                "('Uiramutã', 22), " +
                "('Abdon Batista', 24), " +
                "('Abelardo Luz', 24), " +
                "('Agrolândia', 24), " +
                "('Agronômica', 24), " +
                "('Água Doce', 24), " +
                "('Águas de Chapecó', 24), " +
                "('Águas Frias', 24), " +
                "('Águas Mornas', 24), " +
                "('Alfredo Wagner', 24), " +
                "('Alto Bela Vista', 24), " +
                "('Anchieta', 24), " +
                "('Angelina', 24), " +
                "('Anita Garibaldi', 24), " +
                "('Anitápolis', 24), " +
                "('Antônio Carlos', 24), " +
                "('Apiúna', 24), " +
                "('Arabutã', 24), " +
                "('Araquari', 24), " +
                "('Araranguá', 24), " +
                "('Armazém', 24), " +
                "('Arroio Trinta', 24), " +
                "('Arvoredo', 24), " +
                "('Ascurra', 24), " +
                "('Atalanta', 24), " +
                "('Aurora', 24), " +
                "('Balneário Arroio do Silva', 24), " +
                "('Balneário Barra do Sul', 24), " +
                "('Balneário Camboriú', 24), " +
                "('Balneário Gaivota', 24), " +
                "('Bandeirante', 24), " +
                "('Barra Bonita', 24), " +
                "('Barra Velha', 24), " +
                "('Bela Vista do Toldo', 24), " +
                "('Belmonte', 24), " +
                "('Benedito Novo', 24), " +
                "('Biguaçu', 24), " +
                "('Blumenau', 24), " +
                "('Bocaina do Sul', 24), " +
                "('Bom Jardim da Serra', 24), " +
                "('Bom Jesus', 24), " +
                "('Bom Jesus do Oeste', 24), " +
                "('Bom Retiro', 24), " +
                "('Bombinhas', 24), " +
                "('Botuverá', 24), " +
                "('Braço do Norte', 24), " +
                "('Braço do Trombudo', 24), " +
                "('Brunópolis', 24), " +
                "('Brusque', 24), " +
                "('Caçador', 24), " +
                "('Caibi', 24), " +
                "('Calmon', 24), " +
                "('Camboriú', 24), " +
                "('Campo Alegre', 24), " +
                "('Campo Belo do Sul', 24), " +
                "('Campo Erê', 24), " +
                "('Campos Novos', 24), " +
                "('Canelinha', 24), " +
                "('Canoinhas', 24), " +
                "('Capão Alto', 24), " +
                "('Capinzal', 24), " +
                "('Capivari de Baixo', 24), " +
                "('Catanduvas', 24), " +
                "('Caxambu do Sul', 24), " +
                "('Celso Ramos', 24), " +
                "('Cerro Negro', 24), " +
                "('Chapadão do Lageado', 24), " +
                "('Chapecó', 24), " +
                "('Cocal do Sul', 24), " +
                "('Concórdia', 24), " +
                "('Cordilheira Alta', 24), " +
                "('Coronel Freitas', 24), " +
                "('Coronel Martins', 24), " +
                "('Correia Pinto', 24), " +
                "('Corupá', 24), " +
                "('Criciúma', 24), " +
                "('Cunha Porã', 24), " +
                "('Cunhataí', 24), " +
                "('Curitibanos', 24), " +
                "('Descanso', 24), " +
                "('Dionísio Cerqueira', 24), " +
                "('Dona Emma', 24), " +
                "('Doutor Pedrinho', 24), " +
                "('Entre Rios', 24), " +
                "('Ermo', 24), " +
                "('Erval Velho', 24), " +
                "('Faxinal dos Guedes', 24), " +
                "('Flor do Sertão', 24), " +
                "('Florianópolis', 24), " +
                "('Formosa do Sul', 24), " +
                "('Forquilhinha', 24), " +
                "('Fraiburgo', 24), " +
                "('Frei Rogério', 24), " +
                "('Galvão', 24), " +
                "('Garopaba', 24), " +
                "('Garuva', 24), " +
                "('Gaspar', 24), " +
                "('Governador Celso Ramos', 24), " +
                "('Grão Pará', 24), " +
                "('Gravatal', 24), " +
                "('Guabiruba', 24), " +
                "('Guaraciaba', 24), " +
                "('Guaramirim', 24), " +
                "('Guarujá do Sul', 24), " +
                "('Guatambú', 24), " +
                "('Herval d`Oeste', 24), " +
                "('Ibiam', 24), " +
                "('Ibicaré', 24), " +
                "('Ibirama', 24), " +
                "('Içara', 24), " +
                "('Ilhota', 24), " +
                "('Imaruí', 24), " +
                "('Imbituba', 24), " +
                "('Imbuia', 24), " +
                "('Indaial', 24), " +
                "('Iomerê', 24), " +
                "('Ipira', 24), " +
                "('Iporã do Oeste', 24), " +
                "('Ipuaçu', 24), " +
                "('Ipumirim', 24), " +
                "('Iraceminha', 24), " +
                "('Irani', 24), " +
                "('Irati', 24), " +
                "('Irineópolis', 24), " +
                "('Itá', 24), " +
                "('Itaiópolis', 24), " +
                "('Itajaí', 24), " +
                "('Itapema', 24), " +
                "('Itapiranga', 24), " +
                "('Itapoá', 24), " +
                "('Ituporanga', 24), " +
                "('Jaborá', 24), " +
                "('Jacinto Machado', 24), " +
                "('Jaguaruna', 24), " +
                "('Jaraguá do Sul', 24), " +
                "('Jardinópolis', 24), " +
                "('Joaçaba', 24), " +
                "('Joinville', 24), " +
                "('José Boiteux', 24), " +
                "('Jupiá', 24), " +
                "('Lacerdópolis', 24), " +
                "('Lages', 24), " +
                "('Laguna', 24), " +
                "('Lajeado Grande', 24), " +
                "('Laurentino', 24), " +
                "('Lauro Muller', 24), " +
                "('Lebon Régis', 24), " +
                "('Leoberto Leal', 24), " +
                "('Lindóia do Sul', 24), " +
                "('Lontras', 24), " +
                "('Luiz Alves', 24), " +
                "('Luzerna', 24), " +
                "('Macieira', 24), " +
                "('Mafra', 24), " +
                "('Major Gercino', 24), " +
                "('Major Vieira', 24), " +
                "('Maracajá', 24), " +
                "('Maravilha', 24), " +
                "('Marema', 24), " +
                "('Massaranduba', 24), " +
                "('Matos Costa', 24), " +
                "('Meleiro', 24), " +
                "('Mirim Doce', 24), " +
                "('Modelo', 24), " +
                "('Mondaí', 24), " +
                "('Monte Carlo', 24), " +
                "('Monte Castelo', 24), " +
                "('Morro da Fumaça', 24), " +
                "('Morro Grande', 24), " +
                "('Navegantes', 24), " +
                "('Nova Erechim', 24), " +
                "('Nova Itaberaba', 24), " +
                "('Nova Trento', 24), " +
                "('Nova Veneza', 24), " +
                "('Novo Horizonte', 24), " +
                "('Orleans', 24), " +
                "('Otacílio Costa', 24), " +
                "('Ouro', 24), " +
                "('Ouro Verde', 24), " +
                "('Paial', 24), " +
                "('Painel', 24), " +
                "('Palhoça', 24), " +
                "('Palma Sola', 24), " +
                "('Palmeira', 24), " +
                "('Palmitos', 24), " +
                "('Papanduva', 24), " +
                "('Paraíso', 24), " +
                "('Passo de Torres', 24), " +
                "('Passos Maia', 24), " +
                "('Paulo Lopes', 24), " +
                "('Pedras Grandes', 24), " +
                "('Penha', 24), " +
                "('Peritiba', 24), " +
                "('Petrolândia', 24), " +
                "('Piçarras', 24), " +
                "('Pinhalzinho', 24), " +
                "('Pinheiro Preto', 24), " +
                "('Piratuba', 24), " +
                "('Planalto Alegre', 24), " +
                "('Pomerode', 24), " +
                "('Ponte Alta', 24), " +
                "('Ponte Alta do Norte', 24), " +
                "('Ponte Serrada', 24), " +
                "('Porto Belo', 24), " +
                "('Porto União', 24), " +
                "('Pouso Redondo', 24), " +
                "('Praia Grande', 24), " +
                "('Presidente Castelo Branco', 24), " +
                "('Presidente Getúlio', 24), " +
                "('Presidente Nereu', 24), " +
                "('Princesa', 24), " +
                "('Quilombo', 24), " +
                "('Rancho Queimado', 24), " +
                "('Rio das Antas', 24), " +
                "('Rio do Campo', 24), " +
                "('Rio do Oeste', 24), " +
                "('Rio do Sul', 24), " +
                "('Rio dos Cedros', 24), " +
                "('Rio Fortuna', 24), " +
                "('Rio Negrinho', 24), " +
                "('Rio Rufino', 24), " +
                "('Riqueza', 24), " +
                "('Rodeio', 24), " +
                "('Romelândia', 24), " +
                "('Salete', 24), " +
                "('Saltinho', 24), " +
                "('Salto Veloso', 24), " +
                "('Sangão', 24), " +
                "('Santa Cecília', 24), " +
                "('Santa Helena', 24), " +
                "('Santa Rosa de Lima', 24), " +
                "('Santa Rosa do Sul', 24), " +
                "('Santa Terezinha', 24), " +
                "('Santa Terezinha do Progresso', 24), " +
                "('Santiago do Sul', 24), " +
                "('Santo Amaro da Imperatriz', 24), " +
                "('São Bento do Sul', 24), " +
                "('São Bernardino', 24), " +
                "('São Bonifácio', 24), " +
                "('São Carlos', 24), " +
                "('São Cristovão do Sul', 24), " +
                "('São Domingos', 24), " +
                "('São Francisco do Sul', 24), " +
                "('São João Batista', 24), " +
                "('São João do Itaperiú', 24), " +
                "('São João do Oeste', 24), " +
                "('São João do Sul', 24), " +
                "('São Joaquim', 24), " +
                "('São José', 24), " +
                "('São José do Cedro', 24), " +
                "('São José do Cerrito', 24), " +
                "('São Lourenço do Oeste', 24), " +
                "('São Ludgero', 24), " +
                "('São Martinho', 24), " +
                "('São Miguel da Boa Vista', 24), " +
                "('São Miguel do Oeste', 24), " +
                "('São Pedro de Alcântara', 24), " +
                "('Saudades', 24), " +
                "('Schroeder', 24), " +
                "('Seara', 24), " +
                "('Serra Alta', 24), " +
                "('Siderópolis', 24), " +
                "('Sombrio', 24), " +
                "('Sul Brasil', 24), " +
                "('Taió', 24), " +
                "('Tangará', 24), " +
                "('Tigrinhos', 24), " +
                "('Tijucas', 24), " +
                "('Timbé do Sul', 24), " +
                "('Timbó', 24), " +
                "('Timbó Grande', 24), " +
                "('Três Barras', 24), " +
                "('Treviso', 24), " +
                "('Treze de Maio', 24), " +
                "('Treze Tílias', 24), " +
                "('Trombudo Central', 24), " +
                "('Tubarão', 24), " +
                "('Tunápolis', 24), " +
                "('Turvo', 24), " +
                "('União do Oeste', 24), " +
                "('Urubici', 24), " +
                "('Urupema', 24), " +
                "('Urussanga', 24), " +
                "('Vargeão', 24), " +
                "('Vargem', 24), " +
                "('Vargem Bonita', 24), " +
                "('Vidal Ramos', 24), " +
                "('Videira', 24), " +
                "('Vitor Meireles', 24), " +
                "('Witmarsum', 24), " +
                "('Xanxerê', 24), " +
                "('Xavantina', 24), " +
                "('Xaxim', 24), " +
                "('Zortéa', 24), " +
                "('Adamantina', 26), " +
                "('Adolfo', 26), " +
                "('Aguaí', 26), " +
                "('Águas da Prata', 26), " +
                "('Águas de Lindóia', 26), " +
                "('Águas de Santa Bárbara', 26), " +
                "('Águas de São Pedro', 26), " +
                "('Agudos', 26), " +
                "('Alambari', 26), " +
                "('Alfredo Marcondes', 26), " +
                "('Altair', 26), " +
                "('Altinópolis', 26), " +
                "('Alto Alegre', 26), " +
                "('Alumínio', 26), " +
                "('Álvares Florence', 26), " +
                "('Álvares Machado', 26), " +
                "('Álvaro de Carvalho', 26), " +
                "('Alvinlândia', 26), " +
                "('Americana', 26), " +
                "('Américo Brasiliense', 26), " +
                "('Américo de Campos', 26), " +
                "('Amparo', 26), " +
                "('Analândia', 26), " +
                "('Andradina', 26), " +
                "('Angatuba', 26), " +
                "('Anhembi', 26), " +
                "('Anhumas', 26), " +
                "('Aparecida', 26), " +
                "('Aparecida d`Oeste', 26), " +
                "('Apiaí', 26), " +
                "('Araçariguama', 26), " +
                "('Araçatuba', 26), " +
                "('Araçoiaba da Serra', 26), " +
                "('Aramina', 26), " +
                "('Arandu', 26), " +
                "('Arapeí', 26), " +
                "('Araraquara', 26), " +
                "('Araras', 26), " +
                "('Arco-Íris', 26), " +
                "('Arealva', 26), " +
                "('Areias', 26), " +
                "('Areiópolis', 26), " +
                "('Ariranha', 26), " +
                "('Artur Nogueira', 26), " +
                "('Arujá', 26), " +
                "('Aspásia', 26), " +
                "('Assis', 26), " +
                "('Atibaia', 26), " +
                "('Auriflama', 26), " +
                "('Avaí', 26), " +
                "('Avanhandava', 26), " +
                "('Avaré', 26), " +
                "('Bady Bassitt', 26), " +
                "('Balbinos', 26), " +
                "('Bálsamo', 26), " +
                "('Bananal', 26), " +
                "('Barão de Antonina', 26), " +
                "('Barbosa', 26), " +
                "('Bariri', 26), " +
                "('Barra Bonita', 26), " +
                "('Barra do Chapéu', 26), " +
                "('Barra do Turvo', 26), " +
                "('Barretos', 26), " +
                "('Barrinha', 26), " +
                "('Barueri', 26), " +
                "('Bastos', 26), " +
                "('Batatais', 26), " +
                "('Bauru', 26), " +
                "('Bebedouro', 26), " +
                "('Bento de Abreu', 26), " +
                "('Bernardino de Campos', 26), " +
                "('Bertioga', 26), " +
                "('Bilac', 26), " +
                "('Birigui', 26), " +
                "('Biritiba-Mirim', 26), " +
                "('Boa Esperança do Sul', 26), " +
                "('Bocaina', 26), " +
                "('Bofete', 26), " +
                "('Boituva', 26), " +
                "('Bom Jesus dos Perdões', 26), " +
                "('Bom Sucesso de Itararé', 26), " +
                "('Borá', 26), " +
                "('Boracéia', 26), " +
                "('Borborema', 26), " +
                "('Borebi', 26), " +
                "('Botucatu', 26), " +
                "('Bragança Paulista', 26), " +
                "('Braúna', 26), " +
                "('Brejo Alegre', 26), " +
                "('Brodowski', 26), " +
                "('Brotas', 26), " +
                "('Buri', 26), " +
                "('Buritama', 26), " +
                "('Buritizal', 26), " +
                "('Cabrália Paulista', 26), " +
                "('Cabreúva', 26), " +
                "('Caçapava', 26), " +
                "('Cachoeira Paulista', 26), " +
                "('Caconde', 26), " +
                "('Cafelândia', 26), " +
                "('Caiabu', 26), " +
                "('Caieiras', 26), " +
                "('Caiuá', 26), " +
                "('Cajamar', 26), " +
                "('Cajati', 26), " +
                "('Cajobi', 26), " +
                "('Cajuru', 26), " +
                "('Campina do Monte Alegre', 26), " +
                "('Campinas', 26), " +
                "('Campo Limpo Paulista', 26), " +
                "('Campos do Jordão', 26), " +
                "('Campos Novos Paulista', 26), " +
                "('Cananéia', 26), " +
                "('Canas', 26), " +
                "('Cândido Mota', 26), " +
                "('Cândido Rodrigues', 26), " +
                "('Canitar', 26), " +
                "('Capão Bonito', 26), " +
                "('Capela do Alto', 26), " +
                "('Capivari', 26), " +
                "('Caraguatatuba', 26), " +
                "('Carapicuíba', 26), " +
                "('Cardoso', 26), " +
                "('Casa Branca', 26), " +
                "('Cássia dos Coqueiros', 26), " +
                "('Castilho', 26), " +
                "('Catanduva', 26), " +
                "('Catiguá', 26), " +
                "('Cedral', 26), " +
                "('Cerqueira César', 26), " +
                "('Cerquilho', 26), " +
                "('Cesário Lange', 26), " +
                "('Charqueada', 26), " +
                "('Chavantes', 26), " +
                "('Clementina', 26), " +
                "('Colina', 26), " +
                "('Colômbia', 26), " +
                "('Conchal', 26), " +
                "('Conchas', 26), " +
                "('Cordeirópolis', 26), " +
                "('Coroados', 26), " +
                "('Coronel Macedo', 26), " +
                "('Corumbataí', 26), " +
                "('Cosmópolis', 26), " +
                "('Cosmorama', 26), " +
                "('Cotia', 26), " +
                "('Cravinhos', 26), " +
                "('Cristais Paulista', 26), " +
                "('Cruzália', 26), " +
                "('Cruzeiro', 26), " +
                "('Cubatão', 26), " +
                "('Cunha', 26), " +
                "('Descalvado', 26), " +
                "('Diadema', 26), " +
                "('Dirce Reis', 26), " +
                "('Divinolândia', 26), " +
                "('Dobrada', 26), " +
                "('Dois Córregos', 26), " +
                "('Dolcinópolis', 26), " +
                "('Dourado', 26), " +
                "('Dracena', 26), " +
                "('Duartina', 26), " +
                "('Dumont', 26), " +
                "('Echaporã', 26), " +
                "('Eldorado', 26), " +
                "('Elias Fausto', 26), " +
                "('Elisiário', 26), " +
                "('Embaúba', 26), " +
                "('Embu', 26), " +
                "('Embu-Guaçu', 26), " +
                "('Emilianópolis', 26), " +
                "('Engenheiro Coelho', 26), " +
                "('Espírito Santo do Pinhal', 26), " +
                "('Espírito Santo do Turvo', 26), " +
                "('Estiva Gerbi', 26), " +
                "('Estrela d`Oeste', 26), " +
                "('Estrela do Norte', 26), " +
                "('Euclides da Cunha Paulista', 26), " +
                "('Fartura', 26), " +
                "('Fernando Prestes', 26), " +
                "('Fernandópolis', 26), " +
                "('Fernão', 26), " +
                "('Ferraz de Vasconcelos', 26), " +
                "('Flora Rica', 26), " +
                "('Floreal', 26), " +
                "('Flórida Paulista', 26), " +
                "('Florínia', 26), " +
                "('Franca', 26), " +
                "('Francisco Morato', 26), " +
                "('Franco da Rocha', 26), " +
                "('Gabriel Monteiro', 26), " +
                "('Gália', 26), " +
                "('Garça', 26), " +
                "('Gastão Vidigal', 26), " +
                "('Gavião Peixoto', 26), " +
                "('General Salgado', 26), " +
                "('Getulina', 26), " +
                "('Glicério', 26), " +
                "('Guaiçara', 26), " +
                "('Guaimbê', 26), " +
                "('Guaíra', 26), " +
                "('Guapiaçu', 26), " +
                "('Guapiara', 26), " +
                "('Guará', 26), " +
                "('Guaraçaí', 26), " +
                "('Guaraci', 26), " +
                "('Guarani d`Oeste', 26), " +
                "('Guarantã', 26), " +
                "('Guararapes', 26), " +
                "('Guararema', 26), " +
                "('Guaratinguetá', 26), " +
                "('Guareí', 26), " +
                "('Guariba', 26), " +
                "('Guarujá', 26), " +
                "('Guarulhos', 26), " +
                "('Guatapará', 26), " +
                "('Guzolândia', 26), " +
                "('Herculândia', 26), " +
                "('Holambra', 26), " +
                "('Hortolândia', 26), " +
                "('Iacanga', 26), " +
                "('Iacri', 26), " +
                "('Iaras', 26), " +
                "('Ibaté', 26), " +
                "('Ibirá', 26), " +
                "('Ibirarema', 26), " +
                "('Ibitinga', 26), " +
                "('Ibiúna', 26), " +
                "('Icém', 26), " +
                "('Iepê', 26), " +
                "('Igaraçu do Tietê', 26), " +
                "('Igarapava', 26), " +
                "('Igaratá', 26), " +
                "('Iguape', 26), " +
                "('Ilha Comprida', 26), " +
                "('Ilha Solteira', 26), " +
                "('Ilhabela', 26), " +
                "('Indaiatuba', 26), " +
                "('Indiana', 26), " +
                "('Indiaporã', 26), " +
                "('Inúbia Paulista', 26), " +
                "('Ipaussu', 26), " +
                "('Iperó', 26), " +
                "('Ipeúna', 26), " +
                "('Ipiguá', 26), " +
                "('Iporanga', 26), " +
                "('Ipuã', 26), " +
                "('Iracemápolis', 26), " +
                "('Irapuã', 26), " +
                "('Irapuru', 26), " +
                "('Itaberá', 26), " +
                "('Itaí', 26), " +
                "('Itajobi', 26), " +
                "('Itaju', 26), " +
                "('Itanhaém', 26), " +
                "('Itaóca', 26), " +
                "('Itapecerica da Serra', 26), " +
                "('Itapetininga', 26), " +
                "('Itapeva', 26), " +
                "('Itapevi', 26), " +
                "('Itapira', 26), " +
                "('Itapirapuã Paulista', 26), " +
                "('Itápolis', 26), " +
                "('Itaporanga', 26), " +
                "('Itapuí', 26), " +
                "('Itapura', 26), " +
                "('Itaquaquecetuba', 26), " +
                "('Itararé', 26), " +
                "('Itariri', 26), " +
                "('Itatiba', 26), " +
                "('Itatinga', 26), " +
                "('Itirapina', 26), " +
                "('Itirapuã', 26), " +
                "('Itobi', 26), " +
                "('Itu', 26), " +
                "('Itupeva', 26), " +
                "('Ituverava', 26), " +
                "('Jaborandi', 26), " +
                "('Jaboticabal', 26), " +
                "('Jacareí', 26), " +
                "('Jaci', 26), " +
                "('Jacupiranga', 26), " +
                "('Jaguariúna', 26), " +
                "('Jales', 26), " +
                "('Jambeiro', 26), " +
                "('Jandira', 26), " +
                "('Jardinópolis', 26), " +
                "('Jarinu', 26), " +
                "('Jaú', 26), " +
                "('Jeriquara', 26), " +
                "('Joanópolis', 26), " +
                "('João Ramalho', 26), " +
                "('José Bonifácio', 26), " +
                "('Júlio Mesquita', 26), " +
                "('Jumirim', 26), " +
                "('Jundiaí', 26), " +
                "('Junqueirópolis', 26), " +
                "('Juquiá', 26), " +
                "('Juquitiba', 26), " +
                "('Lagoinha', 26), " +
                "('Laranjal Paulista', 26), " +
                "('Lavínia', 26), " +
                "('Lavrinhas', 26), " +
                "('Leme', 26), " +
                "('Lençóis Paulista', 26), " +
                "('Limeira', 26), " +
                "('Lindóia', 26), " +
                "('Lins', 26), " +
                "('Lorena', 26), " +
                "('Lourdes', 26), " +
                "('Louveira', 26), " +
                "('Lucélia', 26), " +
                "('Lucianópolis', 26), " +
                "('Luís Antônio', 26), " +
                "('Luiziânia', 26), " +
                "('Lupércio', 26), " +
                "('Lutécia', 26), " +
                "('Macatuba', 26), " +
                "('Macaubal', 26), " +
                "('Macedônia', 26), " +
                "('Magda', 26), " +
                "('Mairinque', 26), " +
                "('Mairiporã', 26), " +
                "('Manduri', 26), " +
                "('Marabá Paulista', 26), " +
                "('Maracaí', 26), " +
                "('Marapoama', 26), " +
                "('Mariápolis', 26), " +
                "('Marília', 26), " +
                "('Marinópolis', 26), " +
                "('Martinópolis', 26), " +
                "('Matão', 26), " +
                "('Mauá', 26), " +
                "('Mendonça', 26), " +
                "('Meridiano', 26), " +
                "('Mesópolis', 26), " +
                "('Miguelópolis', 26), " +
                "('Mineiros do Tietê', 26), " +
                "('Mira Estrela', 26), " +
                "('Miracatu', 26), " +
                "('Mirandópolis', 26), " +
                "('Mirante do Paranapanema', 26), " +
                "('Mirassol', 26), " +
                "('Mirassolândia', 26), " +
                "('Mococa', 26), " +
                "('Mogi das Cruzes', 26), " +
                "('Mogi Guaçu', 26), " +
                "('Moji Mirim', 26), " +
                "('Mombuca', 26), " +
                "('Monções', 26), " +
                "('Mongaguá', 26), " +
                "('Monte Alegre do Sul', 26), " +
                "('Monte Alto', 26), " +
                "('Monte Aprazível', 26), " +
                "('Monte Azul Paulista', 26), " +
                "('Monte Castelo', 26), " +
                "('Monte Mor', 26), " +
                "('Monteiro Lobato', 26), " +
                "('Morro Agudo', 26), " +
                "('Morungaba', 26), " +
                "('Motuca', 26), " +
                "('Murutinga do Sul', 26), " +
                "('Nantes', 26), " +
                "('Narandiba', 26), " +
                "('Natividade da Serra', 26), " +
                "('Nazaré Paulista', 26), " +
                "('Neves Paulista', 26), " +
                "('Nhandeara', 26), " +
                "('Nipoã', 26), " +
                "('Nova Aliança', 26), " +
                "('Nova Campina', 26), " +
                "('Nova Canaã Paulista', 26), " +
                "('Nova Castilho', 26), " +
                "('Nova Europa', 26), " +
                "('Nova Granada', 26), " +
                "('Nova Guataporanga', 26), " +
                "('Nova Independência', 26), " +
                "('Nova Luzitânia', 26), " +
                "('Nova Odessa', 26), " +
                "('Novais', 26), " +
                "('Novo Horizonte', 26), " +
                "('Nuporanga', 26), " +
                "('Ocauçu', 26), " +
                "('Óleo', 26), " +
                "('Olímpia', 26), " +
                "('Onda Verde', 26), " +
                "('Oriente', 26), " +
                "('Orindiúva', 26), " +
                "('Orlândia', 26), " +
                "('Osasco', 26), " +
                "('Oscar Bressane', 26), " +
                "('Osvaldo Cruz', 26), " +
                "('Ourinhos', 26), " +
                "('Ouro Verde', 26), " +
                "('Ouroeste', 26), " +
                "('Pacaembu', 26), " +
                "('Palestina', 26), " +
                "('Palmares Paulista', 26), " +
                "('Palmeira d`Oeste', 26), " +
                "('Palmital', 26), " +
                "('Panorama', 26), " +
                "('Paraguaçu Paulista', 26), " +
                "('Paraibuna', 26), " +
                "('Paraíso', 26), " +
                "('Paranapanema', 26), " +
                "('Paranapuã', 26), " +
                "('Parapuã', 26), " +
                "('Pardinho', 26), " +
                "('Pariquera-Açu', 26), " +
                "('Parisi', 26), " +
                "('Patrocínio Paulista', 26), " +
                "('Paulicéia', 26), " +
                "('Paulínia', 26), " +
                "('Paulistânia', 26), " +
                "('Paulo de Faria', 26), " +
                "('Pederneiras', 26), " +
                "('Pedra Bela', 26), " +
                "('Pedranópolis', 26), " +
                "('Pedregulho', 26), " +
                "('Pedreira', 26), " +
                "('Pedrinhas Paulista', 26), " +
                "('Pedro de Toledo', 26), " +
                "('Penápolis', 26), " +
                "('Pereira Barreto', 26), " +
                "('Pereiras', 26), " +
                "('Peruíbe', 26), " +
                "('Piacatu', 26), " +
                "('Piedade', 26), " +
                "('Pilar do Sul', 26), " +
                "('Pindamonhangaba', 26), " +
                "('Pindorama', 26), " +
                "('Pinhalzinho', 26), " +
                "('Piquerobi', 26), " +
                "('Piquete', 26), " +
                "('Piracaia', 26), " +
                "('Piracicaba', 26), " +
                "('Piraju', 26), " +
                "('Pirajuí', 26), " +
                "('Pirangi', 26), " +
                "('Pirapora do Bom Jesus', 26), " +
                "('Pirapozinho', 26), " +
                "('Pirassununga', 26), " +
                "('Piratininga', 26), " +
                "('Pitangueiras', 26), " +
                "('Planalto', 26), " +
                "('Platina', 26), " +
                "('Poá', 26), " +
                "('Poloni', 26), " +
                "('Pompéia', 26), " +
                "('Pongaí', 26), " +
                "('Pontal', 26), " +
                "('Pontalinda', 26), " +
                "('Pontes Gestal', 26), " +
                "('Populina', 26), " +
                "('Porangaba', 26), " +
                "('Porto Feliz', 26), " +
                "('Porto Ferreira', 26), " +
                "('Potim', 26), " +
                "('Potirendaba', 26), " +
                "('Pracinha', 26), " +
                "('Pradópolis', 26), " +
                "('Praia Grande', 26), " +
                "('Pratânia', 26), " +
                "('Presidente Alves', 26), " +
                "('Presidente Bernardes', 26), " +
                "('Presidente Epitácio', 26), " +
                "('Presidente Prudente', 26), " +
                "('Presidente Venceslau', 26), " +
                "('Promissão', 26), " +
                "('Quadra', 26), " +
                "('Quatá', 26), " +
                "('Queiroz', 26), " +
                "('Queluz', 26), " +
                "('Quintana', 26), " +
                "('Rafard', 26), " +
                "('Rancharia', 26), " +
                "('Redenção da Serra', 26), " +
                "('Regente Feijó', 26), " +
                "('Reginópolis', 26), " +
                "('Registro', 26), " +
                "('Restinga', 26), " +
                "('Ribeira', 26), " +
                "('Ribeirão Bonito', 26), " +
                "('Ribeirão Branco', 26), " +
                "('Ribeirão Corrente', 26), " +
                "('Ribeirão do Sul', 26), " +
                "('Ribeirão dos Índios', 26), " +
                "('Ribeirão Grande', 26), " +
                "('Ribeirão Pires', 26), " +
                "('Ribeirão Preto', 26), " +
                "('Rifaina', 26), " +
                "('Rincão', 26), " +
                "('Rinópolis', 26), " +
                "('Rio Claro', 26), " +
                "('Rio das Pedras', 26), " +
                "('Rio Grande da Serra', 26), " +
                "('Riolândia', 26), " +
                "('Riversul', 26), " +
                "('Rosana', 26), " +
                "('Roseira', 26), " +
                "('Rubiácea', 26), " +
                "('Rubinéia', 26), " +
                "('Sabino', 26), " +
                "('Sagres', 26), " +
                "('Sales', 26), " +
                "('Sales Oliveira', 26), " +
                "('Salesópolis', 26), " +
                "('Salmourão', 26), " +
                "('Saltinho', 26), " +
                "('Salto', 26), " +
                "('Salto de Pirapora', 26), " +
                "('Salto Grande', 26), " +
                "('Sandovalina', 26), " +
                "('Santa Adélia', 26), " +
                "('Santa Albertina', 26), " +
                "('Santa Bárbara d`Oeste', 26), " +
                "('Santa Branca', 26), " +
                "('Santa Clara d`Oeste', 26), " +
                "('Santa Cruz da Conceição', 26), " +
                "('Santa Cruz da Esperança', 26), " +
                "('Santa Cruz das Palmeiras', 26), " +
                "('Santa Cruz do Rio Pardo', 26), " +
                "('Santa Ernestina', 26), " +
                "('Santa Fé do Sul', 26), " +
                "('Santa Gertrudes', 26), " +
                "('Santa Isabel', 26), " +
                "('Santa Lúcia', 26), " +
                "('Santa Maria da Serra', 26), " +
                "('Santa Mercedes', 26), " +
                "('Santa Rita d`Oeste', 26), " +
                "('Santa Rita do Passa Quatro', 26), " +
                "('Santa Rosa de Viterbo', 26), " +
                "('Santa Salete', 26), " +
                "('Santana da Ponte Pensa', 26), " +
                "('Santana de Parnaíba', 26), " +
                "('Santo Anastácio', 26), " +
                "('Santo André', 26), " +
                "('Santo Antônio da Alegria', 26), " +
                "('Santo Antônio de Posse', 26), " +
                "('Santo Antônio do Aracanguá', 26), " +
                "('Santo Antônio do Jardim', 26), " +
                "('Santo Antônio do Pinhal', 26), " +
                "('Santo Expedito', 26), " +
                "('Santópolis do Aguapeí', 26), " +
                "('Santos', 26), " +
                "('São Bento do Sapucaí', 26), " +
                "('São Bernardo do Campo', 26), " +
                "('São Caetano do Sul', 26), " +
                "('São Carlos', 26), " +
                "('São Francisco', 26), " +
                "('São João da Boa Vista', 26), " +
                "('São João das Duas Pontes', 26), " +
                "('São João de Iracema', 26), " +
                "('São João do Pau d`Alho', 26), " +
                "('São Joaquim da Barra', 26), " +
                "('São José da Bela Vista', 26), " +
                "('São José do Barreiro', 26), " +
                "('São José do Rio Pardo', 26), " +
                "('São José do Rio Preto', 26), " +
                "('São José dos Campos', 26), " +
                "('São Lourenço da Serra', 26), " +
                "('São Luís do Paraitinga', 26), " +
                "('São Manuel', 26), " +
                "('São Miguel Arcanjo', 26), " +
                "('São Paulo', 26), " +
                "('São Pedro', 26), " +
                "('São Pedro do Turvo', 26), " +
                "('São Roque', 26), " +
                "('São Sebastião', 26), " +
                "('São Sebastião da Grama', 26), " +
                "('São Simão', 26), " +
                "('São Vicente', 26), " +
                "('Sarapuí', 26), " +
                "('Sarutaiá', 26), " +
                "('Sebastianópolis do Sul', 26), " +
                "('Serra Azul', 26), " +
                "('Serra Negra', 26), " +
                "('Serrana', 26), " +
                "('Sertãozinho', 26), " +
                "('Sete Barras', 26), " +
                "('Severínia', 26), " +
                "('Silveiras', 26), " +
                "('Socorro', 26), " +
                "('Sorocaba', 26), " +
                "('Sud Mennucci', 26), " +
                "('Sumaré', 26), " +
                "('Suzanápolis', 26), " +
                "('Suzano', 26), " +
                "('Tabapuã', 26), " +
                "('Tabatinga', 26), " +
                "('Taboão da Serra', 26), " +
                "('Taciba', 26), " +
                "('Taguaí', 26), " +
                "('Taiaçu', 26), " +
                "('Taiúva', 26), " +
                "('Tambaú', 26), " +
                "('Tanabi', 26), " +
                "('Tapiraí', 26), " +
                "('Tapiratiba', 26), " +
                "('Taquaral', 26), " +
                "('Taquaritinga', 26), " +
                "('Taquarituba', 26), " +
                "('Taquarivaí', 26), " +
                "('Tarabai', 26), " +
                "('Tarumã', 26), " +
                "('Tatuí', 26), " +
                "('Taubaté', 26), " +
                "('Tejupá', 26), " +
                "('Teodoro Sampaio', 26), " +
                "('Terra Roxa', 26), " +
                "('Tietê', 26), " +
                "('Timburi', 26), " +
                "('Torre de Pedra', 26), " +
                "('Torrinha', 26), " +
                "('Trabiju', 26), " +
                "('Tremembé', 26), " +
                "('Três Fronteiras', 26), " +
                "('Tuiuti', 26), " +
                "('Tupã', 26), " +
                "('Tupi Paulista', 26), " +
                "('Turiúba', 26), " +
                "('Turmalina', 26), " +
                "('Ubarana', 26), " +
                "('Ubatuba', 26), " +
                "('Ubirajara', 26), " +
                "('Uchoa', 26), " +
                "('União Paulista', 26), " +
                "('Urânia', 26), " +
                "('Uru', 26), " +
                "('Urupês', 26), " +
                "('Valentim Gentil', 26), " +
                "('Valinhos', 26), " +
                "('Valparaíso', 26), " +
                "('Vargem', 26), " +
                "('Vargem Grande do Sul', 26), " +
                "('Vargem Grande Paulista', 26), " +
                "('Várzea Paulista', 26), " +
                "('Vera Cruz', 26), " +
                "('Vinhedo', 26), " +
                "('Viradouro', 26), " +
                "('Vista Alegre do Alto', 26), " +
                "('Vitória Brasil', 26), " +
                "('Votorantim', 26), " +
                "('Votuporanga', 26), " +
                "('Zacarias', 26), " +
                "('Amparo de São Francisco', 25), " +
                "('Aquidabã', 25), " +
                "('Aracaju', 25), " +
                "('Arauá', 25), " +
                "('Areia Branca', 25), " +
                "('Barra dos Coqueiros', 25), " +
                "('Boquim', 25), " +
                "('Brejo Grande', 25), " +
                "('Campo do Brito', 25), " +
                "('Canhoba', 25), " +
                "('Canindé de São Francisco', 25), " +
                "('Capela', 25), " +
                "('Carira', 25), " +
                "('Carmópolis', 25), " +
                "('Cedro de São João', 25), " +
                "('Cristinápolis', 25), " +
                "('Cumbe', 25), " +
                "('Divina Pastora', 25), " +
                "('Estância', 25), " +
                "('Feira Nova', 25), " +
                "('Frei Paulo', 25), " +
                "('Gararu', 25), " +
                "('General Maynard', 25), " +
                "('Gracho Cardoso', 25), " +
                "('Ilha das Flores', 25), " +
                "('Indiaroba', 25), " +
                "('Itabaiana', 25), " +
                "('Itabaianinha', 25), " +
                "('Itabi', 25), " +
                "('Itaporanga d`Ajuda', 25), " +
                "('Japaratuba', 25), " +
                "('Japoatã', 25), " +
                "('Lagarto', 25), " +
                "('Laranjeiras', 25), " +
                "('Macambira', 25), " +
                "('Malhada dos Bois', 25), " +
                "('Malhador', 25), " +
                "('Maruim', 25), " +
                "('Moita Bonita', 25), " +
                "('Monte Alegre de Sergipe', 25), " +
                "('Muribeca', 25), " +
                "('Neópolis', 25), " +
                "('Nossa Senhora Aparecida', 25), " +
                "('Nossa Senhora da Glória', 25), " +
                "('Nossa Senhora das Dores', 25), " +
                "('Nossa Senhora de Lourdes', 25), " +
                "('Nossa Senhora do Socorro', 25), " +
                "('Pacatuba', 25), " +
                "('Pedra Mole', 25), " +
                "('Pedrinhas', 25), " +
                "('Pinhão', 25), " +
                "('Pirambu', 25), " +
                "('Poço Redondo', 25), " +
                "('Poço Verde', 25), " +
                "('Porto da Folha', 25), " +
                "('Propriá', 25), " +
                "('Riachão do Dantas', 25), " +
                "('Riachuelo', 25), " +
                "('Ribeirópolis', 25), " +
                "('Rosário do Catete', 25), " +
                "('Salgado', 25), " +
                "('Santa Luzia do Itanhy', 25), " +
                "('Santa Rosa de Lima', 25), " +
                "('Santana do São Francisco', 25), " +
                "('Santo Amaro das Brotas', 25), " +
                "('São Cristóvão', 25), " +
                "('São Domingos', 25), " +
                "('São Francisco', 25), " +
                "('São Miguel do Aleixo', 25), " +
                "('Simão Dias', 25), " +
                "('Siriri', 25), " +
                "('Telha', 25), " +
                "('Tobias Barreto', 25), " +
                "('Tomar do Geru', 25), " +
                "('Umbaúba', 25), " +
                "('Abreulândia', 27), " +
                "('Aguiarnópolis', 27), " +
                "('Aliança do Tocantins', 27), " +
                "('Almas', 27), " +
                "('Alvorada', 27), " +
                "('Ananás', 27), " +
                "('Angico', 27), " +
                "('Aparecida do Rio Negro', 27), " +
                "('Aragominas', 27), " +
                "('Araguacema', 27), " +
                "('Araguaçu', 27), " +
                "('Araguaína', 27), " +
                "('Araguanã', 27), " +
                "('Araguatins', 27), " +
                "('Arapoema', 27), " +
                "('Arraias', 27), " +
                "('Augustinópolis', 27), " +
                "('Aurora do Tocantins', 27), " +
                "('Axixá do Tocantins', 27), " +
                "('Babaçulândia', 27), " +
                "('Bandeirantes do Tocantins', 27), " +
                "('Barra do Ouro', 27), " +
                "('Barrolândia', 27), " +
                "('Bernardo Sayão', 27), " +
                "('Bom Jesus do Tocantins', 27), " +
                "('Brasilândia do Tocantins', 27), " +
                "('Brejinho de Nazaré', 27), " +
                "('Buriti do Tocantins', 27), " +
                "('Cachoeirinha', 27), " +
                "('Campos Lindos', 27), " +
                "('Cariri do Tocantins', 27), " +
                "('Carmolândia', 27), " +
                "('Carrasco Bonito', 27), " +
                "('Caseara', 27), " +
                "('Centenário', 27), " +
                "('Chapada da Natividade', 27), " +
                "('Chapada de Areia', 27), " +
                "('Colinas do Tocantins', 27), " +
                "('Colméia', 27), " +
                "('Combinado', 27), " +
                "('Conceição do Tocantins', 27), " +
                "('Couto de Magalhães', 27), " +
                "('Cristalândia', 27), " +
                "('Crixás do Tocantins', 27), " +
                "('Darcinópolis', 27), " +
                "('Dianópolis', 27), " +
                "('Divinópolis do Tocantins', 27), " +
                "('Dois Irmãos do Tocantins', 27), " +
                "('Dueré', 27), " +
                "('Esperantina', 27), " +
                "('Fátima', 27), " +
                "('Figueirópolis', 27), " +
                "('Filadélfia', 27), " +
                "('Formoso do Araguaia', 27), " +
                "('Fortaleza do Tabocão', 27), " +
                "('Goianorte', 27), " +
                "('Goiatins', 27), " +
                "('Guaraí', 27), " +
                "('Gurupi', 27), " +
                "('Ipueiras', 27), " +
                "('Itacajá', 27), " +
                "('Itaguatins', 27), " +
                "('Itapiratins', 27), " +
                "('Itaporã do Tocantins', 27), " +
                "('Jaú do Tocantins', 27), " +
                "('Juarina', 27), " +
                "('Lagoa da Confusão', 27), " +
                "('Lagoa do Tocantins', 27), " +
                "('Lajeado', 27), " +
                "('Lavandeira', 27), " +
                "('Lizarda', 27), " +
                "('Luzinópolis', 27), " +
                "('Marianópolis do Tocantins', 27), " +
                "('Mateiros', 27), " +
                "('Maurilândia do Tocantins', 27), " +
                "('Miracema do Tocantins', 27), " +
                "('Miranorte', 27), " +
                "('Monte do Carmo', 27), " +
                "('Monte Santo do Tocantins', 27), " +
                "('Muricilândia', 27), " +
                "('Natividade', 27), " +
                "('Nazaré', 27), " +
                "('Nova Olinda', 27), " +
                "('Nova Rosalândia', 27), " +
                "('Novo Acordo', 27), " +
                "('Novo Alegre', 27), " +
                "('Novo Jardim', 27), " +
                "('Oliveira de Fátima', 27), " +
                "('Palmas', 27), " +
                "('Palmeirante', 27), " +
                "('Palmeiras do Tocantins', 27), " +
                "('Palmeirópolis', 27), " +
                "('Paraíso do Tocantins', 27), " +
                "('Paranã', 27), " +
                "('Pau d`Arco', 27), " +
                "('Pedro Afonso', 27), " +
                "('Peixe', 27), " +
                "('Pequizeiro', 27), " +
                "('Pindorama do Tocantins', 27), " +
                "('Piraquê', 27), " +
                "('Pium', 27), " +
                "('Ponte Alta do Bom Jesus', 27), " +
                "('Ponte Alta do Tocantins', 27), " +
                "('Porto Alegre do Tocantins', 27), " +
                "('Porto Nacional', 27), " +
                "('Praia Norte', 27), " +
                "('Presidente Kennedy', 27), " +
                "('Pugmil', 27), " +
                "('Recursolândia', 27), " +
                "('Riachinho', 27), " +
                "('Rio da Conceição', 27), " +
                "('Rio dos Bois', 27), " +
                "('Rio Sono', 27), " +
                "('Sampaio', 27), " +
                "('Sandolândia', 27), " +
                "('Santa Fé do Araguaia', 27), " +
                "('Santa Maria do Tocantins', 27), " +
                "('Santa Rita do Tocantins', 27), " +
                "('Santa Rosa do Tocantins', 27), " +
                "('Santa Tereza do Tocantins', 27), " +
                "('Santa Terezinha do Tocantins', 27), " +
                "('São Bento do Tocantins', 27), " +
                "('São Félix do Tocantins', 27), " +
                "('São Miguel do Tocantins', 27), " +
                "('São Salvador do Tocantins', 27), " +
                "('São Sebastião do Tocantins', 27), " +
                "('São Valério da Natividade', 27), " +
                "('Silvanópolis', 27), " +
                "('Sítio Novo do Tocantins', 27), " +
                "('Sucupira', 27), " +
                "('Taguatinga', 27), " +
                "('Taipas do Tocantins', 27), " +
                "('Talismã', 27), " +
                "('Tocantínia', 27), " +
                "('Tocantinópolis', 27), " +
                "('Tupirama', 27), " +
                "('Tupiratins', 27), " +
                "('Wanderlândia', 27), " +
                "('Xambioá', 27);";
    }
    
}
