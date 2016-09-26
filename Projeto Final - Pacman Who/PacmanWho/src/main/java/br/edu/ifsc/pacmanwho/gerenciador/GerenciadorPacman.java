/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.gerenciador;

import br.edu.ifsc.pacmanwho.enuns.Teclado;
import br.edu.ifsc.pacmanwho.personagens.Pacman;
import br.edu.ifsc.pacmanwho.personagens.configuracoes.ConfiguracaoImagemPacman;


/**
 *
 * @author Vitor
 */
public class GerenciadorPacman {
    private Pacman pacman;
    
    

    /**
     * @return the pacman
     */
    public Pacman getPacman() {
        return pacman;
    }

    /**
     * @param pacman the pacman to set
     */
    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }

    
    public void moverPacman(Teclado teclaApertada){
        switch(teclaApertada){
            case A:
                this.pacman.setSetaEsquerda(true);
                break;
            case ESQUERDA:
                this.pacman.setSetaEsquerda(true);
                break;
            case D:
                this.pacman.setSetaDireita(true);
                break;
            case DIREITA:
                this.pacman.setSetaDireita(true);
                break;
            case W:
                this.pacman.setSetaCima(true);
                break;
            case CIMA:
                this.pacman.setSetaCima(true);
                break;
            case S:
                this.pacman.setSetaBaixo(true);
                break;
            case BAIXO:
                this.pacman.setSetaBaixo(true);
                break;
                
        }
        this.pacman.mover();
    }
    
    public void criarpacman(int posicaoInicialX, int posicaoInicialY){
        this.pacman = new Pacman(posicaoInicialX, posicaoInicialY);
        this.pacman.setImage(ConfiguracaoImagemPacman.imagemPacman);
    }
    
    
    
    
    
    
}
