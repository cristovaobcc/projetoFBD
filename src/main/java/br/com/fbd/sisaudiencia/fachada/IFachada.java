/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.fachada;

import br.com.fbd.sisaudiencia.excecoes.SalaDeAudienciaException;
import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.Advogado;
import br.com.fbd.sisaudiencia.model.Endereco;
import br.com.fbd.sisaudiencia.model.Estado;
import br.com.fbd.sisaudiencia.model.Municipio;
import br.com.fbd.sisaudiencia.model.RegistroOAB;
import br.com.fbd.sisaudiencia.model.SalaAudiencia;
import br.com.fbd.sisaudiencia.model.TipoDeAcao;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IFachada {
    // Métodos relativos ao model Vara
    boolean cadastrarVara(Vara vara) throws VaraException;
    boolean removerVara(Integer id);
    Vara atualizar(Integer id);
    Vara buscarVara(Integer id);
    List<Vara> getVaras();
    
    // Métodos relativos ao model TipoDeAcao
    boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException;
    boolean removerTipoDeAcao(int id);
    TipoDeAcao buscarTipoDeAcao(int id);
    boolean editarTipoDeAcao(int id);
    
    // Métodos relativos ao model SalaAudiencia
     boolean cadastrarSalaAudiencia(SalaAudiencia salaAudiencia) 
            throws SalaDeAudienciaException;
    boolean removerSalaAudiencia(Integer id);
    SalaAudiencia atualizarSalaAudiencia(Integer id);
    SalaAudiencia buscarSalaAudiencia(Integer id);
    List<SalaAudiencia> getSalasAudiencia(); 

    // Métodos relativos ao model Estado
    boolean carregarEstados();
    Estado getEstado(Integer id);
    List<Estado> getAll();
    List<Municipio> getMunicipios();
    
    // Métodos relativos ao model Municipio
    boolean carregarMunicipios();
    Municipio getMunicipio(Integer id);
    List<Municipio> getAll(Integer idEstado);
    
    // Métodos relativos ao model Endereco
    boolean cadastrarEndereco(Endereco endereco); // Create
    Endereco buscarEndereco(int id); // Recover
    Endereco atualizarEndereco(int id); // UpDate
    boolean removerEndereco(int id); // Delete
    List<Endereco> getEnderecos();
    
    // Métodos relativos ao model RegistroOAB
    boolean adicionarRegistroOab(RegistroOAB r);
    RegistroOAB recuperarRegistroOab(String numero);
    RegistroOAB atualizarRegistroOAB(String numero);
    boolean removerRegistroOAB(String numero);
    
    
    // Métodos relativos ao model Advogado
    boolean adicionarAdvogado(Advogado a);
    Advogado recupergarAdvogado(String nome);
    Advogado atualizarAdvogado(String nome);
    boolean removerAdvogado(String cpf);
    
    // Métodos relativos a outros models devem ser postos daqui para baixo.
    // Separe-os por model.
}
