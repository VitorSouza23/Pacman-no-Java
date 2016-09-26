/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.enuns;

/**
 *
 * @author Vitor
 */
public enum Teclado {
     CIMA(38), BAIXO(40), ESQUERDA(37), DIREITA(39), A(65), S(83), D(68), W(87), P(80), ENTER(13);

    public int valorTecla;

    Teclado(int valor) {
        this.valorTecla = valor;
    }
    
    public int getValorTecla(){
        return this.valorTecla;
    }
}
