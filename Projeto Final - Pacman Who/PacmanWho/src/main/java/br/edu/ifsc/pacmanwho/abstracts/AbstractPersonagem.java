/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.abstracts;

import br.edu.ifsc.pacmanwho.interfaces.IPersonagem;
import java.awt.Canvas;
import java.awt.Image;

/**
 *
 * @author Vitor
 */
public abstract class AbstractPersonagem implements IPersonagem{
    
    private int posicaoX = -1;
    private int posicaoY = -1;
    private int posicaoInicialX = -1;
    private int posicaoIncialY = -1;
    private Image image;

   

    @Override
    public abstract void mover();

    /**
     * @return the posicaoX
     */
    public int getPosicaoX() {
        return posicaoX;
    }

    /**
     * @param posicaoX the posicaoX to set
     */
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    /**
     * @return the posicaoY
     */
    public int getPosicaoY() {
        return posicaoY;
    }

    /**
     * @param posicaoY the posicaoY to set
     */
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    /**
     * @return the posicaoInicialX
     */
    public int getPosicaoInicialX() {
        return posicaoInicialX;
    }

    /**
     * @param posicaoInicialX the posicaoInicialX to set
     */
    public void setPosicaoInicialX(int posicaoInicialX) {
        this.posicaoInicialX = posicaoInicialX;
    }

    /**
     * @return the posicaoIncialY
     */
    public int getPosicaoIncialY() {
        return posicaoIncialY;
    }

    /**
     * @param posicaoIncialY the posicaoIncialY to set
     */
    public void setPosicaoIncialY(int posicaoIncialY) {
        this.posicaoIncialY = posicaoIncialY;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    
}
