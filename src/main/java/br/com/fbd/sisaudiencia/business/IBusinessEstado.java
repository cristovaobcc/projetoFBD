/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.business;

import br.com.fbd.sisaudiencia.model.Estado;
import java.util.List;

/**
 *
 * @author cristovao
 */
public interface IBusinessEstado {
    boolean carregarEstados();
    Estado getEstado(Integer id);
    List<Estado> getAll();
}
