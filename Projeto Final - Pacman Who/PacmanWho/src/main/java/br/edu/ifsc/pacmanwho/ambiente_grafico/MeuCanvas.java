/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.ambiente_grafico;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;



/**
 *
 * @author Vitor
 */
public class MeuCanvas extends Canvas{
    @Override
    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.clearRect(0, 0, AtributosDaTela.LARGURA, AtributosDaTela.ALTURA);
        for(int y = 0; y < Cenario.numeroDeLinhasY; y++){
            for(int x = 0; x < Cenario.numeroDeColunasX; x++){
                
            }
        }
    }
}
