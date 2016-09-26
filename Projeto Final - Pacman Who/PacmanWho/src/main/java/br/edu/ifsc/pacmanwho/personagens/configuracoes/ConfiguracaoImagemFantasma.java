/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.personagens.configuracoes;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Aluno
 */
public class ConfiguracaoImagemFantasma {
    public static List<Image> imagensFase1 = new ArrayList<>();
    public static List<Image> imagensFase2 = new ArrayList<>();
    public static List<Image> imagensFase3 = new ArrayList<>();
    public static List<Image> imagensFantasmasAssutados = new ArrayList<>();

    public ConfiguracaoImagemFantasma() {
        inserirImagnesDeFantasmas();
    }
    
    
    
    private static void inserirImagnesDeFantasmas() {
        Image imagem;
        //Nível 1
        imagem = new ImageIcon("conteudo\\icons\\dalek1.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase1.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\dalek2.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase1.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\dalek3.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase1.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\dalek4.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase1.add(imagem);

        //Nivel 2
        imagem = new ImageIcon("conteudo\\icons\\cybermen1.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase2.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\cybermen2.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase2.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\cybermen3.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase2.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\cybermen4.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase2.add(imagem);

        //Nivel 3
        imagem = new ImageIcon("conteudo\\icons\\anjoDePedra1.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase3.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\anjoDePedra2.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase3.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\anjoDePedra3.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase3.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\anjoDePedra4.png").getImage();
        ConfiguracaoImagemFantasma.imagensFase3.add(imagem);

        //Assutados
        imagem = new ImageIcon("conteudo\\icons\\dalekBranco.png").getImage();
        ConfiguracaoImagemFantasma.imagensFantasmasAssutados.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\cybermenBranco.png").getImage();
        ConfiguracaoImagemFantasma.imagensFantasmasAssutados.add(imagem);
        imagem = new ImageIcon("conteudo\\icons\\anjoDePedraBranco.png").getImage();
        ConfiguracaoImagemFantasma.imagensFantasmasAssutados.add(imagem);

    }
}
