/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.personagens;

import br.edu.ifsc.pacmanwho.abstracts.AbstractPersonagem;
import br.edu.ifsc.pacmanwho.ambiente_grafico.Cenario;
import br.edu.ifsc.pacmanwho.nivel.Nivel;
import java.awt.Image;

/**
 *
 * @author Vitor
 */
public class Pacman extends AbstractPersonagem{
    
private boolean setaDireita;
private boolean setaEsquerda;
private boolean setaBaixo;
private boolean setaCima;



    public Pacman() {
        this.setaBaixo = false;
        this.setaCima = false;
        this.setaDireita = false;
        this.setaEsquerda = false;
    }
    
    public Pacman(int posicaoIncialX, int posicaoIncialY){
        this.setaBaixo = false;
        this.setaCima = false;
        this.setaDireita = false;
        this.setaEsquerda = false;
        this.setPosicaoX(posicaoIncialX);
        this.setPosicaoY(posicaoIncialY);
    }

    

    @Override
    public void mover() {
        if(this.setaDireita){
            this.setaDireita = false;
            if(Nivel.fase == 1){
                if(this.getPosicaoX() - 1 >= 0){
                    if(Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() - 1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoX(this.getPosicaoX() - 1);
                    }
                }else if(Cenario.mapa[this.getPosicaoY()][Cenario.numeroDeColunasX -  1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoX(Cenario.numeroDeColunasX - 1);
                    //Som da tardis aqui
                }
            }else{
                if(this.getPosicaoX() + 1 < Cenario.numeroDeColunasX){
                    if(Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() + 1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoX(this.getPosicaoX() + 1);
                    }
                }else if(Cenario.mapa[this.getPosicaoY()][0] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoX(0);
                    //Som da tardis aqui
                }
            }
        }
        if(this.setaEsquerda){
            this.setaEsquerda = false;
            if(Nivel.fase == 1){
                if(this.getPosicaoX() + 1 < Cenario.numeroDeColunasX){
                    if(Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() + 1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoX(this.getPosicaoX() + 1);
                    }
                }else if(Cenario.mapa[this.getPosicaoY()][0] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoX(0);
                    //Som da tardis aqui
                }
            }else{
                if(this.getPosicaoX() - 1 >= 0){
                    if(Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() - 1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoX(this.getPosicaoX() - 1);
                    }
                }else if(Cenario.mapa[this.getPosicaoY()][Cenario.numeroDeColunasX - 1] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoX(Cenario.numeroDeColunasX - 1);
                    //Som da tardis aqui
                }
            }
        }
        if(this.setaCima){
            this.setaCima = false;
            if(Nivel.fase == 1){
                if(this.getPosicaoY() + 1 < Cenario.numeroDeLinhasY){
                    if(Cenario.mapa[this.getPosicaoY() + 1][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoY(this.getPosicaoY() + 1);
                    }
                }else if(Cenario.mapa[0][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoY(0);
                    //Som da tardis aqui
                }
            }else{
                if(this.getPosicaoY() - 1 >= 0){
                    if(Cenario.mapa[this.getPosicaoY() -  1][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoY(this.getPosicaoY() - 1);
                    }
                }else if(Cenario.mapa[Cenario.numeroDeLinhasY][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoY(Cenario.numeroDeLinhasY - 1);
                    //Som da tardis aqui
                }
            }
        }
        if(this.setaBaixo){
            this.setaBaixo = false;
            if(Nivel.fase == 1){
                if(this.getPosicaoY() - 1 >= 0){
                    if(Cenario.mapa[this.getPosicaoY() - 1][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoY(this.getPosicaoY() - 1);
                    }
                }else if(Cenario.mapa[Cenario.numeroDeLinhasY - 1][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoY(Cenario.numeroDeLinhasY - 1);
                    //Som da tardis aqui
                }
            }else{
                if(this.getPosicaoY() + 1 < Cenario.numeroDeLinhasY){
                    if(Cenario.mapa[this.getPosicaoY() + 1][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                        this.setPosicaoY(this.getPosicaoY() + 1);
                    }
                }else if(Cenario.mapa[0][this.getPosicaoX()] != Cenario.ValoresCenario.PAREDE.getValorCenario()){
                    this.setPosicaoY(0);
                    //Som da tardis aqui
                }
            }
        }
        
    }

    /**
     * @return the setaDireita
     */
    public boolean isSetaDireita() {
        return setaDireita;
    }

    /**
     * @param setaDireita the setaDireita to set
     */
    public void setSetaDireita(boolean setaDireita) {
        this.setaDireita = setaDireita;
    }

    /**
     * @return the setaEsquerda
     */
    public boolean isSetaEsquerda() {
        return setaEsquerda;
    }

    /**
     * @param setaEsquerda the setaEsquerda to set
     */
    public void setSetaEsquerda(boolean setaEsquerda) {
        this.setaEsquerda = setaEsquerda;
    }

    /**
     * @return the setaBaixo
     */
    public boolean isSetaBaixo() {
        return setaBaixo;
    }

    /**
     * @param setaBaixo the setaBaixo to set
     */
    public void setSetaBaixo(boolean setaBaixo) {
        this.setaBaixo = setaBaixo;
    }

    /**
     * @return the setaCima
     */
    public boolean isSetaCima() {
        return setaCima;
    }

    /**
     * @param setaCima the setaCima to set
     */
    public void setSetaCima(boolean setaCima) {
        this.setaCima = setaCima;
    }

   
    
    

 
    
}
