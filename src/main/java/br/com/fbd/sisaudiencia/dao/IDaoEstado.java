/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.Estado;
import br.com.fbd.sisaudiencia.model.Municipio;
import java.util.List;

/**
 * Estados que serão carregados para a UI.
 * @author cristovao
 */
public interface IDaoEstado {
    boolean carregarEstados();
    Estado getEstado(Integer id);
    List<Estado> getAll();
    List<Municipio> getMunicipios();
}
