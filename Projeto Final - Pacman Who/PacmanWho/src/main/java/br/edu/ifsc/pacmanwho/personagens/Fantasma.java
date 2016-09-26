/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.personagens;

import br.edu.ifsc.pacmanwho.abstracts.AbstractPersonagem;
import br.edu.ifsc.pacmanwho.ambiente_grafico.Cenario;
import br.edu.ifsc.pacmanwho.enuns.Direcao;
import java.awt.Image;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Vitor
 */
public class Fantasma extends AbstractPersonagem {

    public static final double CHANCE_DE_MOVIMENTO = (double) 0.5;

    

    private Direcao direcaoAtual;
    private List<Direcao> direcoes;
    private int assutado;
    private Image imagem;

    public Fantasma() {
        this.direcoes = new ArrayList<>();
        this.direcaoAtual = Direcao.NAO_DEFINIDA;
        this.assutado = 0;
    }

    public Fantasma(Image imagem, int posicaoInicialX, int posicaoInicialY) {
        this.direcaoAtual = Direcao.NAO_DEFINIDA;
        this.direcoes = new ArrayList<>();
        this.assutado = 0;
        this.imagem = imagem;
        this.setPosicaoInicialX(posicaoInicialX);
        this.setPosicaoIncialY(posicaoInicialY);
        this.setPosicaoX(posicaoInicialX);
        this.setPosicaoY(posicaoInicialY);
    }

    @Override
    public void mover() {
        if(this.assutado > 0){
            this.assutado--;
        }
        this.checarDirecoes();
        Direcao movimento = Direcao.NAO_DEFINIDA;
        double aleatorio = Math.random();
        if(aleatorio < Fantasma.CHANCE_DE_MOVIMENTO || this.direcoes.size() == 1){
            movimento = this.direcoes.get(0);
        }else{
            double chance = (1 - Fantasma.CHANCE_DE_MOVIMENTO) / (this.direcoes.size() - 1);
            for(int possivelMovimento = 0; possivelMovimento < this.direcoes.size(); possivelMovimento++){
                if(aleatorio < Fantasma.CHANCE_DE_MOVIMENTO + (possivelMovimento * chance)){
                    movimento = this.direcoes.get(possivelMovimento);
                    break;
                }
            }
        }
        this.direcaoAtual = movimento;
        switch(movimento){
            case CIMA:
                this.setPosicaoY(this.getPosicaoY() -  1);
                break;
                
            case BAIXO:
                this.setPosicaoY(this.getPosicaoY() + 1);
                break;
                
            case ESQUERDA:
                this.setPosicaoX(this.getPosicaoX() - 1);
                break;
                
            case DIREITA:
                this.setPosicaoX(this.getPosicaoX() + 1);
                break;
        }
    }

    /**
     * @return the direcaoAtual
     */
    public Direcao getDirecaoAtual() {
        return direcaoAtual;
    }

    /**
     * @param direcaoAtual the direcaoAtual to set
     */
    public void setDirecaoAtual(Direcao direcaoAtual) {
        this.direcaoAtual = direcaoAtual;
    }

    public void checarDirecoes() {
        //Limpar array de direções
        this.direcoes = new ArrayList<>();
        if (this.direcaoAtual != Direcao.NAO_DEFINIDA) {
            this.direcoes.add(direcaoAtual);
        }
        if (this.direcaoAtual != Direcao.CIMA && this.direcaoAtual != Direcao.BAIXO) { //Evita q os fantasma dem o retono e fiquem se movendo no mesmo lugar
            this.direcoes.add(Direcao.CIMA);
            this.direcoes.add(Direcao.BAIXO);
        }

        if (this.direcaoAtual != Direcao.ESQUERDA && this.direcaoAtual != Direcao.DIREITA) { //Evita q os fantasma dem o retono e fiquem se movendo no mesmo lugar
            this.direcoes.add(Direcao.ESQUERDA);
            this.direcoes.add(Direcao.DIREITA);
        }

        int indice = 0;
        while (indice < this.direcoes.size()) {
            boolean remover = false;
            switch (this.direcoes.get(indice)) {
                case CIMA:
                    if (this.getPosicaoY() <= 1) {
                        remover = true;
                    } else {
                        if (Cenario.mapa[this.getPosicaoY() - 1][this.getPosicaoX()] == Cenario.ValoresCenario.PAREDE.getValorCenario()) {
                            remover = true;
                        }
                    }
                    break;

                case BAIXO:
                    if (this.getPosicaoY() >= Cenario.numeroDeLinhasY - 2) {
                        remover = true;
                    } else {
                        if (Cenario.mapa[this.getPosicaoY() + 1][this.getPosicaoX()] == Cenario.ValoresCenario.PAREDE.getValorCenario()) {
                            remover = true;
                        }
                    }
                    break;

                case ESQUERDA:
                    if (this.getPosicaoX() <= 1) {
                        remover = true;
                    } else {
                        if (Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() - 1] == Cenario.ValoresCenario.PAREDE.getValorCenario()) {
                            remover = true;
                        }
                    }
                    break;
                    
                case DIREITA:
                    if(this.getPosicaoX() >= Cenario.numeroDeColunasX - 2){
                        remover = true;
                    }else{
                        if(Cenario.mapa[this.getPosicaoY()][this.getPosicaoX() + 1] == Cenario.ValoresCenario.PAREDE.getValorCenario()){
                            remover = true;
                        }
                    }
                    break; 
            }//Fim do switch
            if(remover){
                this.direcoes.remove(indice);
            }else{
                indice++;
            }
        }
    }

    public void assustar() {
        this.assutado =  30;
        switch(this.direcaoAtual){
            case CIMA:
                this.direcaoAtual = Direcao.BAIXO;
                break;
                
            case BAIXO:
                this.direcaoAtual = Direcao.CIMA;
                break;
                
            case ESQUERDA:
                this.direcaoAtual = Direcao.DIREITA;
                break;
                
            case DIREITA:
                this.direcaoAtual = Direcao.ESQUERDA;
                break;
        }
    }

    public void devorado() {
        this.assutado = 0;
        this.setPosicaoX(this.getPosicaoInicialX());
        this.setPosicaoY(this.getPosicaoY());
    }

    /**
     * @return the direcoes
     */
    public List<Direcao> getDirecoes() {
        return direcoes;
    }

    /**
     * @param direcoes the direcoes to set
     */
    public void setDirecoes(List<Direcao> direcoes) {
        this.direcoes = direcoes;
    }

    /**
     * @return the assutado
     */
    public int getAssutado() {
        return assutado;
    }

    /**
     * @param assutado the assutado to set
     */
    public void setAssutado(int assutado) {
        this.assutado = assutado;
    }

    /**
     * @return the imagem
     */
    public Image getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    

}
