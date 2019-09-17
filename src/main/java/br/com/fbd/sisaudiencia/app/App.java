/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.app;

import br.com.fbd.sisaudiencia.dao.DaoVara;
import br.com.fbd.sisaudiencia.fachada.Fachada;
import br.com.fbd.sisaudiencia.model.Vara;

/**
 *
 * @author cristovao
 */
public class App {
    
    public static void main(String[] args) {
        
        try {
            Fachada fachada = Fachada.getInstance();
            Vara vara = new Vara(1, "Forum ABC", "Rua dos Bobos, n. 0");
            fachada.cadastrarVara(vara);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
