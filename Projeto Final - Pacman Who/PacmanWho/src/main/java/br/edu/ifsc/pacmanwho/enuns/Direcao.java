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
public enum Direcao {

    NAO_DEFINIDA(-1), CIMA(0), BAIXO(1), ESQUERDA(2), DIREITA(3);

    private final int valorDirecao;

    Direcao(int valor) {
        this.valorDirecao = valor;
    }
    
    public int getValorDirecao(){
        return this.valorDirecao;
    }
}
