/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoindividual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Leituras {
    Integer valorAleatorio = 0;
    Integer valorMinimo = 100;
    Integer valorMaximo = 0;
    Double media = 0.0;
    
    void sortearValor(){
        valorAleatorio = ThreadLocalRandom.current().nextInt(0,100);
        verifica();
        media+=valorAleatorio;
    }
    
    void verifica(){
        if(valorAleatorio<valorMinimo){
            valorMinimo=valorAleatorio;
        }
        
        if(valorAleatorio>valorMaximo){
            valorMaximo=valorAleatorio;
        }

    }
}
