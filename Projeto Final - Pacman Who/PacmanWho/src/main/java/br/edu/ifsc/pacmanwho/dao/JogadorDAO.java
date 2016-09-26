/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.dao;

import br.edu.ifsc.pacmanwho.jogador.Jogador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class JogadorDAO {
    
    private List<Jogador> jogadores;

    public JogadorDAO() {
        this.jogadores = new ArrayList<>();
    }
    
    public void adicionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
    
    public void salvar() throws IOException{
        ConversorJSON.javaToJason(jogadores);
    }
    
    public void recuperar() throws IOException{
        this.jogadores = ConversorJSON.jsonToJava();
    }
    
    private void ordenarRankingJogadores(){
        this.jogadores.sort((j1, j2) -> Integer.compare(j1.getPontuacao(), j2.getPontuacao()));
        Collections.reverse(jogadores);
    }
    
    public String getRankingDeJogadores(){
        this.ordenarRankingJogadores();
        String ranking = "";
        for(int x = 0; x < this.jogadores.size(); x++){
            ranking += x + "º - " + this.jogadores.get(x).getNome() + " Pontuação: " + this.jogadores.get(x).getPontuacao();
        }
        
        return ranking;
    }
    

    /**
     * @return the jogadores
     */
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    /**
     * @param jogadores the jogadores to set
     */
    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
