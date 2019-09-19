/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.excecoes;

/**
 *
 * @author cristovao
 */
public class SalaDeAudienciaException extends Exception{

    public SalaDeAudienciaException(String message) {
        throw new IllegalArgumentException(message);
    }
    
}
