/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.gerenciador;

import br.edu.ifsc.pacmanwho.dao.JogadorDAO;
import br.edu.ifsc.pacmanwho.jogador.Jogador;
import java.io.IOException;

/**
 *
 * @author Vitor
 */
public class GerenciadorJogador {
     private final JogadorDAO jogadorDao;

    public GerenciadorJogador() {
        this.jogadorDao = new JogadorDAO();
    }
    
    public void adicionarJogador(Jogador jogador){
        this.jogadorDao.adicionarJogador(jogador);
    }
    
    public void salvar() throws IOException{
        this.jogadorDao.salvar();
    }
    
    public void recuperar() throws IOException{
        this.jogadorDao.recuperar();
    }
    
    public String getRankingDeJogadores(){
        return this.jogadorDao.getRankingDeJogadores();
    }
     
     
}
