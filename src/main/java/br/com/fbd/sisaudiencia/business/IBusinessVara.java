/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;


import br.com.fbd.sisaudiencia.excecoes.VaraException;
import br.com.fbd.sisaudiencia.model.Vara;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IBusinessVara {
    // Dúvida: melhor lançar uma exceção por método ou lançar colocar throw na
    // interface? Estudar excecoes para esclarecer.
    boolean cadastrarVara(Vara vara) throws VaraException;
    boolean removerVara(Integer id);
    Vara atualizar(Integer id);
    Vara buscarVara(Integer id);
    List<Vara> getVaras();
    
    
}
