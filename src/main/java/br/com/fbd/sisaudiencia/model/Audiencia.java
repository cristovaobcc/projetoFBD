/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author cristovao
 */
public class Audiencia {
    
    private Integer id;
    private LocalDate dataAudiencia;
    private String turno; // TODO: ver qual melhor forma de representar o turno.
    private Integer qtdeProcessosMarcados;
    private Integer qtdeProcessosAMarcar;
    private Integer idVara;
    private ArrayList<Processo> processos;

    public Audiencia(LocalDate dataAudiencia, String turno, 
            Integer qtdeProcessosMarcados, Integer qtdeProcessosAMarcar, 
            Integer idVara) {
        this.dataAudiencia = dataAudiencia;
        this.turno = turno;
        this.qtdeProcessosMarcados = qtdeProcessosMarcados;
        this.qtdeProcessosAMarcar = qtdeProcessosAMarcar;
        this.idVara = idVara;
        this.processos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDataAudiencia() {
        return dataAudiencia;
    }

    public String getTurno() {
        return turno;
    }

    public Integer getQtdeProcessosMarcados() {
        return qtdeProcessosMarcados;
    }

    public Integer getQtdeProcessosAMarcar() {
        return qtdeProcessosAMarcar;
    }

    public Integer getIdVara() {
        return idVara;
    }

    public ArrayList<Processo> getProcessos() {
        return processos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataAudiencia(LocalDate dataAudiencia) {
        this.dataAudiencia = dataAudiencia;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setQtdeProcessosMarcados(Integer qtdeProcessosMarcados) {
        this.qtdeProcessosMarcados = qtdeProcessosMarcados;
    }

    public void setQtdeProcessosAMarcar(Integer qtdeProcessosAMarcar) {
        this.qtdeProcessosAMarcar = qtdeProcessosAMarcar;
    }

    public void setIdVara(Integer idVara) {
        this.idVara = idVara;
    }

    public void setProcessos(ArrayList<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "Audiencia{" + "id=" + id + ", dataAudiencia=" + dataAudiencia + 
                ", turno=" + turno + ", qtdeProcessosMarcados=" + 
                qtdeProcessosMarcados + ", qtdeProcessosAMarcar=" + 
                qtdeProcessosAMarcar + ", idVara=" + idVara + 
                ", processos=" + processos + '}';
    }

   
}
