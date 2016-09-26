/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.gerenciador;

import br.edu.ifsc.pacmanwho.personagens.Fantasma;
import br.edu.ifsc.pacmanwho.personagens.configuracoes.ConfiguracaoImagemFantasma;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Vitor
 */
public class GerenciadorFantasmas {
    private List<Fantasma> fantasmas;
   

    public GerenciadorFantasmas() {
        this.fantasmas = new ArrayList<>();
    }
    
    

    /**
     * @return the fantasmas
     */
    public List<Fantasma> getFantasmas() {
        return fantasmas;
    }

    /**
     * @param fantasmas the fantasmas to set
     */
    public void setFantasmas(List<Fantasma> fantasmas) {
        this.fantasmas = fantasmas;
    }

   
    
    public void moverFantasmas(){
        for (Fantasma fantasma : fantasmas) {
            fantasma.mover();
        }
    }
    
    public void criarFantasma(int numeroFantasma, int posicaoInicialX, int posicaoInicialY){
        this.fantasmas.add(new Fantasma(ConfiguracaoImagemFantasma.imagensFantasmasAssutados.get(numeroFantasma), posicaoInicialX, posicaoInicialY));
    }
}
