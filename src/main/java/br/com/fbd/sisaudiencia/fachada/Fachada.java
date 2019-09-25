/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.fachada;

import br.com.fbd.sisaudiencia.business.BusinessEstado;
import br.com.fbd.sisaudiencia.business.BusinessMunicipio;
import br.com.fbd.sisaudiencia.business.BusinessRegistroOAB;
import br.com.fbd.sisaudiencia.business.BusinessSalaDeAudiencia;
import br.com.fbd.sisaudiencia.business.BusinessTipoDeAcao;
import br.com.fbd.sisaudiencia.business.BusinessVara;
import br.com.fbd.sisaudiencia.business.IBusinessEstado;
import br.com.fbd.sisaudiencia.business.IBusinessMunicipio;
import br.com.fbd.sisaudiencia.business.IBusinessRegistroOAB;
import br.com.fbd.sisaudiencia.business.IBusinessSalaDeAudiencia;
import br.com.fbd.sisaudiencia.business.IBusinessTipoDeAcao;
import br.com.fbd.sisaudiencia.business.IBusinessVara;
import br.com.fbd.sisaudiencia.excecoes.SalaDeAudienciaException;
import br.com.fbd.sisaudiencia.excecoes.TipoDeAcaoException;
import br.com.fbd.sisaudiencia.excecoes.VaraException;
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
public class Fachada implements IFachada{

    
    // Crie uma variavel de instancia para cada model utilizado.
    private IBusinessVara iBusinessVara;
    private IBusinessTipoDeAcao iBusinessTipoDeAcao;
    private IBusinessSalaDeAudiencia iBusinessSalaDeAudiencia;
    private IBusinessEstado iBusinessEstado;
    private IBusinessMunicipio iBusinessMunicipio;
    private IBusinessRegistroOAB iBusinessRegistroOAB;
    
    // O padrão de projeto de fachada é o singleton.
    private static Fachada instance;

    private Fachada() {
        this.iBusinessVara = new BusinessVara();
        this.iBusinessTipoDeAcao = new BusinessTipoDeAcao();
        this.iBusinessSalaDeAudiencia = new BusinessSalaDeAudiencia();
        this.iBusinessEstado = new BusinessEstado();
        this.iBusinessMunicipio = new BusinessMunicipio();
        this.iBusinessRegistroOAB = new BusinessRegistroOAB();
    }
    
    public static Fachada getInstance(){
        if(instance == null){
            instance = new Fachada();
        }
        return instance;
    }
    
     // Métodos de Vara
    @Override
    public boolean cadastrarVara(Vara vara) throws VaraException {
        // Note que aqui só chamamo o método que implementa a regra de negocio.
        // Que por tabela chamama o método que acessa o dao do objeto para
        // salvá-lo no BD.
        return iBusinessVara.cadastrarVara(vara);
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
    
    
    // Metodos de TipoDeAcao
    @Override
    public boolean cadastrarTipoDeAcao(TipoDeAcao tipoDeAcao) throws TipoDeAcaoException {
        return iBusinessTipoDeAcao.cadastrarTipoDeAcao(tipoDeAcao);
    }

    @Override
    public boolean removerTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoDeAcao buscarTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarTipoDeAcao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Metodos de SalaAudiencia

    @Override
    public boolean cadastrarSalaAudiencia(SalaAudiencia salaAudiencia) throws SalaDeAudienciaException {
        return this.iBusinessSalaDeAudiencia.cadastrarSalaAudiencia(salaAudiencia);
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
    
     // Métodos de Estado
    @Override
    public boolean carregarEstados() {
        return this.iBusinessEstado.carregarEstados();
    }
            
    @Override
    public Estado getEstado(Integer id) {
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
  
    // Métodos de Municípios   
    @Override
    public boolean carregarMunicipios() {
        return iBusinessMunicipio.carregarMunicipios();
    }

    @Override
    public Municipio getMunicipio(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipio> getAll(Integer idEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Métodos de endereço
    @Override
    public boolean cadastrarEndereco(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco buscarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco atualizarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removerEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> getEnderecos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Métodos de registro Oab

    @Override
    public boolean adicionarRegistroOab(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean recuperarRegistroOab(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistroOAB atualizarRegistroOAB(RegistroOAB r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistroOAB removerRegistroOAB(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
