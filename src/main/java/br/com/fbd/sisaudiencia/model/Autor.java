/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.model;

import java.util.ArrayList;

/**
 *
 * @author cristovao
 */
// TODO: Avaliar se a implementação desta forma é o suficiente.
public class Autor extends PessoaFisica{
    
    private ArrayList<Processo> processos; // Faz sentido Autor ter arraylist de processos?

    public Autor(String CPF, String nome) {
        super(CPF, nome);
        processos = new ArrayList<>();
    }

    public ArrayList<Processo> getProcessos() {
        return processos;
    }     

    @Override
    public String toString() {
        // TODO: implementar a impressão de todos os processos vinculados ao autor.
        return "Autor{" + "processos=" + processos + '}';
    }
    
    
}
