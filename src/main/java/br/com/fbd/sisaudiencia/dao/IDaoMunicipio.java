/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Municipio;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IDaoMunicipio {
    boolean carregarMunicipios();
    Municipio getMunicipio(Integer id);
    List<Municipio> getAll(Integer idEstado);
    
}
