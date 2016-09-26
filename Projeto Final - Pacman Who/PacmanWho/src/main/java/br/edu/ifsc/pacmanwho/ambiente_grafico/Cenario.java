/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.ambiente_grafico;

/**
 *
 * @author Vitor
 */
public class Cenario {

    public static final int LARGURA = 27;
    public static final int INTERVALO = 200;
    public static final int[][] mapa = null;
    public static int numeroDeLinhasY = 0;
    public static int numeroDeColunasX = 0;
    
    
    

    public enum ValoresCenario {

        VAZIO(0), PAREDE(1), PONTO_PODER(2), FANTASMA(3), PACMAN(4), PONTO(5), PAREDE_BRANCA(6);

        private int valorDirecao;

        ValoresCenario(int valor) {
            this.valorDirecao = valor;
        }

        public int getValorCenario() {
            return this.valorDirecao;
        }
    }

    
}
