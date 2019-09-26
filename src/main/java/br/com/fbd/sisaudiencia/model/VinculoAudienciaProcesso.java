/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

/**
 *
 * @author cristovao
 */
// TODO: estudar como utilizar essa classe.
public class VinculoAudienciaProcesso {
    private Integer id;
    private Integer idAudiencia;
    private Integer idProcesso;

    public VinculoAudienciaProcesso(Integer id, Integer idAudiencia, Integer idProcesso) {
        this.id = id;
        this.idAudiencia = idAudiencia;
        this.idProcesso = idProcesso;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdAudiencia() {
        return idAudiencia;
    }

    public Integer getIdProcesso() {
        return idProcesso;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdAudiencia(Integer idAudiencia) {
        this.idAudiencia = idAudiencia;
    }

    public void setIdProcesso(Integer idProcesso) {
        this.idProcesso = idProcesso;
    }

    @Override
    public String toString() {
        return "VinculoAudienciaProcesso{" + "id=" + id + ", idAudiencia=" + idAudiencia + ", idProcesso=" + idProcesso + '}';
    }

       
}
