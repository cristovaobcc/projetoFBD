/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.dao;

import br.com.fbd.sisaudiencia.model.VinculoAudienciaProcesso;

/**
 *
 * @author cristovao
 */
// TODO: Observar se os parametros de recuperar, atualizar e remover deve 
// permanecer como estar
public interface IDaoVinculoAudienciaProcesso {
    boolean adicionarVinculoAudienciaProcesso(VinculoAudienciaProcesso a);
    VinculoAudienciaProcesso recupergarVinculoAudienciaProcesso(Integer numero);
    VinculoAudienciaProcesso atualizarVinculoAudienciaProcesso(Integer numero);
    boolean removerVinculoAudienciaProcesso(Integer numero);
}
