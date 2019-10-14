/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.sisaudiencia.excecoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cristovao
 */
public class TratadorExcecaoComRegex {
    
    /**
     * Método para verificar se uma determinada Exception contém o regex passado.
     * 
     * @param exception Exception
     * @param regex 
     * @return true se a regex for encontrada no toString da exception e false
     * caso contrário.
     */
    public static boolean executarPadrao(Exception exception, String regex ){
        StringBuilder textoAlvo = new StringBuilder(exception.toString());
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(textoAlvo);
        
        while(m.find()){
            return true;
        }
                    
        return false;
    }
    
}
